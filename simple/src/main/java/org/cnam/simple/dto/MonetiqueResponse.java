package org.cnam.simple.dto;

import org.cnam.simple.service.MonetiqueService;

import java.util.UUID;

public class MonetiqueResponse {

    public UUID idCarte;
    public int mdp;

    public MonetiqueResponse(){}

    public MonetiqueResponse(UUID idCarte, int mdp){
        this.idCarte = idCarte;
        this.mdp = mdp;
    }
}
