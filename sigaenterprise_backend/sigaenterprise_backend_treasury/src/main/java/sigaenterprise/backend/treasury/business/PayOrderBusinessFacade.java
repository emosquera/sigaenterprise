/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.business;

import javax.ejb.EJB;
import sigaenterprise.backend.treasury.facade.PayOrderFacadeLocal;
import sigaenterprise.backend.treasury.model.PayOrder;

/**
 *
 * @author martinmgb
 */
public class PayOrderBusinessFacade {
    @EJB
    PayOrderFacadeLocal payOrderFacadeLocal;
    
}
