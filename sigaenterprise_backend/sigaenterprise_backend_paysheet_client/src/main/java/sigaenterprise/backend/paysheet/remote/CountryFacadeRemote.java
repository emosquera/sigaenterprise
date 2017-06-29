/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.paysheet.remote;

import javax.ejb.Remote;
import sigaenterprise.backend.paysheet.model.Country;
import sigaenterprise.backend.paysheet.model.Employee;

/**
 *
 * @author cidesa
 */
@Remote
public interface CountryFacadeRemote {
    public final String JDNI_REMOTE_NAME="ejb/countryFacadeRemote";
    
    public Country findCountry(Long id);
}
