/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.bienes.model.Insurance;

/**
 *
 * @author ogutierrez
 */
@Local
public interface InsuranceFacadeLocal {
    void create(Insurance activo);
    
    void edit(Insurance activo);
    
    void remove(Insurance activo);
    
    Insurance find(Object id);
    
    List<Insurance> findAll();
    
    List<Insurance> findRange(int[] range);
    
    int count();    
}
