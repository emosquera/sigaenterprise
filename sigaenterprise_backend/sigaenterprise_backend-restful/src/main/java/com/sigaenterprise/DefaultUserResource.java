/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigaenterprise;

import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;
import sigaenterprise.backend.auth.remote.UserFacadeRemote;

/**
 * REST Web Service
 *
 * @author syslife02
 */
@Path("defaultuser")
@RequestScoped
public class DefaultUserResource {

    @EJB(lookup = UserFacadeRemote.JNDI_REMOTE_NAME)
    UserFacadeRemote userFacadeRemote;
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DefaultUserResource
     */
    public DefaultUserResource() {
    }

    /**
     * Retrieves representation of an instance of com.sigaenterprise.DefaultUserResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJason() {
        userFacadeRemote.createDefaultUser();
        return "Usuario admin creado satisfactoriamente";
    }

    /**
     * PUT method for updating or creating an instance of DefaultUserResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
