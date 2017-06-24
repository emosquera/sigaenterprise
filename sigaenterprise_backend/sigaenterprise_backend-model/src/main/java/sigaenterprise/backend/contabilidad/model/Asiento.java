/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import sigaenterprise.backend.auth.model.BasicAttributes;
import sigaenterprise.backend.enums.TipoCuenta;

/**
 *
 * @author syslife01
 */
@Entity
@Table(name = "asientos")
public class Asiento extends BasicAttributes{

    private String codigoContable;
    private String descripcion;
    private TipoCuenta tipoAsiento;
    private Boolean ultimoNivel;
    private Comprobante asientoComprobante;
    private CuentaContable cuentaContable;
    
    @Column(name = "codigoContable")
    public String getCodigoContable() {
        return codigoContable;
    }

    public void setCodigoContable(String codigoContable) {
        this.codigoContable = codigoContable;
    }
    
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name = "tipoAsiento")
    @Enumerated(EnumType.STRING)
    public TipoCuenta getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(TipoCuenta tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }
    
    @Column(name = "ultimoNivel")
    public Boolean getUltimoNivel() {
        return ultimoNivel;
    }

    public void setUltimoNivel(Boolean ultimoNivel) {
        this.ultimoNivel = ultimoNivel;
    }
    
    @ManyToOne
    public Comprobante getAsientoComprobante() {
        return asientoComprobante;
    }
    
    public void setAsientoComprobante(Comprobante comprobante) {
        this.asientoComprobante = comprobante;
    }
    
    @OneToOne
    public CuentaContable getCuentaContable() {
        return cuentaContable;
    }

    public void setCuentaContable(CuentaContable cuentaContable) {
        this.cuentaContable = cuentaContable;
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
        if (!(object instanceof Asiento)) {
            return false;
        }
        Asiento other = (Asiento) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.contabilidad.model.Asiento[ id=" + getId() + " ]";
    }
    
}
