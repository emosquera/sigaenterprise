/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import sigaenterprise.backend.bienes.facade.SeguroFacadeLocal;
import sigaenterprise.backend.bienes.model.Seguro;
import sigaenterprise.backend.bienes.remote.SeguroFacadeRemote;

/**
 *
 * @author ogutierrez
 */
@Stateless(name="seguroFacadeRemote", mappedName=SeguroFacadeRemote.JDNI_REMOTE_NAME)
@Remote(SeguroFacadeRemote.class)
public class SeguroBusinessFacade implements SeguroFacadeRemote {

    @EJB
    SeguroFacadeLocal seguroFacadeLocal;
    @Override
    public Seguro findSeguro(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
