package org.cnam.simple.model;


import javax.persistence.*;

@Entity
@Table(name ="simple")
public class SimpleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name ="data")
    private String data;

    public SimpleModel() {
    }

    public SimpleModel( String data) {

        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
