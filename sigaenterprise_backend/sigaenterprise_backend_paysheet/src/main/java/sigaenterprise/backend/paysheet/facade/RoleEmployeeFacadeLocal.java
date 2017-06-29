/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.paysheet.facade;

import java.util.List;
import sigaenterprise.backend.paysheet.model.RoleEmployee;

/**
 *
 * @author cidesa
 */
public interface RoleEmployeeFacadeLocal {
    
    void create(RoleEmployee roleEmployee);

    void edit(RoleEmployee roleEmployee);

    void remove(RoleEmployee roleEmployee);

    RoleEmployee find(Object id);

    List<RoleEmployee> findAll();

    List<RoleEmployee> findRange(int[] range);

    int count();
    
}
