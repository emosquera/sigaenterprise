/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import sigaenterprise.backend.auth.model.BasicAttributes;
import sigaenterprise.backend.budget.model.Title;


/**
 *
 * @author MiguelAngel
 */
@Entity
@Table(name = "budgetary_imputation")
public class BudgetaryImputation  extends BasicAttributes{
    
    private PayOrder payOrder;
    private Title title;

    @ManyToOne
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
    private BigDecimal mount;
    
    
    @ManyToOne
    public PayOrder getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(PayOrder payOrder) {
        this.payOrder = payOrder;
    }
    
    
    
    @Column(name = "mountCau")
    public BigDecimal getMount() {
        return mount;
    }

    public void setMount(BigDecimal mount) {
        this.mount = mount;
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
        if (!(object instanceof BudgetaryImputation)) {
            return false;
        }
        BudgetaryImputation other = (BudgetaryImputation) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }
    
    @Override
    public String toString() {
        return "sigaenterprise.backend.treasury.model.BudgetaryImputation[ id=" + this.getId() + " ]";
    }      
}
