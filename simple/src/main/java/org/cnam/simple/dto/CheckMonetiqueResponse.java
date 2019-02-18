package org.cnam.simple.dto;

public class CheckMonetiqueResponse {
    public boolean isValid;
    public String message;

    public CheckMonetiqueResponse(){}

    public  CheckMonetiqueResponse(boolean isValid, String message){
        this.isValid = isValid;
        this.message = message;
    }
}
