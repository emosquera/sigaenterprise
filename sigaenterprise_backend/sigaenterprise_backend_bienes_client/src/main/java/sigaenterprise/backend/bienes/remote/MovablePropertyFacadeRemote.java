/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.remote;

import javax.ejb.Remote;
import sigaenterprise.backend.bienes.model.MovableProperty;

/**
 *
 * @author Desiree
 */
@Remote
public interface MovablePropertyFacadeRemote {
    public final String JNDI_REMOTE_NAME="ejb/movablepropertyFacadeRemote";
     
    /**
     *
     * @param id
     * @return
     */
    public MovableProperty findMovableProperty(Long id);
    
}
