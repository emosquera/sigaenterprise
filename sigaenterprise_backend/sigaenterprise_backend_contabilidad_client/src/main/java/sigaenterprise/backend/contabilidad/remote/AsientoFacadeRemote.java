/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.contabilidad.model.Asiento;

/**
 *
 * @author syslife01
 */
@Remote
public interface AsientoFacadeRemote {
    public final String JNDI_REMOTE_NAME = "ejb/asientoFacadeRemote";
    
    void create(Asiento asiento);

    void edit(Asiento asiento);

    void remove(Asiento asiento);

    Asiento find(Object id);

    List<Asiento> findAll();

    List<Asiento> findRange(int[] range);

    int count();
}
