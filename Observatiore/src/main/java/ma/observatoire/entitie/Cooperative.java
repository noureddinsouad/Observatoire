/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.observatoire.entitie;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cooperative")
    private Integer idCooperative;
    @Size(max = 50)
    @Column(name = "adresse_actuelle")
    private String adresseActuelle;
    @Column(name = "date_creation")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datedeclaration")
    @Temporal(TemporalType.DATE)
    private Date datedeclaration;
    @Column(name = "fax")
    private Integer fax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nom")
    private String nom;
    @Column(name = "nombre_adherents")
    private Integer nombreAdherents;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "numerotpi")
    private Double numerotpi;
    @Column(name = "telephone")
    private Integer telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCooperative")
    private List<Bilan> bilanList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idCooperative")
    private Donneesgenerales donneesgenerales;
    @JoinColumn(name = "branche", referencedColumnName = "id_branche")
    @ManyToOne(optional = false)
    private Branche branche;
    @JoinColumn(name = "id_president", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private Prsident idPresident;
    @JoinColumn(name = "id_secteur", referencedColumnName = "id_secteur")
    @ManyToOne(optional = false)
    private Secteur idSecteur;
    @JoinColumn(name = "province", referencedColumnName = "id_province")
    @ManyToOne(optional = false)
    private Province province;
    @JoinColumn(name = "region", referencedColumnName = "id_region")
    @ManyToOne(optional = false)
    private Region region;

    public Cooperative() {
    }

    public Cooperative(Integer idCooperative) {
        this.idCooperative = idCooperative;
    }

    public Cooperative(Integer idCooperative, Date datedeclaration, String nom) {
        this.idCooperative = idCooperative;
        this.datedeclaration = datedeclaration;
        this.nom = nom;
    }

    public Integer getIdCooperative() {
        return idCooperative;
    }

    public void setIdCooperative(Integer idCooperative) {
        this.idCooperative = idCooperative;
    }

    public String getAdresseActuelle() {
        return adresseActuelle;
    }

    public void setAdresseActuelle(String adresseActuelle) {
        this.adresseActuelle = adresseActuelle;
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

    public Integer getFax() {
        return fax;
    }

    public void setFax(Integer fax) {
        this.fax = fax;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNombreAdherents() {
        return nombreAdherents;
    }

    public void setNombreAdherents(Integer nombreAdherents) {
        this.nombreAdherents = nombreAdherents;
    }

    public Double getNumerotpi() {
        return numerotpi;
    }

    public void setNumerotpi(Double numerotpi) {
        this.numerotpi = numerotpi;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public List<Bilan> getBilanList() {
        return bilanList;
    }

    public void setBilanList(List<Bilan> bilanList) {
        this.bilanList = bilanList;
    }

    public Donneesgenerales getDonneesgenerales() {
        return donneesgenerales;
    }

    public void setDonneesgenerales(Donneesgenerales donneesgenerales) {
        this.donneesgenerales = donneesgenerales;
    }

    public Branche getBranche() {
        return branche;
    }

    public void setBranche(Branche branche) {
        this.branche = branche;
    }

    public Prsident getIdPresident() {
        return idPresident;
    }

    public void setIdPresident(Prsident idPresident) {
        this.idPresident = idPresident;
    }

    public Secteur getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(Secteur idSecteur) {
        this.idSecteur = idSecteur;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
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
