/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.facade;

import sigaenterprise.backend.treasury.model.PayOrder;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author martinmgb
 */
@Local
public interface PayOrderFacadeLocal {
    
    void create(PayOrder payOrder);

    void edit(PayOrder payOrder);

    void remove(PayOrder payOrder);

    PayOrder find(Object id);

    List<PayOrder> findAll();

    List<PayOrder> findRange(int[] range);

    int count();
}
