/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;


import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import sigaenterprise.backend.auth.model.BasicAttributes;

/**
 *
 * @author Desiree
 */
@Entity
@Table(name="muebles")
public class Mueble extends BasicAttributes {
    
    String codigo;
    String descripcion;
    Calendar fecha_compra;
    double valor_inicial;    
    Activo activo;
    
    @Column(name="codmue")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Column(name="desmue")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="feccom")
    @Temporal(TemporalType.DATE)
    public Calendar getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Calendar fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
    @Column(name="valini")
    public double getValor_inicial() {
        return valor_inicial;
    }

    public void setValor_inicial(double valor_inicial) {
        this.valor_inicial = valor_inicial;
    }
    
    @ManyToOne
    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
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
        if (!(object instanceof Mueble)) {
            return false;
        }
        Mueble other = (Mueble) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.Mueble[ id=" + getId() + " ]";
    }
    
}
