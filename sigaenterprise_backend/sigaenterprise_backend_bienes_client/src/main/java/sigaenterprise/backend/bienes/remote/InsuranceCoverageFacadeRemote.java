/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.remote;

import javax.ejb.Remote;
import sigaenterprise.backend.bienes.model.InsuranceCoverage;

/**
 *
 * @author Desiree
 */
@Remote
public interface InsuranceCoverageFacadeRemote {
    public final String JNDI_REMOTE_NAME="ejb/insuranceCoverageFacadeRemote";
    
    public InsuranceCoverage findInsuranceCoverage(Long id);
    
    
}
