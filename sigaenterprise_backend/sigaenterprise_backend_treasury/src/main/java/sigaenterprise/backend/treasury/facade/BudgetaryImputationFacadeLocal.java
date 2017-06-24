/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.facade;

import sigaenterprise.backend.treasury.model.BudgetaryImputation;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author MiguelAngel
 */
@Local
public interface BudgetaryImputationFacadeLocal {
    
    void create(BudgetaryImputation budgetaryImputation);

    void edit(BudgetaryImputation budgetaryImputation);

    void remove(BudgetaryImputation budgetaryImputation);

    BudgetaryImputation find(Object id);

    List<BudgetaryImputation> findAll();

    List<BudgetaryImputation> findRange(int[] range);

    int count();
    
}
