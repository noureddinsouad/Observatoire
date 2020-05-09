/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.observatoire.entitie;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author nos
 */
@Entity
@Table(name = "cooperative")
@NamedQueries({
    @NamedQuery(name = "Cooperative.findAll", query = "SELECT c FROM Cooperative c")})
public class Cooperative implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cooperative")
    private Double idCooperative;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroTPI")
    private double numeroTPI;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AdresseActuelle")
    private String adresseActuelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombreAdherents")
    private int nombreAdherents;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Telephone")
    private int telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SecteurActivite")
    private String secteurActivite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Region")
    private String region;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_president")
    private double idPresident;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "branche")
    private String branche;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "province")
    private String province;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fax")
    private int fax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateCreation")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datedeclaration")
    @Temporal(TemporalType.DATE)
    private Date datedeclaration;

    public Cooperative() {
    }

    public Cooperative(Double idCooperative) {
        this.idCooperative = idCooperative;
    }

    public Cooperative(Double idCooperative, String nom, double numeroTPI, String adresseActuelle, int nombreAdherents, int telephone, String secteurActivite, String region, double idPresident, String branche, String province, int fax, Date dateCreation, Date datedeclaration) {
        this.idCooperative = idCooperative;
        this.nom = nom;
        this.numeroTPI = numeroTPI;
        this.adresseActuelle = adresseActuelle;
        this.nombreAdherents = nombreAdherents;
        this.telephone = telephone;
        this.secteurActivite = secteurActivite;
        this.region = region;
        this.idPresident = idPresident;
        this.branche = branche;
        this.province = province;
        this.fax = fax;
        this.dateCreation = dateCreation;
        this.datedeclaration = datedeclaration;
    }

    public Double getIdCooperative() {
        return idCooperative;
    }

    public void setIdCooperative(Double idCooperative) {
        this.idCooperative = idCooperative;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getNumeroTPI() {
        return numeroTPI;
    }

    public void setNumeroTPI(double numeroTPI) {
        this.numeroTPI = numeroTPI;
    }

    public String getAdresseActuelle() {
        return adresseActuelle;
    }

    public void setAdresseActuelle(String adresseActuelle) {
        this.adresseActuelle = adresseActuelle;
    }

    public int getNombreAdherents() {
        return nombreAdherents;
    }

    public void setNombreAdherents(int nombreAdherents) {
        this.nombreAdherents = nombreAdherents;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getIdPresident() {
        return idPresident;
    }

    public void setIdPresident(double idPresident) {
        this.idPresident = idPresident;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDatedeclaration() {
        return datedeclaration;
    }

    public void setDatedeclaration(Date datedeclaration) {
        this.datedeclaration = datedeclaration;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCooperative != null ? idCooperative.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cooperative)) {
            return false;
        }
        Cooperative other = (Cooperative) object;
        if ((this.idCooperative == null && other.idCooperative != null) || (this.idCooperative != null && !this.idCooperative.equals(other.idCooperative))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ma.observatoire.entitie.Cooperative[ idCooperative=" + idCooperative + " ]";
    }
    
}
