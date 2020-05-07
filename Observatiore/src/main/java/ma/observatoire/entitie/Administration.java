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
@Table(name = "administration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administration.findAll", query = "SELECT a FROM Administration a")
    , @NamedQuery(name = "Administration.findByIdAdmin", query = "SELECT a FROM Administration a WHERE a.idAdmin = :idAdmin")
    , @NamedQuery(name = "Administration.findByUsername", query = "SELECT a FROM Administration a WHERE a.username = :username")
    , @NamedQuery(name = "Administration.findByPassword", query = "SELECT a FROM Administration a WHERE a.password = :password")})
public class Administration implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_admin")
    private Double idAdmin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "password")
    private String password;

    public Administration() {
    }

    public Administration(Double idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Administration(Double idAdmin, String username, String password) {
        this.idAdmin = idAdmin;
        this.username = username;
        this.password = password;
    }

    public Double getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Double idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdmin != null ? idAdmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administration)) {
            return false;
        }
        Administration other = (Administration) object;
        if ((this.idAdmin == null && other.idAdmin != null) || (this.idAdmin != null && !this.idAdmin.equals(other.idAdmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa2.Administration[ idAdmin=" + idAdmin + " ]";
    }
    
}
