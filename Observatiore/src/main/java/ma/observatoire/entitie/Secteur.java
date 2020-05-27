/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.observatoire.entitie;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author nos
 */
@Entity
@Table(name = "secteur")
@NamedQueries({
    @NamedQuery(name = "Secteur.findAll", query = "SELECT s FROM Secteur s")})
public class Secteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_secteur")
    private Integer idSecteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "secteur")
    private String secteur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSecteur")
    private List<Branche> brancheList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSecteur")
    private List<Cooperative> cooperativeList;

    public Secteur() {
    }

    public Secteur(Integer idSecteur) {
        this.idSecteur = idSecteur;
    }

    public Secteur(Integer idSecteur, String secteur) {
        this.idSecteur = idSecteur;
        this.secteur = secteur;
    }

    public Integer getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(Integer idSecteur) {
        this.idSecteur = idSecteur;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public List<Branche> getBrancheList() {
        return brancheList;
    }

    public void setBrancheList(List<Branche> brancheList) {
        this.brancheList = brancheList;
    }

    public List<Cooperative> getCooperativeList() {
        return cooperativeList;
    }

    public void setCooperativeList(List<Cooperative> cooperativeList) {
        this.cooperativeList = cooperativeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSecteur != null ? idSecteur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Secteur)) {
            return false;
        }
        Secteur other = (Secteur) object;
        if ((this.idSecteur == null && other.idSecteur != null) || (this.idSecteur != null && !this.idSecteur.equals(other.idSecteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ma.observatoire.entitie.Secteur[ idSecteur=" + idSecteur + " ]";
    }
    
}
