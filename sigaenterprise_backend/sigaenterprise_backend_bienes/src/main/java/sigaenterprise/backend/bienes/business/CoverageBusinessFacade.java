/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.bienes.model.Coverage;
import sigaenterprise.backend.bienes.remote.CoverageFacadeRemote;
import sigaenterprise.backend.bienes.facade.CoverageFacadeLocal;

/**
 *
 * @author martin
 */
@Stateless(name="coverageFacadeRemote", mappedName=CoverageFacadeRemote.JDNI_REMOTE_NAME)
@Remote(CoverageFacadeRemote.class)
public class CoverageBusinessFacade implements CoverageFacadeRemote{

    @EJB
    CoverageFacadeLocal coverageFacadeLocal;
    
    @Override
    public Coverage findCoverage(Long id){
    return coverageFacadeLocal.find(id);
    }
    

}
