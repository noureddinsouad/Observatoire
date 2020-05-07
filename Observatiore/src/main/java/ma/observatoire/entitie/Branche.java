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
@Table(name = "branche")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Branche.findAll", query = "SELECT b FROM Branche b")
    , @NamedQuery(name = "Branche.findByIdBranche", query = "SELECT b FROM Branche b WHERE b.idBranche = :idBranche")
    , @NamedQuery(name = "Branche.findByIdSecteur", query = "SELECT b FROM Branche b WHERE b.idSecteur = :idSecteur")
    , @NamedQuery(name = "Branche.findByBranche", query = "SELECT b FROM Branche b WHERE b.branche = :branche")})
public class Branche implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_branche")
    private Double idBranche;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_secteur")
    private double idSecteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "branche")
    private String branche;

    public Branche() {
    }

    public Branche(Double idBranche) {
        this.idBranche = idBranche;
    }

    public Branche(Double idBranche, double idSecteur, String branche) {
        this.idBranche = idBranche;
        this.idSecteur = idSecteur;
        this.branche = branche;
    }

    public Double getIdBranche() {
        return idBranche;
    }

    public void setIdBranche(Double idBranche) {
        this.idBranche = idBranche;
    }

    public double getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(double idSecteur) {
        this.idSecteur = idSecteur;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBranche != null ? idBranche.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Branche)) {
            return false;
        }
        Branche other = (Branche) object;
        if ((this.idBranche == null && other.idBranche != null) || (this.idBranche != null && !this.idBranche.equals(other.idBranche))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa2.Branche[ idBranche=" + idBranche + " ]";
    }
    
}
