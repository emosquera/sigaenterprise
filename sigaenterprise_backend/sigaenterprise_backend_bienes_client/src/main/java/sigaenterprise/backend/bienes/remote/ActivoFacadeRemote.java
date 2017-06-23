/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.remote;

import javax.ejb.Remote;
import sigaenterprise.backend.bienes.model.Activo;

/**
 *
 * @author ogutierrez
 */
@Remote
public interface ActivoFacadeRemote {
    public final String JDNI_REMOTE_NAME="ejb/activoFacadeRemote";
    
    public Activo findActivo(Long id);
}
