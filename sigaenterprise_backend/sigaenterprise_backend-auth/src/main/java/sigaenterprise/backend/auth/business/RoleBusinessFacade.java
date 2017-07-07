/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.auth.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import sigaenterprise.backend.auth.facade.RoleFacadeLocal;
import sigaenterprise.backend.auth.model.Role;
import sigaenterprise.backend.auth.remote.RoleFacadeRemote;

/**
 *
 * @author syslife02
 */
@Stateless(name = "roleFacadeRemote", mappedName = RoleFacadeRemote.JNDI_REMOTE_NAME)
@Remote(RoleFacadeRemote.class)
public class RoleBusinessFacade implements RoleFacadeRemote{

    @EJB
    RoleFacadeLocal roleFacadeLocal;
    
    @Override
    public void createAdminRole() {
        Role defaultRole = new Role();
        defaultRole.setRole("Administrador");
        roleFacadeLocal.create(defaultRole);
    }
    
}
