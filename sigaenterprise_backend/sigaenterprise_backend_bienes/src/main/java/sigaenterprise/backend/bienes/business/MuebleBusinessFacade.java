/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.bienes.facade.MuebleFacadeLocal;
import sigaenterprise.backend.bienes.model.Mueble;
import sigaenterprise.backend.bienes.remote.MuebleFacadeRemote;

/**
 *
 * @author Desiree
 */
@Stateless(name="muebleFacadeRemote", mappedName=MuebleFacadeRemote.JNDI_REMOTE_NAME)
@Remote(MuebleFacadeRemote.class)
public class MuebleBusinessFacade implements MuebleFacadeRemote{
    
    @EJB
    MuebleFacadeLocal muebleFacadeLocal;
    
    @Override
    public Mueble findMueble(Long id){
     return muebleFacadeLocal.find(id);
    }
    

}
