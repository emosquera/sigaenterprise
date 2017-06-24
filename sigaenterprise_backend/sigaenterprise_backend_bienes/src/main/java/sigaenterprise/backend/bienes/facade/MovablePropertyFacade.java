/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sigaenterprise.backend.bienes.model.MovableProperty;

/**
 *
 * @author Desiree
 */
@Stateless
public class MovablePropertyFacade extends AbstractFacade<MovableProperty> implements MovablePropertyFacadeLocal {

    @PersistenceContext(unitName = "com.sigaenterprise_sigaenterprise_backend_bienes_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MovablePropertyFacade() {
        super(MovableProperty.class);
    }
}
