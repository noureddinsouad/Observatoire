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
@Table(name = "donneesgenerales")
@NamedQueries({
    @NamedQuery(name = "Donneesgenerales.findAll", query = "SELECT d FROM Donneesgenerales d")})
public class Donneesgenerales implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Double id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cooperative")
    private double idCooperative;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AdhrentsTravailleursPermanents")
    private int adhrentsTravailleursPermanents;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AdhrentsTravailleursSaisonniers")
    private int adhrentsTravailleursSaisonniers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalariesPermanents")
    private int salariesPermanents;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalariesSaisonniers")
    private int salariesSaisonniers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FemmesAdherentsTravailleursPermanentes")
    private int femmesAdherentsTravailleursPermanentes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FemmesAdherentsTravailleursSaisonnieres")
    private int femmesAdherentsTravailleursSaisonnieres;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalariesFemmesPermanentes")
    private int salariesFemmesPermanentes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SalariesFemmesSaisonnieres")
    private int salariesFemmesSaisonnieres;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TenueReguliereAssemblees")
    private boolean tenueReguliereAssemblees;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DerniereAGannuelle")
    @Temporal(TemporalType.DATE)
    private Date derniereAGannuelle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CommissaireAuxComptes")
    private String commissaireAuxComptes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Adresse")
    private String adresse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tel")
    private int tel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateModification")
    @Temporal(TemporalType.DATE)
    private Date dateModification;

    public Donneesgenerales() {
    }

    public Donneesgenerales(Double id) {
        this.id = id;
    }

    public Donneesgenerales(Double id, double idCooperative, int adhrentsTravailleursPermanents, int adhrentsTravailleursSaisonniers, int salariesPermanents, int salariesSaisonniers, int femmesAdherentsTravailleursPermanentes, int femmesAdherentsTravailleursSaisonnieres, int salariesFemmesPermanentes, int salariesFemmesSaisonnieres, boolean tenueReguliereAssemblees, Date derniereAGannuelle, String commissaireAuxComptes, String adresse, int tel, Date dateModification) {
        this.id = id;
        this.idCooperative = idCooperative;
        this.adhrentsTravailleursPermanents = adhrentsTravailleursPermanents;
        this.adhrentsTravailleursSaisonniers = adhrentsTravailleursSaisonniers;
        this.salariesPermanents = salariesPermanents;
        this.salariesSaisonniers = salariesSaisonniers;
        this.femmesAdherentsTravailleursPermanentes = femmesAdherentsTravailleursPermanentes;
        this.femmesAdherentsTravailleursSaisonnieres = femmesAdherentsTravailleursSaisonnieres;
        this.salariesFemmesPermanentes = salariesFemmesPermanentes;
        this.salariesFemmesSaisonnieres = salariesFemmesSaisonnieres;
        this.tenueReguliereAssemblees = tenueReguliereAssemblees;
        this.derniereAGannuelle = derniereAGannuelle;
        this.commissaireAuxComptes = commissaireAuxComptes;
        this.adresse = adresse;
        this.tel = tel;
        this.dateModification = dateModification;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public double getIdCooperative() {
        return idCooperative;
    }

    public void setIdCooperative(double idCooperative) {
        this.idCooperative = idCooperative;
    }

    public int getAdhrentsTravailleursPermanents() {
        return adhrentsTravailleursPermanents;
    }

    public void setAdhrentsTravailleursPermanents(int adhrentsTravailleursPermanents) {
        this.adhrentsTravailleursPermanents = adhrentsTravailleursPermanents;
    }

    public int getAdhrentsTravailleursSaisonniers() {
        return adhrentsTravailleursSaisonniers;
    }

    public void setAdhrentsTravailleursSaisonniers(int adhrentsTravailleursSaisonniers) {
        this.adhrentsTravailleursSaisonniers = adhrentsTravailleursSaisonniers;
    }

    public int getSalariesPermanents() {
        return salariesPermanents;
    }

    public void setSalariesPermanents(int salariesPermanents) {
        this.salariesPermanents = salariesPermanents;
    }

    public int getSalariesSaisonniers() {
        return salariesSaisonniers;
    }

    public void setSalariesSaisonniers(int salariesSaisonniers) {
        this.salariesSaisonniers = salariesSaisonniers;
    }

    public int getFemmesAdherentsTravailleursPermanentes() {
        return femmesAdherentsTravailleursPermanentes;
    }

    public void setFemmesAdherentsTravailleursPermanentes(int femmesAdherentsTravailleursPermanentes) {
        this.femmesAdherentsTravailleursPermanentes = femmesAdherentsTravailleursPermanentes;
    }

    public int getFemmesAdherentsTravailleursSaisonnieres() {
        return femmesAdherentsTravailleursSaisonnieres;
    }

    public void setFemmesAdherentsTravailleursSaisonnieres(int femmesAdherentsTravailleursSaisonnieres) {
        this.femmesAdherentsTravailleursSaisonnieres = femmesAdherentsTravailleursSaisonnieres;
    }

    public int getSalariesFemmesPermanentes() {
        return salariesFemmesPermanentes;
    }

    public void setSalariesFemmesPermanentes(int salariesFemmesPermanentes) {
        this.salariesFemmesPermanentes = salariesFemmesPermanentes;
    }

    public int getSalariesFemmesSaisonnieres() {
        return salariesFemmesSaisonnieres;
    }

    public void setSalariesFemmesSaisonnieres(int salariesFemmesSaisonnieres) {
        this.salariesFemmesSaisonnieres = salariesFemmesSaisonnieres;
    }

    public boolean getTenueReguliereAssemblees() {
        return tenueReguliereAssemblees;
    }

    public void setTenueReguliereAssemblees(boolean tenueReguliereAssemblees) {
        this.tenueReguliereAssemblees = tenueReguliereAssemblees;
    }

    public Date getDerniereAGannuelle() {
        return derniereAGannuelle;
    }

    public void setDerniereAGannuelle(Date derniereAGannuelle) {
        this.derniereAGannuelle = derniereAGannuelle;
    }

    public String getCommissaireAuxComptes() {
        return commissaireAuxComptes;
    }

    public void setCommissaireAuxComptes(String commissaireAuxComptes) {
        this.commissaireAuxComptes = commissaireAuxComptes;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Donneesgenerales)) {
            return false;
        }
        Donneesgenerales other = (Donneesgenerales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ma.observatoire.entitie.Donneesgenerales[ id=" + id + " ]";
    }
    
}
