/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.business;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import sigaenterprise.backend.contabilidad.facade.AsientoFacadeLocal;
import sigaenterprise.backend.contabilidad.model.Asiento;
import sigaenterprise.backend.contabilidad.remote.AsientoFacadeRemote;

/**
 *
 * @author syslife01
 */
@Stateless(name = "asientoFacadeRemote", mappedName = AsientoFacadeRemote.JNDI_REMOTE_NAME)
@Remote(AsientoFacadeRemote.class)
public class AsientoBusinessFacade implements AsientoFacadeRemote {
    
    @EJB
    AsientoFacadeLocal asientoFacadeLocal;
    
    @Override
    public void create(Asiento asiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Asiento asiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Asiento asiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Asiento find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asiento> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Asiento> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
