/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.purchase.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.purchase.model.Provider;

/**
 *
 * @author syslife01
 */
@Remote
public interface ProviderFacadeRemote {
    
     public final String JNDI_REMOTE_NAME = "ejb/providerFacadeRemote";
     
     void create(Provider provider);

    void edit(Provider provider);

    void remove(Provider provider);

    Provider find(Object id);

    List<Provider> findAll();

    List<Provider> findRange(int[] range);

    int count();
    
}
