/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.auth.remote;

import javax.ejb.Remote;
import sigaenterprise.backend.auth.model.User;


/**
 *
 * @author syslife02
 */
@Remote
public interface UserFacadeRemote {
    public final String JNDI_REMOTE_NAME = "ejb/userFacadeRemote";
    
    /**
     *
     * @param id
     * @return
     */
    public User findUser(Long id);
    
    public void createDefaultUser();
    
    public User login(String userName, String password);
}
