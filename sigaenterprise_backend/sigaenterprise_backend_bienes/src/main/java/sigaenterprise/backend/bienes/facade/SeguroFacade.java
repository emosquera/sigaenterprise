/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.bienes.model.Activo;
import sigaenterprise.backend.bienes.model.Seguro;

/**
 *
 * @author ogutierrez
 */
@Stateless
public class SeguroFacade extends AbstractFacade<Seguro> implements SeguroFacadeLocal {

    @PersistenceContext(unitName = "sigaenterprise_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public SeguroFacade(){
       super(Seguro.class);
    }
    
}
