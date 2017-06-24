/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.bienes.model.InsuranceCoverage;

/**
 *
 * @author Desiree
 */
@Stateless
public class InsuranceCoverageFacade extends AbstractFacade<InsuranceCoverage> implements InsuranceCoverageFacadeLocal{

    @PersistenceContext(unitName = "sigaenterprise_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public InsuranceCoverageFacade(){
       super(InsuranceCoverage.class);
    }
}
