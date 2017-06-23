/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.bienes.model.Seguro;

/**
 *
 * @author ogutierrez
 */
@Local
public interface SeguroFacadeLocal {
    void create(Seguro activo);
    
    void edit(Seguro activo);
    
    void remove(Seguro activo);
    
    Seguro find(Object id);
    
    List<Seguro> findAll();
    
    List<Seguro> findRange(int[] range);
    
    int count();    
}
