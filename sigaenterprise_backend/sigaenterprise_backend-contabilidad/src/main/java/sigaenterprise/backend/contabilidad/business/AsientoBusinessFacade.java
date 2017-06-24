/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.business;


import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import sigaenterprise.backend.contabilidad.facade.AsientoFacadeLocal;
import sigaenterprise.backend.contabilidad.model.CuentaContable;
import sigaenterprise.backend.contabilidad.remote.AsientoFacadeRemote;

/**
 *
 * @author syslife01
 */
@Stateless(name = "asientoFacadeRemote", mappedName = AsientoFacadeRemote.JNDI_REMOTE_NAME)
@Remote(AsientoFacadeRemote.class)
public class AsientoBusinessFacade implements AsientoFacadeRemote {
    
    @EJB
    AsientoFacadeLocal asientoFacadeLocal;

    @Override
    public void create(CuentaContable asiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(CuentaContable asiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(CuentaContable asiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CuentaContable find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CuentaContable> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CuentaContable> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
