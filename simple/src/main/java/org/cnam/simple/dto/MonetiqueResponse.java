package org.cnam.simple.dto;

import org.cnam.simple.service.MonetiqueService;

import java.util.UUID;

public class MonetiqueResponse {

    public UUID idCarte;
    public int mdp;
    public String dateCreate;
    public String dateExpire;

    public MonetiqueResponse(){}

    public MonetiqueResponse(UUID idCarte, int mdp, String dateExpire, String dateCreate){
        this.idCarte = idCarte;
        this.mdp = mdp;
        this.dateExpire = dateExpire;
        this.dateCreate = dateCreate;

    }
}
