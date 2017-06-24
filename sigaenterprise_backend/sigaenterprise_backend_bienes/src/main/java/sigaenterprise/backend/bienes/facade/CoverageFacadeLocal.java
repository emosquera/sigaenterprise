/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.bienes.model.Coverage;

/**
 *
 * @author Desiree
 */
@Local
public interface CoverageFacadeLocal {

    void create(Coverage cobertura);

    void edit(Coverage cobertura);

    void remove(Coverage cobertura);

    Coverage find(Object id);

    List<Coverage> findAll();

    List<Coverage> findRange(int[] range);

    int count();
    
}
