/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.purchase.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.purchase.model.PurchaseDetail;

/**
 *
 * @author syslife01
 */
@Local
public interface PurchaseDetailFacadeLocal {

    void create(PurchaseDetail purchaseDetail);

    void edit(PurchaseDetail purchaseDetail);

    void remove(PurchaseDetail purchaseDetail);

    PurchaseDetail find(Object id);

    List<PurchaseDetail> findAll();

    List<PurchaseDetail> findRange(int[] range);

    int count();
    
}
