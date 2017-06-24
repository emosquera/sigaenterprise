/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.bienes.model.Coverage;

/**
 *
 * @author Desiree
 */
@Stateless
public class CoverageFacade extends AbstractFacade<Coverage> implements CoverageFacadeLocal {

    @PersistenceContext(unitName = "com.sigaenterprise_sigaenterprise_backend_bienes_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CoverageFacade() {
        super(Coverage.class);
    }
    
}
