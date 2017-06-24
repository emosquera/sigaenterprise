/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.business;


import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import javax.ejb.Remote;
import sigaenterprise.backend.contabilidad.facade.CuentaContableFacadeLocal;
import sigaenterprise.backend.contabilidad.model.CuentaContable;
import sigaenterprise.backend.contabilidad.remote.CuentaContableFacadeRemote;

/**
 *
 * @author syslife01
 */
@Stateless(name = "cuentaContableFacadeRemote", mappedName = CuentaContableFacadeRemote.JNDI_REMOTE_NAME)
@Remote(CuentaContableFacadeRemote.class)
public class CuentaContableBusinessFacade implements CuentaContableFacadeRemote {
    
    @EJB
    CuentaContableFacadeLocal cuentaContableFacadeLocal;

    @Override
    public void create(CuentaContable cuentaContable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(CuentaContable cuentaContable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(CuentaContable cuentaContable) {
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
