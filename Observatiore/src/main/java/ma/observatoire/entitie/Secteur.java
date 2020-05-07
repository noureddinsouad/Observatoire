/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.observatoire.entitie;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nos
 */
@Entity
@Table(name = "secteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Secteur.findAll", query = "SELECT s FROM Secteur s")
    , @NamedQuery(name = "Secteur.findByIdSecteur", query = "SELECT s FROM Secteur s WHERE s.idSecteur = :idSecteur")
    , @NamedQuery(name = "Secteur.findBySecteur", query = "SELECT s FROM Secteur s WHERE s.secteur = :secteur")})
public class Secteur implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_secteur")
    private Double idSecteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "secteur")
    private String secteur;

    public Secteur() {
    }

    public Secteur(Double idSecteur) {
        this.idSecteur = idSecteur;
    }

    public Secteur(Double idSecteur, String secteur) {
        this.idSecteur = idSecteur;
        this.secteur = secteur;
    }

    public Double getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(Double idSecteur) {
        this.idSecteur = idSecteur;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
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
        return "jpa2.Secteur[ idSecteur=" + idSecteur + " ]";
    }
    
}
