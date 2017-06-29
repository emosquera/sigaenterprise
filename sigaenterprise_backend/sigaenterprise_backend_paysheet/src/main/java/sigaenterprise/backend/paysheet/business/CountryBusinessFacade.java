/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.paysheet.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import sigaenterprise.backend.paysheet.facade.CountryFacadeLocal;
import sigaenterprise.backend.paysheet.model.Country;
import sigaenterprise.backend.paysheet.remote.CountryFacadeRemote;

/**
 *
 * @author cidesa
 */
@Stateless(name = "countryFacadeRemote", mappedName = CountryFacadeRemote.JDNI_REMOTE_NAME)
@Remote(CountryFacadeRemote.class)
public class CountryBusinessFacade implements CountryFacadeRemote{
    @EJB
    CountryFacadeLocal countryBusinessFacade;

    @Override
    public Country findCountry(Long id) {
        return countryBusinessFacade.find(id);
    }
    
}
