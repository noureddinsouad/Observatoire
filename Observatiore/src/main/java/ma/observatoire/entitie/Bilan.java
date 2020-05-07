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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nos
 */
@Entity
@Table(name = "bilan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bilan.findAll", query = "SELECT b FROM Bilan b")
    , @NamedQuery(name = "Bilan.findById", query = "SELECT b FROM Bilan b WHERE b.id = :id")
    , @NamedQuery(name = "Bilan.findByIdCooperative", query = "SELECT b FROM Bilan b WHERE b.idCooperative = :idCooperative")
    , @NamedQuery(name = "Bilan.findByFraisPreliminaires", query = "SELECT b FROM Bilan b WHERE b.fraisPreliminaires = :fraisPreliminaires")
    , @NamedQuery(name = "Bilan.findBySubventionsInvestissement", query = "SELECT b FROM Bilan b WHERE b.subventionsInvestissement = :subventionsInvestissement")
    , @NamedQuery(name = "Bilan.findByTerrains", query = "SELECT b FROM Bilan b WHERE b.terrains = :terrains")
    , @NamedQuery(name = "Bilan.findByConstructions", query = "SELECT b FROM Bilan b WHERE b.constructions = :constructions")
    , @NamedQuery(name = "Bilan.findByInstallationsMaterielEtOutillage", query = "SELECT b FROM Bilan b WHERE b.installationsMaterielEtOutillage = :installationsMaterielEtOutillage")
    , @NamedQuery(name = "Bilan.findByMaterielTransport", query = "SELECT b FROM Bilan b WHERE b.materielTransport = :materielTransport")
    , @NamedQuery(name = "Bilan.findByAutresImmobilisationsPersonnelles", query = "SELECT b FROM Bilan b WHERE b.autresImmobilisationsPersonnelles = :autresImmobilisationsPersonnelles")
    , @NamedQuery(name = "Bilan.findByMaterielEtImmobilierBureau", query = "SELECT b FROM Bilan b WHERE b.materielEtImmobilierBureau = :materielEtImmobilierBureau")
    , @NamedQuery(name = "Bilan.findByTotalImmobilisations", query = "SELECT b FROM Bilan b WHERE b.totalImmobilisations = :totalImmobilisations")
    , @NamedQuery(name = "Bilan.findByTotalStocks", query = "SELECT b FROM Bilan b WHERE b.totalStocks = :totalStocks")
    , @NamedQuery(name = "Bilan.findByCreance", query = "SELECT b FROM Bilan b WHERE b.creance = :creance")
    , @NamedQuery(name = "Bilan.findByBanque", query = "SELECT b FROM Bilan b WHERE b.banque = :banque")
    , @NamedQuery(name = "Bilan.findByCaisse", query = "SELECT b FROM Bilan b WHERE b.caisse = :caisse")
    , @NamedQuery(name = "Bilan.findByDateModification", query = "SELECT b FROM Bilan b WHERE b.dateModification = :dateModification")
    , @NamedQuery(name = "Bilan.findByDateBilan", query = "SELECT b FROM Bilan b WHERE b.dateBilan = :dateBilan")
    , @NamedQuery(name = "Bilan.findByCapitalActuel", query = "SELECT b FROM Bilan b WHERE b.capitalActuel = :capitalActuel")
    , @NamedQuery(name = "Bilan.findByReservesLegales", query = "SELECT b FROM Bilan b WHERE b.reservesLegales = :reservesLegales")
    , @NamedQuery(name = "Bilan.findByAutresReserves", query = "SELECT b FROM Bilan b WHERE b.autresReserves = :autresReserves")
    , @NamedQuery(name = "Bilan.findByReportAnouveau", query = "SELECT b FROM Bilan b WHERE b.reportAnouveau = :reportAnouveau")
    , @NamedQuery(name = "Bilan.findByResultatsNetsInstanceApplication", query = "SELECT b FROM Bilan b WHERE b.resultatsNetsInstanceApplication = :resultatsNetsInstanceApplication")
    , @NamedQuery(name = "Bilan.findByDetteFinancementLongTerme", query = "SELECT b FROM Bilan b WHERE b.detteFinancementLongTerme = :detteFinancementLongTerme")
    , @NamedQuery(name = "Bilan.findByDetteFinancementCourTerme", query = "SELECT b FROM Bilan b WHERE b.detteFinancementCourTerme = :detteFinancementCourTerme")
    , @NamedQuery(name = "Bilan.findByFournisseursEtComptesRattaches", query = "SELECT b FROM Bilan b WHERE b.fournisseursEtComptesRattaches = :fournisseursEtComptesRattaches")
    , @NamedQuery(name = "Bilan.findByPersonnel", query = "SELECT b FROM Bilan b WHERE b.personnel = :personnel")
    , @NamedQuery(name = "Bilan.findByOrganismesSociaux", query = "SELECT b FROM Bilan b WHERE b.organismesSociaux = :organismesSociaux")
    , @NamedQuery(name = "Bilan.findByEtat", query = "SELECT b FROM Bilan b WHERE b.etat = :etat")
    , @NamedQuery(name = "Bilan.findByComptesAssocies", query = "SELECT b FROM Bilan b WHERE b.comptesAssocies = :comptesAssocies")
    , @NamedQuery(name = "Bilan.findByAutresCreanciers", query = "SELECT b FROM Bilan b WHERE b.autresCreanciers = :autresCreanciers")
    , @NamedQuery(name = "Bilan.findByChiffreAffaires", query = "SELECT b FROM Bilan b WHERE b.chiffreAffaires = :chiffreAffaires")
    , @NamedQuery(name = "Bilan.findBySubventionsExploitation", query = "SELECT b FROM Bilan b WHERE b.subventionsExploitation = :subventionsExploitation")
    , @NamedQuery(name = "Bilan.findByTransfertsDeCharges", query = "SELECT b FROM Bilan b WHERE b.transfertsDeCharges = :transfertsDeCharges")
    , @NamedQuery(name = "Bilan.findByAchatRevendusMarchandises", query = "SELECT b FROM Bilan b WHERE b.achatRevendusMarchandises = :achatRevendusMarchandises")
    , @NamedQuery(name = "Bilan.findByAchatsConsommesMatieresEtFournitures", query = "SELECT b FROM Bilan b WHERE b.achatsConsommesMatieresEtFournitures = :achatsConsommesMatieresEtFournitures")
    , @NamedQuery(name = "Bilan.findByAutresChargesExternes", query = "SELECT b FROM Bilan b WHERE b.autresChargesExternes = :autresChargesExternes")
    , @NamedQuery(name = "Bilan.findByImpotsEtTaxes", query = "SELECT b FROM Bilan b WHERE b.impotsEtTaxes = :impotsEtTaxes")
    , @NamedQuery(name = "Bilan.findByTotalAchats", query = "SELECT b FROM Bilan b WHERE b.totalAchats = :totalAchats")
    , @NamedQuery(name = "Bilan.findByChargesPersonnel", query = "SELECT b FROM Bilan b WHERE b.chargesPersonnel = :chargesPersonnel")
    , @NamedQuery(name = "Bilan.findByAutresCharges", query = "SELECT b FROM Bilan b WHERE b.autresCharges = :autresCharges")
    , @NamedQuery(name = "Bilan.findByChargesFinacieres", query = "SELECT b FROM Bilan b WHERE b.chargesFinacieres = :chargesFinacieres")
    , @NamedQuery(name = "Bilan.findByDotationsExploitations", query = "SELECT b FROM Bilan b WHERE b.dotationsExploitations = :dotationsExploitations")
    , @NamedQuery(name = "Bilan.findByVenteMarchandisesEnLetat", query = "SELECT b FROM Bilan b WHERE b.venteMarchandisesEnLetat = :venteMarchandisesEnLetat")
    , @NamedQuery(name = "Bilan.findByEtatAchatRevendusMarchandises", query = "SELECT b FROM Bilan b WHERE b.etatAchatRevendusMarchandises = :etatAchatRevendusMarchandises")
    , @NamedQuery(name = "Bilan.findByVenteBienEtServicesProduits", query = "SELECT b FROM Bilan b WHERE b.venteBienEtServicesProduits = :venteBienEtServicesProduits")
    , @NamedQuery(name = "Bilan.findByVariationStockProduits", query = "SELECT b FROM Bilan b WHERE b.variationStockProduits = :variationStockProduits")
    , @NamedQuery(name = "Bilan.findByImmobilisationsCooperatives", query = "SELECT b FROM Bilan b WHERE b.immobilisationsCooperatives = :immobilisationsCooperatives")
    , @NamedQuery(name = "Bilan.findByEtatAutresChargesExternes", query = "SELECT b FROM Bilan b WHERE b.etatAutresChargesExternes = :etatAutresChargesExternes")
    , @NamedQuery(name = "Bilan.findByMargeBruteSurVenteEnLetat", query = "SELECT b FROM Bilan b WHERE b.margeBruteSurVenteEnLetat = :margeBruteSurVenteEnLetat")
    , @NamedQuery(name = "Bilan.findByProductionExercice", query = "SELECT b FROM Bilan b WHERE b.productionExercice = :productionExercice")
    , @NamedQuery(name = "Bilan.findByConsommationExercice", query = "SELECT b FROM Bilan b WHERE b.consommationExercice = :consommationExercice")
    , @NamedQuery(name = "Bilan.findByValeurAjoutee", query = "SELECT b FROM Bilan b WHERE b.valeurAjoutee = :valeurAjoutee")
    , @NamedQuery(name = "Bilan.findByTotalPassif", query = "SELECT b FROM Bilan b WHERE b.totalPassif = :totalPassif")
    , @NamedQuery(name = "Bilan.findByTotalActif", query = "SELECT b FROM Bilan b WHERE b.totalActif = :totalActif")
    , @NamedQuery(name = "Bilan.findByResultat", query = "SELECT b FROM Bilan b WHERE b.resultat = :resultat")
    , @NamedQuery(name = "Bilan.findByResultatvaleur", query = "SELECT b FROM Bilan b WHERE b.resultatvaleur = :resultatvaleur")})
