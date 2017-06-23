/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.contabilidad.model.CuentaContable;

/**
 *
 * @author syslife01
 */
@Remote
public interface CuentaContableFacadeRemote {
    
    public final String JNDI_REMOTE_NAME = "ejb/cuentaContableFacadeRemote";
    
    void create(CuentaContable cuentaContable);

    void edit(CuentaContable cuentaContable);

    void remove(CuentaContable cuentaContable);

    CuentaContable find(Object id);

    List<CuentaContable> findAll();

    List<CuentaContable> findRange(int[] range);

    int count();
}
