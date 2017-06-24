/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Desiree
 */
@Entity
public class InsuranceCoverageId implements Serializable {
    
    private Long insuranceid;
    private Long coverageid;
    
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
    
    

    @Override
    public int hashCode() {
       return (int)(insuranceid + coverageid);
    }

    @Override
    public boolean equals(Object object) {
         if (object instanceof InsuranceCoverageId) {
            InsuranceCoverageId otherId = (InsuranceCoverageId) object;
            return (otherId.insuranceid == this.insuranceid) && (otherId.coverageid == this.coverageid);
          }
          return false;
    }
    
}
