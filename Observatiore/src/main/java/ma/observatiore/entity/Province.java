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
@Table(name = "province")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Province.findAll", query = "SELECT p FROM Province p")
    , @NamedQuery(name = "Province.findByIdProvince", query = "SELECT p FROM Province p WHERE p.idProvince = :idProvince")
    , @NamedQuery(name = "Province.findByIdRegion", query = "SELECT p FROM Province p WHERE p.idRegion = :idRegion")
    , @NamedQuery(name = "Province.findByProvince", query = "SELECT p FROM Province p WHERE p.province = :province")})
public class Province implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_province")
    private Double idProvince;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_region")
    private double idRegion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "province")
    private String province;

    public Province() {
    }

    public Province(Double idProvince) {
        this.idProvince = idProvince;
    }

    public Province(Double idProvince, double idRegion, String province) {
        this.idProvince = idProvince;
        this.idRegion = idRegion;
        this.province = province;
    }

    public Double getIdProvince() {
        return idProvince;
    }

    public void setIdProvince(Double idProvince) {
        this.idProvince = idProvince;
    }

    public double getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(double idRegion) {
        this.idRegion = idRegion;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProvince != null ? idProvince.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Province)) {
            return false;
        }
        Province other = (Province) object;
        if ((this.idProvince == null && other.idProvince != null) || (this.idProvince != null && !this.idProvince.equals(other.idProvince))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa2.Province[ idProvince=" + idProvince + " ]";
    }
    
}
