/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.business;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import sigaenterprise.backend.treasury.facade.PayOrderFacadeLocal;
import sigaenterprise.backend.treasury.model.PayOrder;
import sigaenterprise.backend.treasury.remote.PayOrderFacadeRemote;

/**
 *
 * @author martinmgb
 */
@Stateless(name = "payOrderFacadeRemote", mappedName = PayOrderFacadeRemote.JNDI_REMOTE_NAME)
@Remote(PayOrderFacadeRemote.class)
public class PayOrderBusinessFacade implements PayOrderFacadeRemote{
    @EJB
    PayOrderFacadeLocal payOrderFacadeLocal;

    @Override
    public void create(PayOrder asiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(PayOrder asiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(PayOrder asiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PayOrder find(Object id) {
        return payOrderFacadeLocal.find(id);    
    }

    @Override
    public List<PayOrder> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PayOrder> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
