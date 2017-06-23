/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.contabilidad.model.CuentaContable;

/**
 *
 * @author syslife01
 */
@Local
public interface CuentaContableFacadeLocal {

    void create(CuentaContable cuentaContable);

    void edit(CuentaContable cuentaContable);

    void remove(CuentaContable cuentaContable);

    CuentaContable find(Object id);

    List<CuentaContable> findAll();

    List<CuentaContable> findRange(int[] range);

    int count();
    
}
