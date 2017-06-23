/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import sigaenterprise.backend.auth.model.BasicAttributes;

/**
 *
 * @author desarrollo01
 */
@Entity
@Table(name="activos")
public class Activo extends BasicAttributes {
    private String codigo;
    private String descripcion;
    
    private List<Mueble> mueble;

    @OneToMany
    public List<Mueble> getMueble() {
        return mueble;
    }

    public void setMueble(List<Mueble> mueble) {
        this.mueble = mueble;
    }
    
    @Column(name = "codact")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Column(name = "desact")
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
        if (!(object instanceof  Activo)) {
            return false;
        }
        Activo other = (Activo) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.Activo[ id=" + getId() + " ]";
    }
    
}
