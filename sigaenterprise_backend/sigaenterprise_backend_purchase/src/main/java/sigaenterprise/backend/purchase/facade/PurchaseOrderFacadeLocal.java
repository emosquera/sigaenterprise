/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.purchase.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.purchase.model.PurchaseOrder;

/**
 *
 * @author syslife01
 */
@Local
public interface PurchaseOrderFacadeLocal {

    void create(PurchaseOrder purchaseOrder);

    void edit(PurchaseOrder purchaseOrder);

    void remove(PurchaseOrder purchaseOrder);

    PurchaseOrder find(Object id);

    List<PurchaseOrder> findAll();

    List<PurchaseOrder> findRange(int[] range);

    int count();
    
}
