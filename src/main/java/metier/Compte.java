package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {


    private int code ;
    private double solde ;
    @XmlTransient
    private Date datecreat;
    public Compte(int code, double solde, Date datecreat) {

        this.code = code;
        this.solde = solde;
        this.datecreat = datecreat;
    }
    public Compte() {


    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Date getDatecreat() {
        return datecreat;
    }
    public void setDatecreat(Date datecreat) {
        this.datecreat = datecreat;
    }}
