/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.purchase.remote;

import java.util.List;
import javax.ejb.Remote;
import sigaenterprise.backend.purchase.model.Article;

/**
 *
 * @author syslife01
 */
@Remote
public interface ArticleFacadeRemote {
     public final String JNDI_REMOTE_NAME = "ejb/articleFacadeRemote";
     
     void create(Article article);

    void edit(Article article);

    void remove(Article article);

    Article find(Object id);

    List<Article> findAll();

    List<Article> findRange(int[] range);

    int count();
}
