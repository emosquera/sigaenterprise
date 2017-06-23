/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.treasury.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import sigaenterprise.backend.auth.model.BasicAttributes;
import sigaenterprise.backend.enums.PayOrderStatus;

/**
 *
 * @author martinmgb
 */
@Entity
@Table(name = "payOrders")
public class PayOrder extends BasicAttributes{
    private String numberOrder;
    private Beneficiary beneficiary;
    private BigDecimal amount;
    private String description;
    private PayOrderStatus status;

    @Column(name = "numberOrder")
    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
    }

    @ManyToOne
    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    @Column(name = "amount")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    public PayOrderStatus getStatus() {
        return status;
    }

    public void setStatus(PayOrderStatus status) {
        this.status = status;
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
        if (!(object instanceof PayOrder)) {
            return false;
        }
        PayOrder other = (PayOrder) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.treasury.model.PayOrder[ id=" + this.getId() + " ]";
    }
    
    
}