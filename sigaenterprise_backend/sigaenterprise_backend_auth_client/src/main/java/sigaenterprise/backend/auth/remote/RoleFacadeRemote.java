/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.auth.remote;

import javax.ejb.Remote;

/**
 *
 * @author syslife02
 */
@Remote
public interface RoleFacadeRemote {
    public final String JNDI_REMOTE_NAME = "ejb/roleFacadeRemote";
    
    public void createAdminRole();
}
