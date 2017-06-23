/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.business;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.contabilidad.facade.ComprobanteFacadeLocal;
import sigaenterprise.backend.contabilidad.model.Comprobante;
import sigaenterprise.backend.contabilidad.remote.ComprobanteFacadeRemote;

/**
 *
 * @author syslife01
 */
@Stateless(name = "comprobanteFacadeRemote", mappedName = ComprobanteFacadeRemote.JNDI_REMOTE_NAME)
@Remote(ComprobanteFacadeRemote.class)
public class ComprobanteBusinessFacade implements ComprobanteFacadeRemote {
    
    @EJB
    ComprobanteFacadeLocal comprobanteFacadeLocal;
    
    @Override
    public void create(Comprobante comprobante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(Comprobante comprobante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Comprobante comprobante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comprobante find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Comprobante> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Comprobante> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
