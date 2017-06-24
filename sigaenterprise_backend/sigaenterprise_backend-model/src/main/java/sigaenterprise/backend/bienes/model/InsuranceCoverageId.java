/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.io.Serializable;
import javax.persistence.Column;

/**
 *
 * @author Desiree
 */

public class InsuranceCoverageId implements Serializable {
    
    private Long insuranceId;
    private Long coverageId;
    
    @Column(name="insuranceId")
    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }
    
    @Column(name="coverageId")
    public Long getCoverageId() {
        return coverageId;
    }

    public void setCoverageid(Long coverageId) {
        this.coverageId = coverageId;
    }
    
    

    @Override
    public int hashCode() {
       return (int)(insuranceId + coverageId);
    }

    @Override
    public boolean equals(Object object) {
         if (object instanceof InsuranceCoverageId) {
            InsuranceCoverageId otherId = (InsuranceCoverageId) object;
            return (otherId.insuranceId == this.insuranceId) && (otherId.coverageId == this.coverageId);
          }
          return false;
    }
    
}
