/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.bienes.facade.CoberturaFacadeLocal;
import sigaenterprise.backend.bienes.model.Cobertura;
import sigaenterprise.backend.bienes.remote.CoberturaFacadeRemote;

/**
 *
 * @author martin
 */
@Stateless(name="coberturaFacadeRemote", mappedName=CoberturaFacadeRemote.JDNI_REMOTE_NAME)
@Remote(CoberturaFacadeRemote.class)
public class CoberturaBusinessFacade implements CoberturaFacadeRemote{

    @EJB
    CoberturaFacadeLocal coberturaFacadeLocal;
    
    @Override
    public Cobertura findCobertura(Long id){
    return coberturaFacadeLocal.find(id);
    }
    

}
