/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.auth.facade;

import sigaenterprise.backend.auth.model.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.auth.local.exceptions.UserLocalException;

/**
 *
 * @author syslife02
 */
@Stateless
public class UserFacade extends AbstractFacade<User> implements UserFacadeLocal {
    
    @PersistenceContext(unitName = "sigaenterprise_backend_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }

    @Override
    public User findByUserNameAndPassword(String userName, String password) throws UserLocalException {
        try {
            return (User) em.createNamedQuery("findByUserNameAndPassword").setParameter("username", userName).setParameter("password", password).getSingleResult();     
        } catch (NoResultException e) {
            throw new UserLocalException("Query no obtuvo resultados", e);
        }        
    }
    
}
