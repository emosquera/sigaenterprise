/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.contabilidad.model.Comprobante;

/**
 *
 * @author syslife01
 */
@Stateless
public class ComprobanteFacade extends AbstractFacade<Comprobante> implements ComprobanteFacadeLocal {

    @PersistenceContext(unitName = "com.sigaenterprise_sigaenterprise_backend-contabilidad_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComprobanteFacade() {
        super(Comprobante.class);
    }
    
}
