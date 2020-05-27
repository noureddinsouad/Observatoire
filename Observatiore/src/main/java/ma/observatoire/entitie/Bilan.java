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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author nos
 */
@Entity
@Table(name = "bilan")
@NamedQueries({
    @NamedQuery(name = "Bilan.findAll", query = "SELECT b FROM Bilan b")})
public class Bilan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "achat_revendus_marchandises")
    private Double achatRevendusMarchandises;
    @Column(name = "achats_consommes_matieres_et_fournitures")
    private Double achatsConsommesMatieresEtFournitures;
    @Column(name = "autres_charges")
    private Double autresCharges;
    @Column(name = "autres_charges_externes")
    private Double autresChargesExternes;
    @Column(name = "autres_creanciers")
    private Double autresCreanciers;
    @Column(name = "autres_immobilisations_personnelles")
    private Double autresImmobilisationsPersonnelles;
    @Column(name = "autres_reserves")
    private Double autresReserves;
    @Column(name = "banque")
    private Double banque;
    @Column(name = "caisse")
    private Double caisse;
    @Column(name = "capital_actuel")
    private Double capitalActuel;
    @Column(name = "charges_finacieres")
    private Double chargesFinacieres;
    @Column(name = "charges_personnel")
    private Double chargesPersonnel;
    @Column(name = "chiffre_affaires")
    private Double chiffreAffaires;
    @Column(name = "comptes_associes")
    private Double comptesAssocies;
    @Column(name = "consommation_exercice")
    private Double consommationExercice;
    @Column(name = "constructions")
    private Double constructions;
    @Column(name = "creance")
    private Double creance;
    @Column(name = "date_bilan")
    @Temporal(TemporalType.DATE)
    private Date dateBilan;
    @Column(name = "date_modification")
    @Temporal(TemporalType.DATE)
    private Date dateModification;
    @Column(name = "dette_financement_cour_terme")
    private Double detteFinancementCourTerme;
    @Column(name = "dette_financement_long_terme")
    private Double detteFinancementLongTerme;
    @Column(name = "dotations_exploitations")
    private Double dotationsExploitations;
    @Column(name = "etat")
    private Double etat;
    @Column(name = "etat_achat_revendus_marchandises")
    private Double etatAchatRevendusMarchandises;
    @Column(name = "etat_autres_charges_externes")
    private Double etatAutresChargesExternes;
    @Column(name = "fournisseurs_et_comptes_rattaches")
    private Double fournisseursEtComptesRattaches;
    @Column(name = "frais_preliminaires")
    private Double fraisPreliminaires;
    @Column(name = "immobilisations_cooperatives")
    private Double immobilisationsCooperatives;
    @Column(name = "impots_et_taxes")
    private Double impotsEtTaxes;
    @Column(name = "installations_materiel_et_outillage")
    private Double installationsMaterielEtOutillage;
    @Column(name = "marge_brute_sur_vente_en_letat")
    private Double margeBruteSurVenteEnLetat;
    @Column(name = "materiel_et_immobilier_bureau")
    private Double materielEtImmobilierBureau;
    @Column(name = "materiel_transport")
    private Double materielTransport;
    @Column(name = "organismes_sociaux")
    private Double organismesSociaux;
    @Column(name = "personnel")
    private Double personnel;
    @Column(name = "production_exercice")
    private Double productionExercice;
    @Column(name = "report_anouveau")
    private Double reportAnouveau;
    @Column(name = "reserves_legales")
    private Double reservesLegales;
    @Size(max = 10)
    @Column(name = "resultat")
    private String resultat;
    @Column(name = "resultats_nets_instance_application")
    private Double resultatsNetsInstanceApplication;
    @Column(name = "resultat_valeur")
    private Double resultatValeur;
    @Column(name = "subventions_exploitation")
    private Double subventionsExploitation;
    @Column(name = "subventions_investissement")
    private Double subventionsInvestissement;
    @Column(name = "terrains")
    private Double terrains;
    @Column(name = "total_achats")
    private Double totalAchats;
    @Column(name = "total_actif")
    private Double totalActif;
    @Column(name = "total_immobilisations")
    private Double totalImmobilisations;
    @Column(name = "total_passif")
    private Double totalPassif;
    @Column(name = "total_stocks")
    private Double totalStocks;
    @Column(name = "transferts_de_charges")
    private Double transfertsDeCharges;
    @Column(name = "valeur_ajoutee")
    private Double valeurAjoutee;
    @Column(name = "variation_stock_produits")
    private Double variationStockProduits;
    @Column(name = "vente_bien_et_services_produits")
    private Double venteBienEtServicesProduits;
    @Column(name = "vente_marchandises_en_letat")
    private Double venteMarchandisesEnLetat;
    @JoinColumn(name = "id_cooperative", referencedColumnName = "id_cooperative")
    @ManyToOne(optional = false)
    private Cooperative idCooperative;

    public Bilan() {
    }

    public Bilan(Integer id) {
        this.id = id;
    }

    public Bilan(Double achatRevendusMarchandises, Double achatsConsommesMatieresEtFournitures, Double autresCharges,
			Double autresChargesExternes, Double autresCreanciers, Double autresImmobilisationsPersonnelles,
			Double autresReserves, Double banque, Double caisse, Double capitalActuel, Double chargesFinacieres,
			Double chargesPersonnel, Double chiffreAffaires, Double comptesAssocies, Double consommationExercice,
			Double constructions, Double creance, Date dateBilan, Date dateModification,
			Double detteFinancementCourTerme, Double detteFinancementLongTerme, Double dotationsExploitations,
			Double etat, Double etatAchatRevendusMarchandises, Double etatAutresChargesExternes,
			Double fournisseursEtComptesRattaches, Double fraisPreliminaires, Double immobilisationsCooperatives,
			Double impotsEtTaxes, Double installationsMaterielEtOutillage, Double margeBruteSurVenteEnLetat,
			Double materielEtImmobilierBureau, Double materielTransport, Double organismesSociaux, Double personnel,
			Double productionExercice, Double reportAnouveau, Double reservesLegales, @Size(max = 10) String resultat,
			Double resultatsNetsInstanceApplication, Double resultatValeur, Double subventionsExploitation,
			Double subventionsInvestissement, Double terrains, Double totalAchats, Double totalActif,
			Double totalImmobilisations, Double totalPassif, Double totalStocks, Double transfertsDeCharges,
			Double valeurAjoutee, Double variationStockProduits, Double venteBienEtServicesProduits,
			Double venteMarchandisesEnLetat) {
		//super();
		this.achatRevendusMarchandises = achatRevendusMarchandises;
		this.achatsConsommesMatieresEtFournitures = achatsConsommesMatieresEtFournitures;
		this.autresCharges = autresCharges;
		this.autresChargesExternes = autresChargesExternes;
		this.autresCreanciers = autresCreanciers;
		this.autresImmobilisationsPersonnelles = autresImmobilisationsPersonnelles;
		this.autresReserves = autresReserves;
		this.banque = banque;
		this.caisse = caisse;
		this.capitalActuel = capitalActuel;
		this.chargesFinacieres = chargesFinacieres;
		this.chargesPersonnel = chargesPersonnel;
		this.chiffreAffaires = chiffreAffaires;
		this.comptesAssocies = comptesAssocies;
		this.consommationExercice = consommationExercice;
		this.constructions = constructions;
		this.creance = creance;
		this.dateBilan = dateBilan;
		this.dateModification = dateModification;
		this.detteFinancementCourTerme = detteFinancementCourTerme;
		this.detteFinancementLongTerme = detteFinancementLongTerme;
		this.dotationsExploitations = dotationsExploitations;
		this.etat = etat;
		this.etatAchatRevendusMarchandises = etatAchatRevendusMarchandises;
		this.etatAutresChargesExternes = etatAutresChargesExternes;
		this.fournisseursEtComptesRattaches = fournisseursEtComptesRattaches;
		this.fraisPreliminaires = fraisPreliminaires;
		this.immobilisationsCooperatives = immobilisationsCooperatives;
		this.impotsEtTaxes = impotsEtTaxes;
		this.installationsMaterielEtOutillage = installationsMaterielEtOutillage;
		this.margeBruteSurVenteEnLetat = margeBruteSurVenteEnLetat;
		this.materielEtImmobilierBureau = materielEtImmobilierBureau;
		this.materielTransport = materielTransport;
		this.organismesSociaux = organismesSociaux;
		this.personnel = personnel;
		this.productionExercice = productionExercice;
		this.reportAnouveau = reportAnouveau;
		this.reservesLegales = reservesLegales;
		this.resultat = resultat;
		this.resultatsNetsInstanceApplication = resultatsNetsInstanceApplication;
		this.resultatValeur = resultatValeur;
		this.subventionsExploitation = subventionsExploitation;
		this.subventionsInvestissement = subventionsInvestissement;
		this.terrains = terrains;
		this.totalAchats = totalAchats;
		this.totalActif = totalActif;
		this.totalImmobilisations = totalImmobilisations;
		this.totalPassif = totalPassif;
		this.totalStocks = totalStocks;
		this.transfertsDeCharges = transfertsDeCharges;
		this.valeurAjoutee = valeurAjoutee;
		this.variationStockProduits = variationStockProduits;
		this.venteBienEtServicesProduits = venteBienEtServicesProduits;
		this.venteMarchandisesEnLetat = venteMarchandisesEnLetat;
		
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAchatRevendusMarchandises() {
        return achatRevendusMarchandises;
    }

    public void setAchatRevendusMarchandises(Double achatRevendusMarchandises) {
        this.achatRevendusMarchandises = achatRevendusMarchandises;
    }

    public Double getAchatsConsommesMatieresEtFournitures() {
        return achatsConsommesMatieresEtFournitures;
    }

    public void setAchatsConsommesMatieresEtFournitures(Double achatsConsommesMatieresEtFournitures) {
        this.achatsConsommesMatieresEtFournitures = achatsConsommesMatieresEtFournitures;
    }

    public Double getAutresCharges() {
        return autresCharges;
    }

    public void setAutresCharges(Double autresCharges) {
        this.autresCharges = autresCharges;
    }

    public Double getAutresChargesExternes() {
        return autresChargesExternes;
    }

    public void setAutresChargesExternes(Double autresChargesExternes) {
        this.autresChargesExternes = autresChargesExternes;
    }

    public Double getAutresCreanciers() {
        return autresCreanciers;
    }

    public void setAutresCreanciers(Double autresCreanciers) {
        this.autresCreanciers = autresCreanciers;
    }

    public Double getAutresImmobilisationsPersonnelles() {
        return autresImmobilisationsPersonnelles;
    }

    public void setAutresImmobilisationsPersonnelles(Double autresImmobilisationsPersonnelles) {
        this.autresImmobilisationsPersonnelles = autresImmobilisationsPersonnelles;
    }

    public Double getAutresReserves() {
        return autresReserves;
    }

    public void setAutresReserves(Double autresReserves) {
        this.autresReserves = autresReserves;
    }

    public Double getBanque() {
        return banque;
    }

    public void setBanque(Double banque) {
        this.banque = banque;
    }

    public Double getCaisse() {
        return caisse;
    }

    public void setCaisse(Double caisse) {
        this.caisse = caisse;
    }

    public Double getCapitalActuel() {
        return capitalActuel;
    }

    public void setCapitalActuel(Double capitalActuel) {
        this.capitalActuel = capitalActuel;
    }

    public Double getChargesFinacieres() {
        return chargesFinacieres;
    }

    public void setChargesFinacieres(Double chargesFinacieres) {
        this.chargesFinacieres = chargesFinacieres;
    }

    public Double getChargesPersonnel() {
        return chargesPersonnel;
    }

    public void setChargesPersonnel(Double chargesPersonnel) {
        this.chargesPersonnel = chargesPersonnel;
    }

    public Double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void setChiffreAffaires(Double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public Double getComptesAssocies() {
        return comptesAssocies;
    }

    public void setComptesAssocies(Double comptesAssocies) {
        this.comptesAssocies = comptesAssocies;
    }

    public Double getConsommationExercice() {
        return consommationExercice;
    }

    public void setConsommationExercice(Double consommationExercice) {
        this.consommationExercice = consommationExercice;
    }

    public Double getConstructions() {
        return constructions;
    }

    public void setConstructions(Double constructions) {
        this.constructions = constructions;
    }

    public Double getCreance() {
        return creance;
    }

    public void setCreance(Double creance) {
        this.creance = creance;
    }

    public Date getDateBilan() {
        return dateBilan;
    }

    public void setDateBilan(Date dateBilan) {
        this.dateBilan = dateBilan;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Double getDetteFinancementCourTerme() {
        return detteFinancementCourTerme;
    }

    public void setDetteFinancementCourTerme(Double detteFinancementCourTerme) {
        this.detteFinancementCourTerme = detteFinancementCourTerme;
    }

    public Double getDetteFinancementLongTerme() {
        return detteFinancementLongTerme;
    }

    public void setDetteFinancementLongTerme(Double detteFinancementLongTerme) {
        this.detteFinancementLongTerme = detteFinancementLongTerme;
    }

    public Double getDotationsExploitations() {
        return dotationsExploitations;
    }

    public void setDotationsExploitations(Double dotationsExploitations) {
        this.dotationsExploitations = dotationsExploitations;
    }

    public Double getEtat() {
        return etat;
    }

    public void setEtat(Double etat) {
        this.etat = etat;
    }

    public Double getEtatAchatRevendusMarchandises() {
        return etatAchatRevendusMarchandises;
    }

    public void setEtatAchatRevendusMarchandises(Double etatAchatRevendusMarchandises) {
        this.etatAchatRevendusMarchandises = etatAchatRevendusMarchandises;
    }

    public Double getEtatAutresChargesExternes() {
        return etatAutresChargesExternes;
    }

    public void setEtatAutresChargesExternes(Double etatAutresChargesExternes) {
        this.etatAutresChargesExternes = etatAutresChargesExternes;
    }

    public Double getFournisseursEtComptesRattaches() {
        return fournisseursEtComptesRattaches;
    }

    public void setFournisseursEtComptesRattaches(Double fournisseursEtComptesRattaches) {
        this.fournisseursEtComptesRattaches = fournisseursEtComptesRattaches;
    }

    public Double getFraisPreliminaires() {
        return fraisPreliminaires;
    }

    public void setFraisPreliminaires(Double fraisPreliminaires) {
        this.fraisPreliminaires = fraisPreliminaires;
    }

    public Double getImmobilisationsCooperatives() {
        return immobilisationsCooperatives;
    }

    public void setImmobilisationsCooperatives(Double immobilisationsCooperatives) {
        this.immobilisationsCooperatives = immobilisationsCooperatives;
    }

    public Double getImpotsEtTaxes() {
        return impotsEtTaxes;
    }

    public void setImpotsEtTaxes(Double impotsEtTaxes) {
        this.impotsEtTaxes = impotsEtTaxes;
    }

    public Double getInstallationsMaterielEtOutillage() {
        return installationsMaterielEtOutillage;
    }

    public void setInstallationsMaterielEtOutillage(Double installationsMaterielEtOutillage) {
        this.installationsMaterielEtOutillage = installationsMaterielEtOutillage;
    }

    public Double getMargeBruteSurVenteEnLetat() {
        return margeBruteSurVenteEnLetat;
    }

    public void setMargeBruteSurVenteEnLetat(Double margeBruteSurVenteEnLetat) {
        this.margeBruteSurVenteEnLetat = margeBruteSurVenteEnLetat;
    }

    public Double getMaterielEtImmobilierBureau() {
        return materielEtImmobilierBureau;
    }

    public void setMaterielEtImmobilierBureau(Double materielEtImmobilierBureau) {
        this.materielEtImmobilierBureau = materielEtImmobilierBureau;
    }

    public Double getMaterielTransport() {
        return materielTransport;
    }

    public void setMaterielTransport(Double materielTransport) {
        this.materielTransport = materielTransport;
    }

    public Double getOrganismesSociaux() {
        return organismesSociaux;
    }

    public void setOrganismesSociaux(Double organismesSociaux) {
        this.organismesSociaux = organismesSociaux;
    }

    public Double getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Double personnel) {
        this.personnel = personnel;
    }

    public Double getProductionExercice() {
        return productionExercice;
    }

    public void setProductionExercice(Double productionExercice) {
        this.productionExercice = productionExercice;
    }

    public Double getReportAnouveau() {
        return reportAnouveau;
    }

    public void setReportAnouveau(Double reportAnouveau) {
        this.reportAnouveau = reportAnouveau;
    }

    public Double getReservesLegales() {
        return reservesLegales;
    }

    public void setReservesLegales(Double reservesLegales) {
        this.reservesLegales = reservesLegales;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public Double getResultatsNetsInstanceApplication() {
        return resultatsNetsInstanceApplication;
    }

    public void setResultatsNetsInstanceApplication(Double resultatsNetsInstanceApplication) {
        this.resultatsNetsInstanceApplication = resultatsNetsInstanceApplication;
    }

    public Double getResultatValeur() {
        return resultatValeur;
    }

    public void setResultatValeur(Double resultatValeur) {
        this.resultatValeur = resultatValeur;
    }

    public Double getSubventionsExploitation() {
        return subventionsExploitation;
    }

    public void setSubventionsExploitation(Double subventionsExploitation) {
        this.subventionsExploitation = subventionsExploitation;
    }

    public Double getSubventionsInvestissement() {
        return subventionsInvestissement;
    }

    public void setSubventionsInvestissement(Double subventionsInvestissement) {
        this.subventionsInvestissement = subventionsInvestissement;
    }

    public Double getTerrains() {
        return terrains;
    }

    public void setTerrains(Double terrains) {
        this.terrains = terrains;
    }

    public Double getTotalAchats() {
        return totalAchats;
    }

    public void setTotalAchats(Double totalAchats) {
        this.totalAchats = totalAchats;
    }

    public Double getTotalActif() {
        return totalActif;
    }

    public void setTotalActif(Double totalActif) {
        this.totalActif = totalActif;
    }

    public Double getTotalImmobilisations() {
        return totalImmobilisations;
    }

    public void setTotalImmobilisations(Double totalImmobilisations) {
        this.totalImmobilisations = totalImmobilisations;
    }

    public Double getTotalPassif() {
        return totalPassif;
    }

    public void setTotalPassif(Double totalPassif) {
        this.totalPassif = totalPassif;
    }

    public Double getTotalStocks() {
        return totalStocks;
    }

    public void setTotalStocks(Double totalStocks) {
        this.totalStocks = totalStocks;
    }

    public Double getTransfertsDeCharges() {
        return transfertsDeCharges;
    }

    public void setTransfertsDeCharges(Double transfertsDeCharges) {
        this.transfertsDeCharges = transfertsDeCharges;
    }

    public Double getValeurAjoutee() {
        return valeurAjoutee;
    }

    public void setValeurAjoutee(Double valeurAjoutee) {
        this.valeurAjoutee = valeurAjoutee;
    }

    public Double getVariationStockProduits() {
        return variationStockProduits;
    }

    public void setVariationStockProduits(Double variationStockProduits) {
        this.variationStockProduits = variationStockProduits;
    }

    public Double getVenteBienEtServicesProduits() {
        return venteBienEtServicesProduits;
    }

    public void setVenteBienEtServicesProduits(Double venteBienEtServicesProduits) {
        this.venteBienEtServicesProduits = venteBienEtServicesProduits;
    }

    public Double getVenteMarchandisesEnLetat() {
        return venteMarchandisesEnLetat;
    }

    public void setVenteMarchandisesEnLetat(Double venteMarchandisesEnLetat) {
        this.venteMarchandisesEnLetat = venteMarchandisesEnLetat;
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
        if (!(object instanceof Bilan)) {
            return false;
        }
        Bilan other = (Bilan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ma.observatoire.entitie.Bilan[ id=" + id + " ]";
    }
    
}
