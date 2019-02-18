package org.cnam.simple.dto;

import java.util.UUID;

public class CheckMonetiqueRequest {

    public UUID idCarte;

    public CheckMonetiqueRequest(){}

    public  CheckMonetiqueRequest(UUID idCarte){
        this.idCarte = idCarte;
    }
}
