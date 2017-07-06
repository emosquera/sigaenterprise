/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.purchase.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.purchase.model.PurchaseOrder;

/**
 *
 * @author syslife01
 */
@Remote
public interface PurchaseOrderFacadeRemote {
    
 public final String JNDI_REMOTE_NAME = "ejb/purchaseOrderFacadeRemote";
     
     void create(PurchaseOrder purchaseOrder);

    void edit(PurchaseOrder purchaseOrder);

    void remove(PurchaseOrder purchaseOrder);

    PurchaseOrder find(Object id);

    List<PurchaseOrder> findAll();

    List<PurchaseOrder> findRange(int[] range);

    int count();    
    
}
