/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.business;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import sigaenterprise.backend.treasury.model.BudgetaryImputation;
import sigaenterprise.backend.treasury.remote.BudgetaryImputationFacadeRemote;
import sigaenterprise.backend.treasury.facade.BudgetaryImputationFacadeLocal;


/**
 *
 * @author Herbalife
 */
@Stateless(name = "budgetaryImputationFacadeRemote", mappedName = BudgetaryImputationFacadeRemote.JNDI_REMOTE_NAME)
@Remote(BudgetaryImputationFacadeRemote.class)
public class BudgetaryImputationBussinessFacade implements BudgetaryImputationFacadeRemote {
    
    @EJB
    BudgetaryImputationFacadeLocal budgetaryImputationFacadeLocal;

    @Override
    public void create(BudgetaryImputation budgetaryImputationFacadeLocal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void edit(BudgetaryImputation budgetaryImputationFacadeLocal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(BudgetaryImputation budgetaryImputationFacadeLocal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BudgetaryImputation find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BudgetaryImputation> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BudgetaryImputation> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}
