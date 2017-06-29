/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.paysheet.facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.auth.facade.AbstractFacade;
import sigaenterprise.backend.paysheet.model.Country;
import sigaenterprise.backend.paysheet.model.RoleEmployee;

/**
 *
 * @author cidesa
 */
public class RoleEmployeeFacade extends AbstractFacade<RoleEmployee> implements RoleEmployeeFacadeLocal{
    
     @PersistenceContext(unitName = "sigaenterprise_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RoleEmployeeFacade() {
        super(RoleEmployee.class);
    }
    
}
