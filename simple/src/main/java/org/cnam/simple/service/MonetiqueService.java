package org.cnam.simple.service;

import org.cnam.simple.domain.CarteBleu;
import org.cnam.simple.model.CarteBleuModel;
import org.cnam.simple.repository.CarteBleuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.util.resources.cldr.es.CalendarData_es_AR;

import java.util.List;
import java.util.UUID;

@Service
public class MonetiqueService {

    @Autowired
    CarteBleuRepository carteBleuRepository;

    public CarteBleu createNewCB(UUID idCompte){
        CarteBleuModel carteBleuModel = new CarteBleuModel(idCompte);
        CarteBleuModel carteBleuModelSaved = carteBleuRepository.save(carteBleuModel);

        return new CarteBleu(
                        carteBleuModelSaved.getIdCarteBleu(),
                        carteBleuModel.getMdp(),
                        carteBleuModel.getExpire());
    }


    public CarteBleu getCarteBleu(UUID idCarte) {
       // String id = idCarte.toString();
        CarteBleuModel carteBleuModelFound = carteBleuRepository.findByIdCarteBleu(idCarte);

        return new CarteBleu(
                carteBleuModelFound.getIdCarteBleu(),
                carteBleuModelFound.getMdp(),
                carteBleuModelFound.getExpire());
    }




}
