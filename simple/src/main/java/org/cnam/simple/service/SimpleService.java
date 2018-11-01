package org.cnam.simple.service;

import org.cnam.simple.domain.Simple;
import org.cnam.simple.model.SimpleModel;
import org.cnam.simple.repository.SimpleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {



    @Autowired
    SimpleRepository simpleRepository;

    public Simple createNewSimple(String data){

        SimpleModel simpleModel = new SimpleModel(data);
        SimpleModel simpleModelSaved = simpleRepository.save(simpleModel);

        return new Simple(simpleModelSaved.getId(), simpleModelSaved.getData());
    }

    public Simple getSimple(Long id){

        SimpleModel simpleModelFound  = simpleRepository.getOne(id);

        return new Simple(simpleModelFound.getId(), simpleModelFound.getData());   }

}
