/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.bienes.model.Mueble;

/**
 *
 * @author Desiree
 */
@Local
public interface MuebleFacadeLocal {
    
    void create(Mueble mueble);

    void edit(Mueble mueble);

    void remove(Mueble mueble);

    Mueble find(Object id);

    List<Mueble> findAll();

    List<Mueble> findRange(int[] range);

    int count();   
}
