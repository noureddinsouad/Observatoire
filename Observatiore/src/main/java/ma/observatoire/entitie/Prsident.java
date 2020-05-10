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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "prsident")
@NamedQueries({
    @NamedQuery(name = "Prsident.findAll", query = "SELECT p FROM Prsident p")})
public class Prsident implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Double idUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actived")
    private boolean actived;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nom_president")
    private String nomPresident;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telephone_president")
    private int telephonePresident;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "user_name")
    private String userName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPresident")
    private List<Cooperative> cooperativeList;

    public Prsident() {
    }

    public Prsident(Double idUser) {
        this.idUser = idUser;
    }

    public Prsident(Double idUser, boolean actived, String nomPresident, String password, int telephonePresident, String userName) {
        this.idUser = idUser;
        this.actived = actived;
        this.nomPresident = nomPresident;
        this.password = password;
        this.telephonePresident = telephonePresident;
        this.userName = userName;
    }

    public Double getIdUser() {
        return idUser;
    }

    public void setIdUser(Double idUser) {
        this.idUser = idUser;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelephonePresident() {
        return telephonePresident;
    }

    public void setTelephonePresident(int telephonePresident) {
        this.telephonePresident = telephonePresident;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        return "ma.observatoire.entitie.Prsident[ idUser=" + idUser + " ]";
    }
    
}
