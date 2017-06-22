/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import javax.persistence.Column;
import sigaenterprise.backend.auth.model.BasicAttributes;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Desiree
 */
@Entity
@Table(name="coberturas")
public class Cobertura extends BasicAttributes {
    
    private String codigo;
    private String descripcion;
    
    @Column(name="codcob")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Column(name="descob")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cobertura)) {
            return false;
        }
        Cobertura other = (Cobertura) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.Cobertura[ id=" + getId() + " ]";
    }
    
}
