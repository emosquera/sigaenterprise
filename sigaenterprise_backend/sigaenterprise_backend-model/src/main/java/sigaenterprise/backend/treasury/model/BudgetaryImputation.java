/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.model;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import sigaenterprise.backend.auth.model.BasicAttributes;


/**
 *
 * @author MiguelAngel
 */
@Entity
@Table(name = "budgetaryImputations")
public class BudgetaryImputation  extends BasicAttributes{
    
    private PayOrder payOrder;
    private BudgetHeading budgetHeading;
    private BigDecimal mountCau;
    private BigDecimal mountDesc;
    private BigDecimal mountRet;
    
    
    @ManyToOne
    public PayOrder getPayOrder() {
        return payOrder;
    }

    public void setPayOrder(PayOrder payOrder) {
        this.payOrder = payOrder;
    }
    
    @OneToOne(mappedBy = "budgetCode")
    public BudgetHeading getBudgetHeading() {
        return budgetHeading;
    }

    public void setImputationHeading(BudgetHeading budgetHeading) {
        this.budgetHeading = budgetHeading;
    }
    
    @Column(name = "mountCau")
    public BigDecimal getMountCau() {
        return mountCau;
    }

    public void setMountCau(BigDecimal mountCau) {
        this.mountCau = mountCau;
    }
    
    @Column(name = "mountDesc")
    public BigDecimal getMountDesc() {
        return mountDesc;
    }

    public void setMountDesc(BigDecimal mountDesc) {
        this.mountDesc = mountDesc;
    }
    
    @Column(name = "mountRet")
    public BigDecimal getMountRet() {
        return mountRet;
    }

    public void setMountRet(BigDecimal mountRet) {
        this.mountRet = mountRet;
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
