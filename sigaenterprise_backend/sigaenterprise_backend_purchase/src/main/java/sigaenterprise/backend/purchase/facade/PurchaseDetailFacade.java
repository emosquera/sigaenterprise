/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.purchase.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.purchase.model.PurchaseDetail;

/**
 *
 * @author syslife01
 */
@Stateless
public class PurchaseDetailFacade extends AbstractFacade<PurchaseDetail> implements PurchaseDetailFacadeLocal {

    @PersistenceContext(unitName = "sigaenterprise_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PurchaseDetailFacade() {
        super(PurchaseDetail.class);
    }
    
}
