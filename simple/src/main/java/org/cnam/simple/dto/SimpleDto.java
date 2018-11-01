package org.cnam.simple.dto;

public class SimpleDto {

    public Long id;
    public String data;

    public SimpleDto(){

    }
    public SimpleDto(Long id, String data) {
        this.id = id;
        this.data = data;
    }
}
