package org.cnam.simple.dto;

import java.util.UUID;

public class MonetiqueRequest {
    public UUID idCompte;

    public MonetiqueRequest(){

    }

    public MonetiqueRequest(UUID idCompte){
        this.idCompte = idCompte;
    }
}
