/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.contabilidad.model.Comprobante;

/**
 *
 * @author syslife01
 */
@Local
public interface ComprobanteFacadeLocal {

    void create(Comprobante comprobante);

    void edit(Comprobante comprobante);

    void remove(Comprobante comprobante);

    Comprobante find(Object id);

    List<Comprobante> findAll();

    List<Comprobante> findRange(int[] range);

    int count();
    
}
