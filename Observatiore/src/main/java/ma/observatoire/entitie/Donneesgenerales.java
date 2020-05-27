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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "donneesgenerales")
@NamedQueries({
    @NamedQuery(name = "Donneesgenerales.findAll", query = "SELECT d FROM Donneesgenerales d")})
public class Donneesgenerales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "adhrents_travailleurs_permanents")
    private Integer adhrentsTravailleursPermanents;
    @Column(name = "adhrents_travailleurs_saisonniers")
    private Integer adhrentsTravailleursSaisonniers;
    @Size(max = 50)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 20)
    @Column(name = "commissaire_aux_comptes")
    private String commissaireAuxComptes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_modification")
    @Temporal(TemporalType.DATE)
    private Date dateModification;
    @Column(name = "derniereagannuelle")
    @Temporal(TemporalType.DATE)
    private Date derniereagannuelle;
    @Column(name = "femmes_adherents_travailleurs_permanentes")
    private Integer femmesAdherentsTravailleursPermanentes;
    @Column(name = "femmes_adherents_travailleurs_saisonnieres")
    private Integer femmesAdherentsTravailleursSaisonnieres;
    @Column(name = "salaries_femmes_permanentes")
    private Integer salariesFemmesPermanentes;
    @Column(name = "salaries_femmes_saisonnieres")
    private Integer salariesFemmesSaisonnieres;
    @Column(name = "salaries_permanents")
    private Integer salariesPermanents;
    @Column(name = "salaries_saisonniers")
    private Integer salariesSaisonniers;
    @Column(name = "tel")
    private Integer tel;
    @Column(name = "tenue_reguliere_assemblees")
    private Boolean tenueReguliereAssemblees;
    @JoinColumn(name = "id_cooperative", referencedColumnName = "id_cooperative")
    @OneToOne(optional = false)
    private Cooperative idCooperative;

    public Donneesgenerales() {
    }

    public Donneesgenerales(Integer id) {
        this.id = id;
    }
    

    public Donneesgenerales(Integer adhrentsTravailleursPermanents, Integer adhrentsTravailleursSaisonniers,
			@Size(max = 50) String adresse, @Size(max = 20) String commissaireAuxComptes,
			@NotNull Date dateModification, Date derniereagannuelle, Integer femmesAdherentsTravailleursPermanentes,
			Integer femmesAdherentsTravailleursSaisonnieres, Integer salariesFemmesPermanentes,
			Integer salariesFemmesSaisonnieres, Integer salariesPermanents, Integer salariesSaisonniers, Integer tel,
			Boolean tenueReguliereAssemblees) {
		super();
		this.adhrentsTravailleursPermanents = adhrentsTravailleursPermanents;
		this.adhrentsTravailleursSaisonniers = adhrentsTravailleursSaisonniers;
		this.adresse = adresse;
		this.commissaireAuxComptes = commissaireAuxComptes;
		this.dateModification = dateModification;
		this.derniereagannuelle = derniereagannuelle;
		this.femmesAdherentsTravailleursPermanentes = femmesAdherentsTravailleursPermanentes;
		this.femmesAdherentsTravailleursSaisonnieres = femmesAdherentsTravailleursSaisonnieres;
		this.salariesFemmesPermanentes = salariesFemmesPermanentes;
		this.salariesFemmesSaisonnieres = salariesFemmesSaisonnieres;
		this.salariesPermanents = salariesPermanents;
		this.salariesSaisonniers = salariesSaisonniers;
		this.tel = tel;
		this.tenueReguliereAssemblees = tenueReguliereAssemblees;
	}

	public Donneesgenerales(Integer id, Date dateModification) {
        this.id = id;
        this.dateModification = dateModification;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdhrentsTravailleursPermanents() {
        return adhrentsTravailleursPermanents;
    }

    public void setAdhrentsTravailleursPermanents(Integer adhrentsTravailleursPermanents) {
        this.adhrentsTravailleursPermanents = adhrentsTravailleursPermanents;
    }

    public Integer getAdhrentsTravailleursSaisonniers() {
        return adhrentsTravailleursSaisonniers;
    }

    public void setAdhrentsTravailleursSaisonniers(Integer adhrentsTravailleursSaisonniers) {
        this.adhrentsTravailleursSaisonniers = adhrentsTravailleursSaisonniers;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCommissaireAuxComptes() {
        return commissaireAuxComptes;
    }

    public void setCommissaireAuxComptes(String commissaireAuxComptes) {
        this.commissaireAuxComptes = commissaireAuxComptes;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Date getDerniereagannuelle() {
        return derniereagannuelle;
    }

    public void setDerniereagannuelle(Date derniereagannuelle) {
        this.derniereagannuelle = derniereagannuelle;
    }

    public Integer getFemmesAdherentsTravailleursPermanentes() {
        return femmesAdherentsTravailleursPermanentes;
    }

    public void setFemmesAdherentsTravailleursPermanentes(Integer femmesAdherentsTravailleursPermanentes) {
        this.femmesAdherentsTravailleursPermanentes = femmesAdherentsTravailleursPermanentes;
    }

    public Integer getFemmesAdherentsTravailleursSaisonnieres() {
        return femmesAdherentsTravailleursSaisonnieres;
    }

    public void setFemmesAdherentsTravailleursSaisonnieres(Integer femmesAdherentsTravailleursSaisonnieres) {
        this.femmesAdherentsTravailleursSaisonnieres = femmesAdherentsTravailleursSaisonnieres;
    }

    public Integer getSalariesFemmesPermanentes() {
        return salariesFemmesPermanentes;
    }

    public void setSalariesFemmesPermanentes(Integer salariesFemmesPermanentes) {
        this.salariesFemmesPermanentes = salariesFemmesPermanentes;
    }

    public Integer getSalariesFemmesSaisonnieres() {
        return salariesFemmesSaisonnieres;
    }

    public void setSalariesFemmesSaisonnieres(Integer salariesFemmesSaisonnieres) {
        this.salariesFemmesSaisonnieres = salariesFemmesSaisonnieres;
    }

    public Integer getSalariesPermanents() {
        return salariesPermanents;
    }

    public void setSalariesPermanents(Integer salariesPermanents) {
        this.salariesPermanents = salariesPermanents;
    }

    public Integer getSalariesSaisonniers() {
        return salariesSaisonniers;
    }

    public void setSalariesSaisonniers(Integer salariesSaisonniers) {
        this.salariesSaisonniers = salariesSaisonniers;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public Boolean getTenueReguliereAssemblees() {
        return tenueReguliereAssemblees;
    }

    public void setTenueReguliereAssemblees(Boolean tenueReguliereAssemblees) {
        this.tenueReguliereAssemblees = tenueReguliereAssemblees;
    }

    public Cooperative getIdCooperative() {
        return idCooperative;
    }

    public void setIdCooperative(Cooperative idCooperative) {
        this.idCooperative = idCooperative;
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
