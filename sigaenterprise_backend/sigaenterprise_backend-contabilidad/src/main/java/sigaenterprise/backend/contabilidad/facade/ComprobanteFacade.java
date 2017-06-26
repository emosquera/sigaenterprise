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

    @PersistenceContext(unitName = "sigaenterprise_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComprobanteFacade() {
        super(Comprobante.class);
    }
    
}
