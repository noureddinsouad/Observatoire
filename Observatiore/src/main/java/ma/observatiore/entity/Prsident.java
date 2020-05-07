/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.observatiore.entity;

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
@Table(name = "prsident")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prsident.findAll", query = "SELECT p FROM Prsident p")
    , @NamedQuery(name = "Prsident.findByIdUser", query = "SELECT p FROM Prsident p WHERE p.idUser = :idUser")
    , @NamedQuery(name = "Prsident.findByUserName", query = "SELECT p FROM Prsident p WHERE p.userName = :userName")
    , @NamedQuery(name = "Prsident.findByPassword", query = "SELECT p FROM Prsident p WHERE p.password = :password")
    , @NamedQuery(name = "Prsident.findByActived", query = "SELECT p FROM Prsident p WHERE p.actived = :actived")
    , @NamedQuery(name = "Prsident.findByNomPresident", query = "SELECT p FROM Prsident p WHERE p.nomPresident = :nomPresident")
    , @NamedQuery(name = "Prsident.findByTelephonePresident", query = "SELECT p FROM Prsident p WHERE p.telephonePresident = :telephonePresident")})
public class Prsident implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUser")
    private Double idUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "userName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actived")
    private boolean actived;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NomPresident")
    private String nomPresident;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TelephonePresident")
    private int telephonePresident;

    public Prsident() {
    }

    public Prsident(Double idUser) {
        this.idUser = idUser;
    }

    public Prsident(Double idUser, String userName, String password, boolean actived, String nomPresident, int telephonePresident) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.actived = actived;
        this.nomPresident = nomPresident;
        this.telephonePresident = telephonePresident;
    }

    public Double getIdUser() {
        return idUser;
    }

    public void setIdUser(Double idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getActived() {
        return actived;
    }

    public void setActived(boolean actived) {
        this.actived = actived;
    }

    public String getNomPresident() {
        return nomPresident;
    }

    public void setNomPresident(String nomPresident) {
        this.nomPresident = nomPresident;
    }

    public int getTelephonePresident() {
        return telephonePresident;
    }

    public void setTelephonePresident(int telephonePresident) {
        this.telephonePresident = telephonePresident;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prsident)) {
            return false;
        }
        Prsident other = (Prsident) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa2.Prsident[ idUser=" + idUser + " ]";
    }
    
}
