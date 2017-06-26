/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.contabilidad.model;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import sigaenterprise.backend.auth.model.BasicAttributes;
import sigaenterprise.backend.budget.model.Title;
import sigaenterprise.backend.enums.contabilidad.TipoCuenta;

/**
 *
 * @author syslife01
 */
@Entity
@Table(name = "cuentaContables")
public class CuentaContable extends BasicAttributes{

    private List<Title> titles;

    private String codigoContable;
    private String descripcion;
    private TipoCuenta tipoAsiento;
    private Boolean ultimoNivel;
   
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentaContable)) {
            return false;
        }
        CuentaContable other = (CuentaContable) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.contabilidad.model.Asiento[ id=" + getId() + " ]";
    }

    @OneToMany(mappedBy = "accountingCode")
    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }
    
}
