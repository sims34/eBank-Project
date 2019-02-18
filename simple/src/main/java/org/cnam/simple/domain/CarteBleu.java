package org.cnam.simple.domain;

import java.util.UUID;

public class CarteBleu {

    public UUID idCarte;
    public int mdp;
    public boolean isValid;
    public String message;
    public String dateExpire;

    public CarteBleu(){}

    public CarteBleu(UUID idCarte, int mdp, String dateExpire){

        this.mdp = mdp;
        this.idCarte = idCarte;
        this.isValid = true;
        this.dateExpire = dateExpire;
        this.message = "Votre carte est valide, Attention expiration prévue : " +dateExpire;
    }

}
