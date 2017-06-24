/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.model;

import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import sigaenterprise.backend.auth.model.BasicAttributes;
import sigaenterprise.backend.enums.EstatusComprobante;

/**
 *
 * @author syslife01
 */
@Entity
@Table(name = "comprobantes")
public class Comprobante extends BasicAttributes {
    
    private Integer numero;
    private Calendar fecha;
    private String descripcion;
    private EstatusComprobante estatus;
    List<Asiento> asientos;
    
    @Column(name = "numero")
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    @Column(name = "fecha")
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name = "estatus")
    @Enumerated(EnumType.STRING)
    public EstatusComprobante getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusComprobante estatus) {
        this.estatus = estatus;
    }
    
    @OneToMany(mappedBy = "asientoComprobante")
    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
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
        if (!(object instanceof Comprobante)) {
            return false;
        }
        Comprobante other = (Comprobante) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.contabilidad.model.Comprobante[ id=" + getId() + " ]";
    }
    
}
