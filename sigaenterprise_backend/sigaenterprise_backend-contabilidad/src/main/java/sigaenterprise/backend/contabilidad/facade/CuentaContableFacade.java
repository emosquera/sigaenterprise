/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.contabilidad.model.CuentaContable;

/**
 *
 * @author syslife01
 */
@Stateless
public class CuentaContableFacade extends AbstractFacade<CuentaContable> implements CuentaContableFacadeLocal {

    @PersistenceContext(unitName = "com.sigaenterprise_sigaenterprise_backend-contabilidad_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuentaContableFacade() {
        super(CuentaContable.class);
    }
    
}
