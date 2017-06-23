/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.remote;

import javax.ejb.Remote;
import sigaenterprise.backend.bienes.model.Seguro;

/**
 *
 * @author ogutierrez
 */
@Remote
public interface SeguroFacadeRemote {
    public final String JDNI_REMOTE_NAME="ejb/seguroFacadeRemote";
    
    public Seguro findSeguro(Long id);    
}
