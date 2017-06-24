/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.bienes.model.MovableProperty;

/**
 *
 * @author Desiree
 */
@Local
public interface MovablePropertyFacadeLocal {
    
    void create(MovableProperty mueble);

    void edit(MovableProperty mueble);

    void remove(MovableProperty mueble);

    MovableProperty find(Object id);

    List<MovableProperty> findAll();

    List<MovableProperty> findRange(int[] range);

    int count();   
}
