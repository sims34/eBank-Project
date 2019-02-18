package org.cnam.simple.model;


import jdk.internal.org.objectweb.asm.commons.RemappingAnnotationAdapter;

import javax.persistence.*;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@Entity
@Table(name="CarteBleu")
public class CarteBleuModel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name ="idCarteBleu")
    private UUID idCarteBleu;

    @Column(name ="idCompte")
    private UUID idCompte;

    @Column(name ="mdp")
    private int mdp;
    @Column(name ="create")
    private String create;
    @Column(name ="expire")
    private String expire;

    public CarteBleuModel() {
    }

    public CarteBleuModel(UUID idCompte) {
        this.id= this.setId();
        this.idCompte = idCompte;
        this.idCarteBleu = this.setIdCarteBleu();
        this.mdp = this.setMdp();
        this.create = this.setCreate();
        this.expire = this.setExpire();
    }

    public Long getId() {
        return id;
    }
    public Long setId() {
        return new Long(1234423132);
    }

    public UUID getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(UUID idCompte) {
        this.idCompte = idCompte;
    }

    public UUID getIdCarteBleu() {
        return idCarteBleu;
    }

    public UUID setIdCarteBleu() {
        return this.idCarteBleu = UUID.randomUUID();
    }

    public int getMdp() {
        return mdp;
    }

    public int setMdp() {
        int randomNumber = new Random().nextInt(9000) + 1000;
        return randomNumber;
    }

    public String getCreate() {
        return create;
    }

    public String setCreate() {
        return new String("08/09/2019");
    }

    public String getExpire() {
        return expire;
    }

    public String setExpire() {
        return new String("09/21");
    }
}
