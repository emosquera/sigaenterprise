/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.auth.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.auth.facade.UserFacadeLocal;
import sigaenterprise.backend.auth.model.User;
import sigaenterprise.backend.auth.remote.UserFacadeRemote;

/**
 *
 * @author syslife02
 */
@Stateless(name = "userFacadeRemote", mappedName = UserFacadeRemote.JNDI_REMOTE_NAME)
@Remote(UserFacadeRemote.class)
public class UserBusinessFacade implements UserFacadeRemote{

    @EJB
    UserFacadeLocal userFacadeLocal;
    
    @Override
    public User findUser(Long id) {
        return userFacadeLocal.find(id);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