public class Bilan implements Serializable {

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
    @Column(name = "FraisPreliminaires")
    private double fraisPreliminaires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SubventionsInvestissement")
    private double subventionsInvestissement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Terrains")
    private double terrains;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Constructions")
    private double constructions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "InstallationsMaterielEtOutillage")
    private double installationsMaterielEtOutillage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaterielTransport")
    private double materielTransport;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AutresImmobilisationsPersonnelles")
    private double autresImmobilisationsPersonnelles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MaterielEtImmobilierBureau")
    private double materielEtImmobilierBureau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalImmobilisations")
    private double totalImmobilisations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalStocks")
    private double totalStocks;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Creance")
    private double creance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Banque")
    private double banque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Caisse")
    private double caisse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateModification")
    @Temporal(TemporalType.DATE)
    private Date dateModification;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_bilan")
    @Temporal(TemporalType.DATE)
    private Date dateBilan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CapitalActuel")
    private double capitalActuel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReservesLegales")
    private double reservesLegales;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AutresReserves")
    private double autresReserves;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReportAnouveau")
    private double reportAnouveau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ResultatsNetsInstanceApplication")
    private double resultatsNetsInstanceApplication;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DetteFinancementLongTerme")
    private double detteFinancementLongTerme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DetteFinancementCourTerme")
    private double detteFinancementCourTerme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FournisseursEtComptesRattaches")
    private double fournisseursEtComptesRattaches;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Personnel")
    private double personnel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrganismesSociaux")
    private double organismesSociaux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Etat")
    private double etat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ComptesAssocies")
    private double comptesAssocies;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AutresCreanciers")
    private double autresCreanciers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ChiffreAffaires")
    private double chiffreAffaires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SubventionsExploitation")
    private double subventionsExploitation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TransfertsDeCharges")
    private double transfertsDeCharges;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AchatRevendusMarchandises")
    private double achatRevendusMarchandises;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AchatsConsommesMatieresEtFournitures")
    private double achatsConsommesMatieresEtFournitures;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AutresChargesExternes")
    private double autresChargesExternes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImpotsEtTaxes")
    private double impotsEtTaxes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalAchats")
    private double totalAchats;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ChargesPersonnel")
    private double chargesPersonnel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AutresCharges")
    private double autresCharges;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ChargesFinacieres")
    private double chargesFinacieres;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DotationsExploitations")
    private double dotationsExploitations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VenteMarchandisesEnLetat")
    private double venteMarchandisesEnLetat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EtatAchatRevendusMarchandises")
    private double etatAchatRevendusMarchandises;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VenteBienEtServicesProduits")
    private double venteBienEtServicesProduits;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VariationStockProduits")
    private double variationStockProduits;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImmobilisationsCooperatives")
    private double immobilisationsCooperatives;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EtatAutresChargesExternes")
    private double etatAutresChargesExternes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MargeBruteSurVenteEnLetat")
    private double margeBruteSurVenteEnLetat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductionExercice")
    private double productionExercice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ConsommationExercice")
    private double consommationExercice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ValeurAjoutee")
    private double valeurAjoutee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalPassif")
    private double totalPassif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalActif")
    private double totalActif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Resultat")
    private String resultat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Resultat_valeur")
    private double resultatvaleur;

    public Bilan() {
    }

    public Bilan(Double id) {
        this.id = id;
    }

    public Bilan(Double id, double idCooperative, double fraisPreliminaires, double subventionsInvestissement, double terrains, double constructions, double installationsMaterielEtOutillage, double materielTransport, double autresImmobilisationsPersonnelles, double materielEtImmobilierBureau, double totalImmobilisations, double totalStocks, double creance, double banque, double caisse, Date dateModification, Date dateBilan, double capitalActuel, double reservesLegales, double autresReserves, double reportAnouveau, double resultatsNetsInstanceApplication, double detteFinancementLongTerme, double detteFinancementCourTerme, double fournisseursEtComptesRattaches, double personnel, double organismesSociaux, double etat, double comptesAssocies, double autresCreanciers, double chiffreAffaires, double subventionsExploitation, double transfertsDeCharges, double achatRevendusMarchandises, double achatsConsommesMatieresEtFournitures, double autresChargesExternes, double impotsEtTaxes, double totalAchats, double chargesPersonnel, double autresCharges, double chargesFinacieres, double dotationsExploitations, double venteMarchandisesEnLetat, double etatAchatRevendusMarchandises, double venteBienEtServicesProduits, double variationStockProduits, double immobilisationsCooperatives, double etatAutresChargesExternes, double margeBruteSurVenteEnLetat, double productionExercice, double consommationExercice, double valeurAjoutee, double totalPassif, double totalActif, String resultat, double resultatvaleur) {
        this.id = id;
        this.idCooperative = idCooperative;
        this.fraisPreliminaires = fraisPreliminaires;
        this.subventionsInvestissement = subventionsInvestissement;
        this.terrains = terrains;
        this.constructions = constructions;
        this.installationsMaterielEtOutillage = installationsMaterielEtOutillage;
        this.materielTransport = materielTransport;
        this.autresImmobilisationsPersonnelles = autresImmobilisationsPersonnelles;
        this.materielEtImmobilierBureau = materielEtImmobilierBureau;
        this.totalImmobilisations = totalImmobilisations;
        this.totalStocks = totalStocks;
        this.creance = creance;
        this.banque = banque;
        this.caisse = caisse;
        this.dateModification = dateModification;
        this.dateBilan = dateBilan;
        this.capitalActuel = capitalActuel;
        this.reservesLegales = reservesLegales;
        this.autresReserves = autresReserves;
        this.reportAnouveau = reportAnouveau;
        this.resultatsNetsInstanceApplication = resultatsNetsInstanceApplication;
        this.detteFinancementLongTerme = detteFinancementLongTerme;
        this.detteFinancementCourTerme = detteFinancementCourTerme;
        this.fournisseursEtComptesRattaches = fournisseursEtComptesRattaches;
        this.personnel = personnel;
        this.organismesSociaux = organismesSociaux;
        this.etat = etat;
        this.comptesAssocies = comptesAssocies;
        this.autresCreanciers = autresCreanciers;
        this.chiffreAffaires = chiffreAffaires;
        this.subventionsExploitation = subventionsExploitation;
        this.transfertsDeCharges = transfertsDeCharges;
        this.achatRevendusMarchandises = achatRevendusMarchandises;
        this.achatsConsommesMatieresEtFournitures = achatsConsommesMatieresEtFournitures;
        this.autresChargesExternes = autresChargesExternes;
        this.impotsEtTaxes = impotsEtTaxes;
        this.totalAchats = totalAchats;
        this.chargesPersonnel = chargesPersonnel;
        this.autresCharges = autresCharges;
        this.chargesFinacieres = chargesFinacieres;
        this.dotationsExploitations = dotationsExploitations;
        this.venteMarchandisesEnLetat = venteMarchandisesEnLetat;
        this.etatAchatRevendusMarchandises = etatAchatRevendusMarchandises;
        this.venteBienEtServicesProduits = venteBienEtServicesProduits;
        this.variationStockProduits = variationStockProduits;
        this.immobilisationsCooperatives = immobilisationsCooperatives;
        this.etatAutresChargesExternes = etatAutresChargesExternes;
        this.margeBruteSurVenteEnLetat = margeBruteSurVenteEnLetat;
        this.productionExercice = productionExercice;
        this.consommationExercice = consommationExercice;
        this.valeurAjoutee = valeurAjoutee;
        this.totalPassif = totalPassif;
        this.totalActif = totalActif;
        this.resultat = resultat;
        this.resultatvaleur = resultatvaleur;
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

    public double getFraisPreliminaires() {
        return fraisPreliminaires;
    }

    public void setFraisPreliminaires(double fraisPreliminaires) {
        this.fraisPreliminaires = fraisPreliminaires;
    }

    public double getSubventionsInvestissement() {
        return subventionsInvestissement;
    }

    public void setSubventionsInvestissement(double subventionsInvestissement) {
        this.subventionsInvestissement = subventionsInvestissement;
    }

    public double getTerrains() {
        return terrains;
    }

    public void setTerrains(double terrains) {
        this.terrains = terrains;
    }

    public double getConstructions() {
        return constructions;
    }

    public void setConstructions(double constructions) {
        this.constructions = constructions;
    }

    public double getInstallationsMaterielEtOutillage() {
        return installationsMaterielEtOutillage;
    }

    public void setInstallationsMaterielEtOutillage(double installationsMaterielEtOutillage) {
        this.installationsMaterielEtOutillage = installationsMaterielEtOutillage;
    }

    public double getMaterielTransport() {
        return materielTransport;
    }

    public void setMaterielTransport(double materielTransport) {
        this.materielTransport = materielTransport;
    }

    public double getAutresImmobilisationsPersonnelles() {
        return autresImmobilisationsPersonnelles;
    }

    public void setAutresImmobilisationsPersonnelles(double autresImmobilisationsPersonnelles) {
        this.autresImmobilisationsPersonnelles = autresImmobilisationsPersonnelles;
    }

    public double getMaterielEtImmobilierBureau() {
        return materielEtImmobilierBureau;
    }

    public void setMaterielEtImmobilierBureau(double materielEtImmobilierBureau) {
        this.materielEtImmobilierBureau = materielEtImmobilierBureau;
    }

    public double getTotalImmobilisations() {
        return totalImmobilisations;
    }

    public void setTotalImmobilisations(double totalImmobilisations) {
        this.totalImmobilisations = totalImmobilisations;
    }

    public double getTotalStocks() {
        return totalStocks;
    }

    public void setTotalStocks(double totalStocks) {
        this.totalStocks = totalStocks;
    }

    public double getCreance() {
        return creance;
    }

    public void setCreance(double creance) {
        this.creance = creance;
    }

    public double getBanque() {
        return banque;
    }

    public void setBanque(double banque) {
        this.banque = banque;
    }

    public double getCaisse() {
        return caisse;
    }

    public void setCaisse(double caisse) {
        this.caisse = caisse;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Date getDateBilan() {
        return dateBilan;
    }

    public void setDateBilan(Date dateBilan) {
        this.dateBilan = dateBilan;
    }

    public double getCapitalActuel() {
        return capitalActuel;
    }

    public void setCapitalActuel(double capitalActuel) {
        this.capitalActuel = capitalActuel;
    }

    public double getReservesLegales() {
        return reservesLegales;
    }

    public void setReservesLegales(double reservesLegales) {
        this.reservesLegales = reservesLegales;
    }

    public double getAutresReserves() {
        return autresReserves;
    }

    public void setAutresReserves(double autresReserves) {
        this.autresReserves = autresReserves;
    }

    public double getReportAnouveau() {
        return reportAnouveau;
    }

    public void setReportAnouveau(double reportAnouveau) {
        this.reportAnouveau = reportAnouveau;
    }

    public double getResultatsNetsInstanceApplication() {
        return resultatsNetsInstanceApplication;
    }

    public void setResultatsNetsInstanceApplication(double resultatsNetsInstanceApplication) {
        this.resultatsNetsInstanceApplication = resultatsNetsInstanceApplication;
    }

    public double getDetteFinancementLongTerme() {
        return detteFinancementLongTerme;
    }

    public void setDetteFinancementLongTerme(double detteFinancementLongTerme) {
        this.detteFinancementLongTerme = detteFinancementLongTerme;
    }

    public double getDetteFinancementCourTerme() {
        return detteFinancementCourTerme;
    }

    public void setDetteFinancementCourTerme(double detteFinancementCourTerme) {
        this.detteFinancementCourTerme = detteFinancementCourTerme;
    }

    public double getFournisseursEtComptesRattaches() {
        return fournisseursEtComptesRattaches;
    }

    public void setFournisseursEtComptesRattaches(double fournisseursEtComptesRattaches) {
        this.fournisseursEtComptesRattaches = fournisseursEtComptesRattaches;
    }

    public double getPersonnel() {
        return personnel;
    }

    public void setPersonnel(double personnel) {
        this.personnel = personnel;
    }

    public double getOrganismesSociaux() {
        return organismesSociaux;
    }

    public void setOrganismesSociaux(double organismesSociaux) {
        this.organismesSociaux = organismesSociaux;
    }

    public double getEtat() {
        return etat;
    }

    public void setEtat(double etat) {
        this.etat = etat;
    }

    public double getComptesAssocies() {
        return comptesAssocies;
    }

    public void setComptesAssocies(double comptesAssocies) {
        this.comptesAssocies = comptesAssocies;
    }

    public double getAutresCreanciers() {
        return autresCreanciers;
    }

    public void setAutresCreanciers(double autresCreanciers) {
        this.autresCreanciers = autresCreanciers;
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public double getSubventionsExploitation() {
        return subventionsExploitation;
    }

    public void setSubventionsExploitation(double subventionsExploitation) {
        this.subventionsExploitation = subventionsExploitation;
    }

    public double getTransfertsDeCharges() {
        return transfertsDeCharges;
    }

    public void setTransfertsDeCharges(double transfertsDeCharges) {
        this.transfertsDeCharges = transfertsDeCharges;
    }

    public double getAchatRevendusMarchandises() {
        return achatRevendusMarchandises;
    }

    public void setAchatRevendusMarchandises(double achatRevendusMarchandises) {
        this.achatRevendusMarchandises = achatRevendusMarchandises;
    }

    public double getAchatsConsommesMatieresEtFournitures() {
        return achatsConsommesMatieresEtFournitures;
    }

    public void setAchatsConsommesMatieresEtFournitures(double achatsConsommesMatieresEtFournitures) {
        this.achatsConsommesMatieresEtFournitures = achatsConsommesMatieresEtFournitures;
    }

    public double getAutresChargesExternes() {
        return autresChargesExternes;
    }

    public void setAutresChargesExternes(double autresChargesExternes) {
        this.autresChargesExternes = autresChargesExternes;
    }

    public double getImpotsEtTaxes() {
        return impotsEtTaxes;
    }

    public void setImpotsEtTaxes(double impotsEtTaxes) {
        this.impotsEtTaxes = impotsEtTaxes;
    }

    public double getTotalAchats() {
        return totalAchats;
    }

    public void setTotalAchats(double totalAchats) {
        this.totalAchats = totalAchats;
    }

    public double getChargesPersonnel() {
        return chargesPersonnel;
    }

    public void setChargesPersonnel(double chargesPersonnel) {
        this.chargesPersonnel = chargesPersonnel;
    }

    public double getAutresCharges() {
        return autresCharges;
    }

    public void setAutresCharges(double autresCharges) {
        this.autresCharges = autresCharges;
    }

    public double getChargesFinacieres() {
        return chargesFinacieres;
    }

    public void setChargesFinacieres(double chargesFinacieres) {
        this.chargesFinacieres = chargesFinacieres;
    }

    public double getDotationsExploitations() {
        return dotationsExploitations;
    }

    public void setDotationsExploitations(double dotationsExploitations) {
        this.dotationsExploitations = dotationsExploitations;
    }

    public double getVenteMarchandisesEnLetat() {
        return venteMarchandisesEnLetat;
    }

    public void setVenteMarchandisesEnLetat(double venteMarchandisesEnLetat) {
        this.venteMarchandisesEnLetat = venteMarchandisesEnLetat;
    }

    public double getEtatAchatRevendusMarchandises() {
        return etatAchatRevendusMarchandises;
    }

    public void setEtatAchatRevendusMarchandises(double etatAchatRevendusMarchandises) {
        this.etatAchatRevendusMarchandises = etatAchatRevendusMarchandises;
    }

    public double getVenteBienEtServicesProduits() {
        return venteBienEtServicesProduits;
    }

    public void setVenteBienEtServicesProduits(double venteBienEtServicesProduits) {
        this.venteBienEtServicesProduits = venteBienEtServicesProduits;
    }

    public double getVariationStockProduits() {
        return variationStockProduits;
    }

    public void setVariationStockProduits(double variationStockProduits) {
        this.variationStockProduits = variationStockProduits;
    }

    public double getImmobilisationsCooperatives() {
        return immobilisationsCooperatives;
    }

    public void setImmobilisationsCooperatives(double immobilisationsCooperatives) {
        this.immobilisationsCooperatives = immobilisationsCooperatives;
    }

    public double getEtatAutresChargesExternes() {
        return etatAutresChargesExternes;
    }

    public void setEtatAutresChargesExternes(double etatAutresChargesExternes) {
        this.etatAutresChargesExternes = etatAutresChargesExternes;
    }

    public double getMargeBruteSurVenteEnLetat() {
        return margeBruteSurVenteEnLetat;
    }

    public void setMargeBruteSurVenteEnLetat(double margeBruteSurVenteEnLetat) {
        this.margeBruteSurVenteEnLetat = margeBruteSurVenteEnLetat;
    }

    public double getProductionExercice() {
        return productionExercice;
    }

    public void setProductionExercice(double productionExercice) {
        this.productionExercice = productionExercice;
    }

    public double getConsommationExercice() {
        return consommationExercice;
    }

    public void setConsommationExercice(double consommationExercice) {
        this.consommationExercice = consommationExercice;
    }

    public double getValeurAjoutee() {
        return valeurAjoutee;
    }

    public void setValeurAjoutee(double valeurAjoutee) {
        this.valeurAjoutee = valeurAjoutee;
    }

    public double getTotalPassif() {
        return totalPassif;
    }

    public void setTotalPassif(double totalPassif) {
        this.totalPassif = totalPassif;
    }

    public double getTotalActif() {
        return totalActif;
    }

    public void setTotalActif(double totalActif) {
        this.totalActif = totalActif;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public double getResultatvaleur() {
        return resultatvaleur;
    }

    public void setResultatvaleur(double resultatvaleur) {
        this.resultatvaleur = resultatvaleur;
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
        return "jpa2.Bilan[ id=" + id + " ]";
    }
    
}
