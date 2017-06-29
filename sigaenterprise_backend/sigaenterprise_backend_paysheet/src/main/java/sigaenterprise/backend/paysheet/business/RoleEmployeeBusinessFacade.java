/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.paysheet.business;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import sigaenterprise.backend.paysheet.facade.RoleEmployeeFacadeLocal;
import sigaenterprise.backend.paysheet.model.RoleEmployee;
import sigaenterprise.backend.paysheet.remote.RoleEmployeeFacadeRemote;



/**
 *
 * @author cidesa
 */

@Stateless(name = "roleEmployeeRemote", mappedName = RoleEmployeeFacadeRemote.JDNI_REMOTE_NAME)
@Remote(RoleEmployeeFacadeRemote.class)
public class RoleEmployeeBusinessFacade implements RoleEmployeeFacadeRemote{
    
    @EJB
    RoleEmployeeFacadeLocal roleEmployeeBusinessFacade;

    @Override
    public RoleEmployee findRoleEmployee(Long id) {
        return roleEmployeeBusinessFacade.find(id);
    }
    
    
    
}
