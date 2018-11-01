package org.cnam.simple.controller;


import org.cnam.simple.domain.Simple;
import org.cnam.simple.dto.NewSimpleDto;
import org.cnam.simple.dto.SimpleDto;
import org.cnam.simple.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    @Autowired             //injection dependance
    private SimpleService simpleService;

    @PostMapping("/create") //uri : simple/create
    @ResponseBody
    public SimpleDto createNewSimple(@RequestBody NewSimpleDto newSimpleDto){
        Simple simple =  simpleService.createNewSimple(newSimpleDto.data);

        return  new SimpleDto(simple.id,simple.data);
    }

    @GetMapping ("/get/{id}")
    @ResponseBody
    public SimpleDto getSimple(@PathVariable("id") Long id){
        Simple simple =  simpleService.getSimple(id);

        return  new SimpleDto(simple.id,simple.data);
    }
}
