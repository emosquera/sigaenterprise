/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.business;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;
import sigaenterprise.backend.bienes.model.Asset;
import sigaenterprise.backend.bienes.remote.AssetFacadeRemote;
import sigaenterprise.backend.bienes.facade.AssetFacadeLocal;



/**
 *
 * @author ogutierrez
 */
@Stateless(name="assetFacadeRemote", mappedName=AssetFacadeRemote.JDNI_REMOTE_NAME)
@Remote(AssetFacadeRemote.class)
public class AssetBusinessFacade implements AssetFacadeRemote{
    @EJB
    AssetFacadeLocal assetFacadeLocal;
    
    @Override
    public Asset findAsset(Long id) {
        return assetFacadeLocal.find(id);
    }


    
    
}
