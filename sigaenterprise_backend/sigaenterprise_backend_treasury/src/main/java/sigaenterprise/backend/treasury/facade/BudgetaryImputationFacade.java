/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.treasury.model.BudgetaryImputation;
/**
 *
 * @author MiguelAngel
 */
@Stateless
public class BudgetaryImputationFacade extends AbstractFacade<BudgetaryImputation> implements BudgetaryImputationFacadeLocal {

    @PersistenceContext(unitName = "sigaenterprise_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudgetaryImputationFacade() {
        super(BudgetaryImputation.class);
    }
    
}
