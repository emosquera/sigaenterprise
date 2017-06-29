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

/**
 *
 * @author cidesa
 */
public class CountryFacade extends AbstractFacade<Country> implements CountryFacadeLocal{
    
    @PersistenceContext(unitName = "sigaenterprise_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CountryFacade() {
        super(Country.class);
    }
}
