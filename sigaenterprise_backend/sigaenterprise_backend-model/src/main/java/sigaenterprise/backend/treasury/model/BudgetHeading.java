/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import sigaenterprise.backend.auth.model.BasicAttributes;


/**
 *
 * @author MiguelAngel
 */
@Entity
@Table(name = "budgetheadings")
public class BudgetHeading  extends BasicAttributes {
    
    private String budgetCode;
    private String budgetName;
    
    
    @Column(name = "budgetCode")
    public String getBudgetCode() {
        return budgetCode;
    }

    public void setBudgetCode(String budgetCode) {
        this.budgetCode = budgetCode;
    }
    
    @Column(name = "budgetName")
    public String getBudgetName() {
        return budgetCode;
    }

    public void setBudgetName(String budgetName) {
        this.budgetName = budgetName;
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
        if (!(object instanceof BudgetHeading)) {
            return false;
        }
        BudgetHeading other = (BudgetHeading) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }
    

    @Override
    public String toString() {
        return "sigaenterprise.backend.treasury.model.BudgetHeading[ id=" + this.getId() + " ]";
    }
    
}
