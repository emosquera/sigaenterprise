/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.budget.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import sigaenterprise.backend.auth.model.BasicAttributes;
import sigaenterprise.backend.contabilidad.model.CuentaContable;

/**
 *
 * @author syslife02
 */
@Entity
public class Title extends BasicAttributes {

    private String code;
    private String description;
    private CuentaContable accountingCode; 

    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CuentaContable getAccountingCode() {
        return accountingCode;
    }

    public void setAccountingCode(CuentaContable accountingCode) {
        this.accountingCode = accountingCode;
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
        if (!(object instanceof Title)) {
            return false;
        }
        Title other = (Title) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.budget.model.Title[ id=" + getId() + " ]";
    }
    
}
