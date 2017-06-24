/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.treasury.model.BudgetaryImputation;

/**
 *
 * @author Herbalife
 */

@Remote
public interface BudgetaryImputationFacadeRemote {
    public final String JNDI_REMOTE_NAME = "ejb/budgetaryImputationFacadeRemote";
    
    void create(BudgetaryImputation asiento);

    void edit(BudgetaryImputation asiento);

    void remove(BudgetaryImputation asiento);

    BudgetaryImputation find(Object id);

    List<BudgetaryImputation> findAll();

    List<BudgetaryImputation> findRange(int[] range);

    int count();
    
}
