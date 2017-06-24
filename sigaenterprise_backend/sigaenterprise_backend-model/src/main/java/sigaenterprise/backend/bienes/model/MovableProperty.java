/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;


import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import sigaenterprise.backend.auth.model.BasicAttributes;

/**
 *
 * @author Desiree
 */
@Entity
@Table(name="movable_propertys")
public class MovableProperty extends BasicAttributes {
    
    String code;
    String description;
    Calendar date_purchase;
    double initial_value;    
    Asset asset;
    
    @Column(name="code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @Column(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="date_purchase")
    @Temporal(TemporalType.DATE)
    public Calendar getDatePurchase() {
        return date_purchase;
    }

    public void setDatePurchase(Calendar date_purchase) {
        this.date_purchase = date_purchase;
    }
    
    @Column(name="initial_value")
    public double getInitialValue() {
        return initial_value;
    }

    public void setInitialValue(double initial_value) {
        this.initial_value = initial_value;
    }
    
    @ManyToOne
    public Asset getAsset() {
        return asset;
    }

    public void setActivo(Asset asset) {
        this.asset = asset;
    }
           
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovableProperty)) {
            return false;
        }
        MovableProperty other = (MovableProperty) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.MovableProperty[ id=" + getId() + " ]";
    }
    
}
