package org.cnam.simple.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="CarteBleu")
public class CarteBleuModel {

    private Long idCompte;
    private UUID idCarteBleu;
    private String mdp;
    private Date create;
    private Date expire;

    public CarteBleuModel() {
    }

    public CarteBleuModel(Long idCompte, String mdp, Date create, Date expire) {
        this.idCompte = idCompte;
        this.idCarteBleu = this.setIdCarteBleu();
        this.mdp = mdp;
        this.create = create;
        this.expire = expire;
    }

    public Long getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Long idCompte) {
        this.idCompte = idCompte;
    }

    public UUID getIdCarteBleu() {
        return idCarteBleu;
    }

    public UUID setIdCarteBleu() {
        return this.idCarteBleu = UUID.randomUUID();
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }
}
