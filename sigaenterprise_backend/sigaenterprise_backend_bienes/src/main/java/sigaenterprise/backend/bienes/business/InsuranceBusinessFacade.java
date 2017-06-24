/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.bienes.facade.InsuranceFacadeLocal;
import sigaenterprise.backend.bienes.model.Insurance;
import sigaenterprise.backend.bienes.remote.InsuranceFacadeRemote;

/**
 *
 * @author ogutierrez
 */
@Stateless(name="insuranceFacadeRemote", mappedName=InsuranceFacadeRemote.JDNI_REMOTE_NAME)
@Remote(InsuranceFacadeRemote.class)
public class InsuranceBusinessFacade implements InsuranceFacadeRemote {

    @EJB
    InsuranceFacadeLocal insuranceFacadeLocal;
    @Override
    public Insurance findInsurance(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
