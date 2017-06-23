/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.contabilidad.model.Asiento;

/**
 *
 * @author syslife01
 */
@Local
public interface AsientoFacadeLocal {

    void create(Asiento asiento);

    void edit(Asiento asiento);

    void remove(Asiento asiento);

    Asiento find(Object id);

    List<Asiento> findAll();

    List<Asiento> findRange(int[] range);

    int count();
    
}
