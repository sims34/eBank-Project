package org.cnam.simple.controller;

import org.cnam.simple.domain.CarteBleu;
import org.cnam.simple.dto.CheckMonetiqueRequest;
import org.cnam.simple.dto.CheckMonetiqueResponse;
import org.cnam.simple.dto.MonetiqueRequest;
import org.cnam.simple.dto.MonetiqueResponse;
import org.cnam.simple.service.MonetiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/monetique")
public class MonetiqueController {

    @Autowired
    MonetiqueService monetiqueService;

    @PostMapping("/create")
    @ResponseBody
    public MonetiqueResponse createCB(@RequestBody MonetiqueRequest monetiqueRequest){
        CarteBleu createCB = monetiqueService.createNewCB(monetiqueRequest.idCompte);

        return new MonetiqueResponse(   createCB.idCarte,
                                        createCB.mdp,
                                        createCB.dateExpire,
                                        createCB.dateCreate);
    }

    @GetMapping("{idCarte}/pay")
    public CheckMonetiqueResponse getCarteCB(@PathVariable("idCarte") UUID idCarte) {
        CarteBleu getCB = monetiqueService.getCarteBleu(idCarte);

        return new CheckMonetiqueResponse(getCB.isValid, getCB.message);
    }
}
