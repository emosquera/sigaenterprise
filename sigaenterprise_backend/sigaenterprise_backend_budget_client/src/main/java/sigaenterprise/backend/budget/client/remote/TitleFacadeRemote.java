/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.budget.client.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.budget.model.Title;

/**
 *
 * @author syslife02
 */
@Remote
public interface TitleFacadeRemote {
    public final String JNDI_REMOTE_NAME = "ejb/titleFacadeRemote";
    
    public Title getTitle(Long Id);
    public List<Title> getTitles();
}
