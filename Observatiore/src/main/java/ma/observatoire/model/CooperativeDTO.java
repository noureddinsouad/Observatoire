package ma.observatoire.model;

import java.util.Date;
public class CooperativeDTO {
private String nom;
private Integer nombreAdherents;
private Double numerotpi;
private Integer telephone;
private String branche;
private String secteur;
private String province;
private String region;
private Integer fax;
private String adresseActuelle;
private Date dateCreation;
private Date datedeclaration;
public CooperativeDTO() {
	// TODO Auto-generated constructor stub
}
public CooperativeDTO(String nom, Integer nombreAdherents, Double numerotpi, Integer telephone, String branche,
		String secteur, String province, String region, Integer fax, String adresseActuelle, Date dateCreation,
		Date datedeclaration) {
	super();
	this.nom = nom;
	this.nombreAdherents = nombreAdherents;
	this.numerotpi = numerotpi;
	this.telephone = telephone;
	this.branche = branche;
	this.secteur = secteur;
	this.province = province;
	this.region = region;
	this.fax = fax;
	this.adresseActuelle = adresseActuelle;
	this.dateCreation = dateCreation;
	this.datedeclaration = datedeclaration;
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
public String getBranche() {
	return branche;
}
public void setBranche(String branche) {
	this.branche = branche;
}
public String getSecteur() {
	return secteur;
}
public void setSecteur(String secteur) {
	this.secteur = secteur;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public Integer getFax() {
	return fax;
}
public void setFax(Integer fax) {
	this.fax = fax;
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
}
