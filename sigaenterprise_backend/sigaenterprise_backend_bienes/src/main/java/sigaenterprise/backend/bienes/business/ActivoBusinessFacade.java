/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.bienes.facade.ActivoFacadeLocal;
import sigaenterprise.backend.bienes.model.Activo;
import sigaenterprise.backend.bienes.remote.ActivoFacadeRemote;



/**
 *
 * @author ogutierrez
 */
@Stateless(name="activoFacadeRemote", mappedName=ActivoFacadeRemote.JDNI_REMOTE_NAME)
@Remote(ActivoFacadeRemote.class)
public class ActivoBusinessFacade implements ActivoFacadeRemote{
    @EJB
    ActivoFacadeLocal activoFacadeLocal;
    
    @Override
    public Activo findActivo(Long id) {
        return activoFacadeLocal.find(id);
    }


    
    
}
