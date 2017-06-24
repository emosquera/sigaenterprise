/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.budget.business;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.budget.client.remote.TitleFacadeRemote;
import sigaenterprise.backend.budget.model.Title;

/**
 *
 * @author syslife02
 */
@Stateless(name = "userFacadeRemote", mappedName = TitleFacadeRemote.JNDI_REMOTE_NAME)
@Remote(TitleFacadeRemote.class)
public class TitleBusinessFacade implements TitleFacadeRemote {

    @Override
    public Title getTitle(Long Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Title> getTitles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
