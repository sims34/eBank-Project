package org.cnam.simple.domain;

import java.util.UUID;

public class CarteBleu {

    public UUID idCarte;
    public int mdp;
    public boolean isValid;
    public String message;
    public String dateExpire;
    public String dateCreate;


    public CarteBleu(){}

    public CarteBleu(UUID idCarte, int mdp, String dateExpire, String dateCreate){

        this.mdp = mdp;
        this.idCarte = idCarte;
        this.isValid = true;
        this.dateExpire = dateExpire;
        this.dateCreate = dateCreate;
        this.message = this.message(this.isValid);

    }

    public String message(boolean isValid){
        StringBuilder sb = new StringBuilder();
        if(isValid) {
            sb.append("Votre carte est valide, Attention expiration prévue : " +dateExpire);
            return sb.toString();
        }
        sb.append("Votre carte n'est pas valide");
        return sb.toString();
    }

}
