/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.budget.facade;

import java.util.List;
import javax.ejb.Local;
import sigaenterprise.backend.budget.model.Title;

/**
 *
 * @author syslife02
 */
@Local
public interface TitleFacadeLocal {

    void create(Title title);

    void edit(Title title);

    void remove(Title title);

    Title find(Object id);

    List<Title> findAll();

    List<Title> findRange(int[] range);

    int count();
    
}
