/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.paysheet.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import sigaenterprise.backend.paysheet.facade.EmployeeFacadeLocal;
import sigaenterprise.backend.paysheet.model.Employee;
import sigaenterprise.backend.paysheet.remote.EmployeeFacadeRemote;

/**
 *
 * @author cidesa
 */

@Stateless(name = "employeeFacadeRemote", mappedName = EmployeeFacadeRemote.JDNI_REMOTE_NAME)
@Remote(EmployeeFacadeRemote.class)
public class EmployeeBusinessFacade implements EmployeeFacadeRemote{
    
    @EJB
    EmployeeFacadeLocal employeeBusinessFacade;
    
    @Override
    public Employee findEmployee(Long id) {
        return employeeBusinessFacade.find(id);
    }
}
