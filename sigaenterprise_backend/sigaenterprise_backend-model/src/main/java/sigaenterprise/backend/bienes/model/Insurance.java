/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
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
public class Insurance implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String policy;
    private Calendar start_date;
    private Calendar end_date;
    private String name_insurer;
    //private 

    @OneToMany
    private List<InsuranceCoverage> insurancees;

    public List<InsuranceCoverage> getInsurancees() {
        return insurancees;
    }

    public void setCoberturas(List<InsuranceCoverage> insurancees) {
        this.insurancees = insurancees;
    }
    
    @Column(name = "policy")
    public String getPolicy() {
        return policy;
    }
    
    public void setPoliza(String policy) {
        this.policy = policy;
    }

    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    public Calendar getStartDate() {
        return start_date;
    }

    public void setFecini(Calendar start_date) {
        this.start_date = start_date;
    }

    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    public Calendar getEndDate() {
        return end_date;
    }

    public void setFecfin(Calendar end_date) {
        this.end_date = end_date;
    }

    @Column(name = "name_insurer")
    public String getNameInsurer() {
        return name_insurer;
    }

    public void setNameInsurer(String name_insurer) {
        this.name_insurer = name_insurer;
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
