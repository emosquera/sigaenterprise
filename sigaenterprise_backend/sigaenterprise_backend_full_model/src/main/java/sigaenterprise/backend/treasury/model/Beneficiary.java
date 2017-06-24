/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import sigaenterprise.backend.auth.model.BasicAttributes;

/**
 *
 * @author martinmgb
 */
@Entity
@Table(name="beneficiarys")
public class Beneficiary extends BasicAttributes{
    private String identificationCard;
    private String name;
    
    @Column(name = "identificationCard")
    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }
    
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(object instanceof Beneficiary)) {
            return false;
        }
        Beneficiary other = (Beneficiary) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }
    

    @Override
    public String toString() {
        return "sigaenterprise.backend.treasury.model.Beneficiary[ id=" + this.getId() + " ]";
    }
}
