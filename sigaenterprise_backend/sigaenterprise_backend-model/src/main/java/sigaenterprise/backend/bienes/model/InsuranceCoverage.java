/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import sigaenterprise.backend.auth.model.BasicAttributes;
/**
 *
 * @author Desiree
 */
@Entity
@Table(name="insuranceCoverage")
public class InsuranceCoverage extends BasicAttributes {
    
    @Column(name="insuranceId")
    @Id
    private Long insuranceId;
    
    @Column(name="coverageId")
    @Id
    private Long coverageId;
    
    @Column(name="amount")
    private double amount;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="insuranceId", referencedColumnName="ID")
    private Insurance insurance;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="coverageId", referencedColumnName="ID")
    private Coverage coverage;
    
    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }
    
    public Long getCoverageId() {
        return coverageId;
    }

    public void setCoverageId(Long coverageId) {
        this.coverageId = coverageId;
    }
    
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Coverage getCoverage() {
        return coverage;
    }

    public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
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
        if (!(object instanceof InsuranceCoverage)) {
            return false;
        }
        InsuranceCoverage other = (InsuranceCoverage) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.InsuranceCoverage[ id=" + getId() + " ]";
    }
    
}
