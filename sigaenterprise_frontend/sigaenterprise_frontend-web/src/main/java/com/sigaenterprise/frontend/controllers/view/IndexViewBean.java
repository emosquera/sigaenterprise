/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigaenterprise.frontend.controllers.view;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sigaenterprise.backend.auth.model.User;

/**
 *
 * @author syslife02
 */
@Named(value = "indexViewBean")
@ViewScoped
public class IndexViewBean implements Serializable {

    User user;

    public User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
        
    
    /**
     * Creates a new instance of IndexViewBean
     */
    public IndexViewBean() {
    }
    
    
    
}
