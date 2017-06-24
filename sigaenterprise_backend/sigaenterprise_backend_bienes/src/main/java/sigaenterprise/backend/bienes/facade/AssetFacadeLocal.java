/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.bienes.model.Asset;

/**
 *
 * @author ogutierrez
 */
@Local
public interface AssetFacadeLocal {
    void create(Asset activo);
    
    void edit(Asset activo);
    
    void remove(Asset activo);
    
    Asset find(Object id);
    
    List<Asset> findAll();
    
    List<Asset> findRange(int[] range);
    
    int count();
}
