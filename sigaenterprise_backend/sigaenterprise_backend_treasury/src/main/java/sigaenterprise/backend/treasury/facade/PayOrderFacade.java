/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.treasury.model.PayOrder;

/**
 *
 * @author martinmgb
 */
@Stateless
public class PayOrderFacade extends AbstractFacade<PayOrder> implements PayOrderFacadeLocal {
    
    @PersistenceContext(unitName = "sigaenterprise_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PayOrderFacade() {
        super(PayOrder.class);
    }
}
