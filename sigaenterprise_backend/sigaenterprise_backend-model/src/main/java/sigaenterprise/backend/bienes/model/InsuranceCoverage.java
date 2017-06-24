/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Desiree
 */
@Entity
@Table(name="insurance_coverage")
@IdClass(InsuranceCoverageId.class)
public class InsuranceCoverage implements Serializable {
    
    @Id
    private Long insuranceid;
    
    @Id
    private Long coverageid;
    
    private double amount;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="insuranceid", referencedColumnName="ID")
    private Insurance insurance;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="coverageid", referencedColumnName="ID")
    private Coverage coverage;
    
    @Column(name="insurance_id")
    public Long getInsuranceid() {
        return insuranceid;
    }

    public void setInsuranceid(Long insuranceid) {
        this.insuranceid = insuranceid;
    }
    
    @Column(name="coverage_id")
    public Long getCoverageid() {
        return coverageid;
    }

    public void setCoverageid(Long coverageid) {
        this.coverageid = coverageid;
    }
    
    @Column(name="amount")
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
    
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsuranceCoverage)) {
            return false;
        }
        InsuranceCoverage other = (InsuranceCoverage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.SeguroCobertura[ id=" + id + " ]";
    }
    
}
