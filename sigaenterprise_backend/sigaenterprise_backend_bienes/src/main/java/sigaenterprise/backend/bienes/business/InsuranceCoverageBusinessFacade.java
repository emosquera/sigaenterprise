/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import sigaenterprise.backend.bienes.facade.InsuranceCoverageFacadeLocal;
import sigaenterprise.backend.bienes.model.InsuranceCoverage;
import sigaenterprise.backend.bienes.remote.InsuranceCoverageFacadeRemote;
/**
 *
 * @author Desiree
 */
@Stateless(name="insuranceCoverageFacadeRemote", mappedName=InsuranceCoverageFacadeRemote.JNDI_REMOTE_NAME)
@Remote(InsuranceCoverageFacadeRemote.class)
public class InsuranceCoverageBusinessFacade implements InsuranceCoverageFacadeRemote{

    @EJB
    InsuranceCoverageFacadeLocal insuranceCoverageFacadeLocal;
    
    @Override
    public InsuranceCoverage findInsuranceCoverage(Long id){
      return insuranceCoverageFacadeLocal.find(id);
    }
}
