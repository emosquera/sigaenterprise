/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.bienes.model.InsuranceCoverage;

/**
 *
 * @author Desiree
 */
@Local
public interface InsuranceCoverageFacadeLocal {
    void create(InsuranceCoverage insurancecoverage);

    void edit(InsuranceCoverage insurancecoverage);

    void remove(InsuranceCoverage insurancecoverage);

    InsuranceCoverage find(Object id);

    List<InsuranceCoverage> findAll();

    List<InsuranceCoverage> findRange(int[] range);

    int count();   
}
