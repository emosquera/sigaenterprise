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
import sigaenterprise.backend.purchase.facade.PurchaseDetailFacadeLocal;
import sigaenterprise.backend.purchase.model.PurchaseDetail;
import sigaenterprise.backend.purchase.remote.PurchaseDetailFacadeRemote;

/**
 *
 * @author syslife01
 */
@Stateless(name = "purchaseDetailFacadeRemote", mappedName = PurchaseDetailFacadeRemote.JNDI_REMOTE_NAME)
@Remote(PurchaseDetailFacadeRemote.class)
public class PurchaseDetailBusineFacade implements PurchaseDetailFacadeRemote {

     @EJB
    PurchaseDetailFacadeLocal purchaseDetailFacadeLocal;
    
    
    @Override
    public void create(PurchaseDetail purchaseDetail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(PurchaseDetail purchaseDetail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(PurchaseDetail purchaseDetail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PurchaseDetail find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseDetail> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseDetail> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
