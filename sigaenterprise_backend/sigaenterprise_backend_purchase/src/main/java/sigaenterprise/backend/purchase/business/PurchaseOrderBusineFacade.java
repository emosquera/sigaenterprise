/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.purchase.business;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import sigaenterprise.backend.purchase.facade.PurchaseOrderFacadeLocal;
import sigaenterprise.backend.purchase.model.PurchaseOrder;
import sigaenterprise.backend.purchase.remote.PurchaseOrderFacadeRemote;

/**
 *
 * @author syslife01
 */
@Stateless(name = "purchaseOrderFacadeRemote", mappedName = PurchaseOrderFacadeRemote.JNDI_REMOTE_NAME)
@Remote(PurchaseOrderFacadeRemote.class)
public class PurchaseOrderBusineFacade implements PurchaseOrderFacadeRemote{

     @EJB
    PurchaseOrderFacadeLocal purchaseOrderFacadeLocal;

    
    @Override
    public void create(PurchaseOrder purchaseOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(PurchaseOrder purchaseOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(PurchaseOrder purchaseOrder) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PurchaseOrder find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseOrder> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseOrder> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
