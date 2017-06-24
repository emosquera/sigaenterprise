/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.bienes.model.MovableProperty;
import sigaenterprise.backend.bienes.remote.MovablePropertyFacadeRemote;
import sigaenterprise.backend.bienes.facade.MovablePropertyFacadeLocal;

/**
 *
 * @author Desiree
 */
@Stateless(name="movablepropertyFacadeRemote", mappedName=MovablePropertyFacadeRemote.JNDI_REMOTE_NAME)
@Remote(MovablePropertyFacadeRemote.class)
public class MovablePropertyBusinessFacade implements MovablePropertyFacadeRemote{
    
    @EJB
    MovablePropertyFacadeLocal movablepropertyFacadeLocal;
    
    @Override
    public MovableProperty findMovableProperty(Long id){
     return movablepropertyFacadeLocal.find(id);
    }
    

}
