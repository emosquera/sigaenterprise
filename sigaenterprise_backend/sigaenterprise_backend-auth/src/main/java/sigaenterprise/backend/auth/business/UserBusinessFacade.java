/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.auth.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import javax.ejb.TransactionRolledbackLocalException;
import javax.persistence.NoResultException;
import sigaenterprise.backend.auth.facade.RoleFacadeLocal;
import sigaenterprise.backend.auth.facade.UserFacadeLocal;
import sigaenterprise.backend.auth.model.Role;
import sigaenterprise.backend.auth.model.User;
import sigaenterprise.backend.auth.remote.UserFacadeRemote;
import sigaenterprise.backend.enums.UserStatus;
import sigaenterprise.backend.auth.exceptions.UserNotFoundExeption;

/**
 *
 * @author syslife02
 */
@Stateless(name = "userFacadeRemote", mappedName = UserFacadeRemote.JNDI_REMOTE_NAME)
@Remote(UserFacadeRemote.class)
public class UserBusinessFacade implements UserFacadeRemote{

    @EJB
    UserFacadeLocal userFacadeLocal;
    
    @EJB
    RoleFacadeLocal roleFacadeLocal;
    
    @Override
    public User findUser(Long id) {
        return userFacadeLocal.find(id);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void createDefaultUser() {
        User defaultUser = new User();
        defaultUser.setUserName("admin");
        defaultUser.setPassword("admin");
        defaultUser.setEmail("admin@sigaenterprise.com");
        defaultUser.setStatus(UserStatus.A);
        Role defaultRole = roleFacadeLocal.findByRole("Administrador");        
        defaultUser.setUserRole(defaultRole);
        userFacadeLocal.create(defaultUser);
    }

    @Override
    public User login(String userName, String password) throws UserNotFoundExeption {
        try {
            return userFacadeLocal.findByUserNameAndPassword(userName, password);
        } catch (NoResultException e) {
            throw new UserNotFoundExeption("Usuario no Encontrado", e);       
        }
        
    }
}
