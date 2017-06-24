/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.util.Calendar;
import java.util.List;
import sigaenterprise.backend.auth.model.BasicAttributes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ogutierrez
 */
@Entity
public class Insurance extends BasicAttributes{
 
    private static final long serialVersionUID = 1L;
    private Long id;
    private String policy;
    private Calendar startDate;
    private Calendar endDate;
    private String nameInsurer;
    private MovableProperty movableProperty;
    //private 

    private List<InsuranceCoverage> insurancees;

    @OneToMany
    public List<InsuranceCoverage> getInsurancees() {
        return insurancees;
    }

    public void setCoverage(List<InsuranceCoverage> insurancees) {
        this.insurancees = insurancees;
    }
    
    @Column(name = "policy")
    public String getPolicy() {
        return policy;
    }
    
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @Column(name = "startDate")
    @Temporal(TemporalType.DATE)
    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    @Column(name = "endDate")
    @Temporal(TemporalType.DATE)
    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    @Column(name = "nameInsurer")
    public String getNameInsurer() {
        return nameInsurer;
    }

    public void setNameInsurer(String nameInsurer) {
        this.nameInsurer = nameInsurer;
    }
    
            
         

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
        if (!(object instanceof Insurance)) {
            return false;
        }
        Insurance other = (Insurance) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.Insurance[ id=" + id + " ]";
    }
    
}
