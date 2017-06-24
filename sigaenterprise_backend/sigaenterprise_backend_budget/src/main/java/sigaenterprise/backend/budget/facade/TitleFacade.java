/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.budget.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.budget.model.Title;

/**
 *
 * @author syslife02
 */
@Stateless
public class TitleFacade extends AbstractFacade<Title> implements TitleFacadeLocal {

    @PersistenceContext(unitName = "com.sigaenterprise_sigaenterprise_backend_budget_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TitleFacade() {
        super(Title.class);
    }
    
}
