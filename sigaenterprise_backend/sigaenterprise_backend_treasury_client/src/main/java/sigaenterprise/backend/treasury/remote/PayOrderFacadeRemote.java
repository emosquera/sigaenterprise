/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.treasury.model.PayOrder;

/**
 *
 * @author martinmgb
 */

@Remote
public interface PayOrderFacadeRemote {
    public final String JNDI_REMOTE_NAME = "ejb/payOrderFacadeRemote";
    
    void create(PayOrder asiento);

    void edit(PayOrder asiento);

    void remove(PayOrder asiento);

    PayOrder find(Object id);

    List<PayOrder> findAll();

    List<PayOrder> findRange(int[] range);

    int count();
}
