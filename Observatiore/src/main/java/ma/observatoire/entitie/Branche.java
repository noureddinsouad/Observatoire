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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "branche")
@NamedQueries({
    @NamedQuery(name = "Branche.findAll", query = "SELECT b FROM Branche b")})
public class Branche implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_branche")
    private Integer idBranche;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "branche")
    private String branche;
    @JoinColumn(name = "id_secteur", referencedColumnName = "id_secteur")
    @ManyToOne(optional = false)
    private Secteur idSecteur;


    public Branche() {
    }

    public Branche(Integer idBranche) {
        this.idBranche = idBranche;
    }

    public Branche(Integer idBranche, String branche) {
        this.idBranche = idBranche;
        this.branche = branche;
    }

    public Integer getIdBranche() {
        return idBranche;
    }

    public void setIdBranche(Integer idBranche) {
        this.idBranche = idBranche;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public Secteur getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(Secteur idSecteur) {
        this.idSecteur = idSecteur;
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
        return "ma.observatoire.entitie.Branche[ idBranche=" + idBranche + " ]";
    }
    
}
