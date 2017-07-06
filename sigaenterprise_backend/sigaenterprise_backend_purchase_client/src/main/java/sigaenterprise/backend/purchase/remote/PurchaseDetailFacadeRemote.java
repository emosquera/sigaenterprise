/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.purchase.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.purchase.model.PurchaseDetail;

/**
 *
 * @author syslife01
 */
@Remote
public interface PurchaseDetailFacadeRemote {
    
   public final String JNDI_REMOTE_NAME = "ejb/purchaseDetailFacadeRemote";
     
     void create(PurchaseDetail purchaseDetail);

    void edit(PurchaseDetail purchaseDetail);

    void remove(PurchaseDetail purchaseDetail);

    PurchaseDetail find(Object id);

    List<PurchaseDetail> findAll();

    List<PurchaseDetail> findRange(int[] range);

    int count();    
  
    
}
