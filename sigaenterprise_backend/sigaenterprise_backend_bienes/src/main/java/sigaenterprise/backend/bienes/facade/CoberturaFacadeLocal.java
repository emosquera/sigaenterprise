/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.bienes.model.Cobertura;

/**
 *
 * @author Desiree
 */
@Local
public interface CoberturaFacadeLocal {

    void create(Cobertura cobertura);

    void edit(Cobertura cobertura);

    void remove(Cobertura cobertura);

    Cobertura find(Object id);

    List<Cobertura> findAll();

    List<Cobertura> findRange(int[] range);

    int count();
    
}
