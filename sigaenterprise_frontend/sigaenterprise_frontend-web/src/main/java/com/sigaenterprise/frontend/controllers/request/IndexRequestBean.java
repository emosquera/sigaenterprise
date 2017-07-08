/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigaenterprise.frontend.controllers.request;

import com.sigaenterprise.frontend.controllers.view.IndexViewBean;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import sigaenterprise.backend.auth.exceptions.UserNotFoundExeption;
import sigaenterprise.backend.auth.remote.UserFacadeRemote;

/**
 *
 * @author syslife02
 */
@Named(value = "indexRequestBean")
@RequestScoped
public class IndexRequestBean {

    @Inject
    IndexViewBean indexViewBean;
    
    @EJB(lookup = UserFacadeRemote.JNDI_REMOTE_NAME)
    UserFacadeRemote userFacadeRemote;
    /**
     * Creates a new instance of IndexRequestBean
     */
    public IndexRequestBean() {
    }
    
    public void login() {
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            userFacadeRemote.login(indexViewBean.getUser().getUserName(), indexViewBean.getUser().getPassword());
        } catch (UserNotFoundExeption ex){            
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", ex.getMessage()));
            return;
        }
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito", "Usuario Encontrado"));        
    }
        
    
}
