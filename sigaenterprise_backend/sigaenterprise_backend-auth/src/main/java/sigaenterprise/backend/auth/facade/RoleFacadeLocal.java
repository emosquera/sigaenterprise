/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.auth.facade;

import sigaenterprise.backend.auth.model.Role;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author syslife02
 */
@Local
public interface RoleFacadeLocal {

    void create(Role role);

    void edit(Role role);

    void remove(Role role);

    Role find(Object id);
    
    Role findByRole(String role);

    List<Role> findAll();

    List<Role> findRange(int[] range);

    int count();
    
}
