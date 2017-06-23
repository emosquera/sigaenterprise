/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.remote;

import javax.ejb.Remote;
import sigaenterprise.backend.bienes.model.Mueble;

/**
 *
 * @author Desiree
 */
@Remote
public interface MuebleFacadeRemote {
    public final String JNDI_REMOTE_NAME="ejb/muebleFacadeRemote";
     
    /**
     *
     * @param id
     * @return
     */
    public Mueble findMueble(Long id);
    
}
