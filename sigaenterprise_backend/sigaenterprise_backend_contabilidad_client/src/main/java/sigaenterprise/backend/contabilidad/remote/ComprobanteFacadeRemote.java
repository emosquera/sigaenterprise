/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.contabilidad.model.Comprobante;

/**
 *
 * @author syslife01
 */
@Remote
public interface ComprobanteFacadeRemote {
    
    public final String JNDI_REMOTE_NAME = "ejb/comprobanteFacadeRemote";
    
    void create(Comprobante comprobante);

    void edit(Comprobante comprobante);

    void remove(Comprobante comprobante);

    Comprobante find(Object id);

    List<Comprobante> findAll();

    List<Comprobante> findRange(int[] range);

    int count();
}
