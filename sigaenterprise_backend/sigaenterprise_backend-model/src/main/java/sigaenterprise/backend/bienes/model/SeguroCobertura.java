/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Desiree
 */
@Entity
@Table(name="seguro_cobertura")
@IdClass(SeguroCoberturaId.class)
public class SeguroCobertura implements Serializable {
    
    @Id
    private Long seguroid;
    
    @Id
    private Long coberturaid;
    
    private double monto;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="seguroid", referencedColumnName="ID")
    private Seguro seguro;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="coberturaid", referencedColumnName="ID")
    private Cobertura cobertura;

    public Long getSeguroid() {
        return seguroid;
    }

    public void setSeguroid(Long seguroid) {
        this.seguroid = seguroid;
    }

    public Long getCoberturaid() {
        return coberturaid;
    }

    public void setCoberturaid(Long coberturaid) {
        this.coberturaid = coberturaid;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public Cobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(Cobertura cobertura) {
        this.cobertura = cobertura;
    }
    
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeguroCobertura)) {
            return false;
        }
        SeguroCobertura other = (SeguroCobertura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.SeguroCobertura[ id=" + id + " ]";
    }
    
}
