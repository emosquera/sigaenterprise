/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.purchase.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.purchase.model.Provider;

/**
 *
 * @author syslife01
 */
@Local
public interface ProviderFacadeLocal {

    void create(Provider provider);

    void edit(Provider provider);

    void remove(Provider provider);

    Provider find(Object id);

    List<Provider> findAll();

    List<Provider> findRange(int[] range);

    int count();
    
}
