/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Desiree
 */
@Entity
public class SeguroCoberturaId implements Serializable {
    
    private Long seguroid;
    private Long coberturaid;

    public Long getSeguroid() {
        return seguroid;
    }

    public void setSeguroid(Long seguroid) {
        this.seguroid = seguroid;
    }

    public Long getCoberturaid() {
        return coberturaid;
    }

    public void setCoberturaid(Long coberturaid) {
        this.coberturaid = coberturaid;
    }
    
    

    @Override
    public int hashCode() {
       return (int)(seguroid + coberturaid);
    }

    @Override
    public boolean equals(Object object) {
         if (object instanceof SeguroCoberturaId) {
            SeguroCoberturaId otherId = (SeguroCoberturaId) object;
            return (otherId.seguroid == this.seguroid) && (otherId.coberturaid == this.coberturaid);
          }
          return false;
    }
    
}
