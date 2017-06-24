/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.util.List;
import javax.persistence.Column;
import sigaenterprise.backend.auth.model.BasicAttributes;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Desiree
 */
@Entity
@Table(name="coverages")
public class Coverage extends BasicAttributes {
    
    @Column(name="code")
    private String code;
    @Column(name="description")
    private String description;
    @OneToMany
    private List<InsuranceCoverage> insurances;

    public List<InsuranceCoverage> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<InsuranceCoverage> insurances) {
        this.insurances = insurances;
    }
    
    
    public String getCode() {
        return code;
    }

    public void setCodigo(String code) {
        this.code = code;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof Coverage)) {
            return false;
        }
        Coverage other = (Coverage) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.Coverage[ id=" + getId() + " ]";
    }
    
}
