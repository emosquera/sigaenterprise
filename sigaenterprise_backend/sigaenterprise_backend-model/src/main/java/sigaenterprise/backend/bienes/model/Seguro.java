/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.bienes.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ogutierrez
 */
@Entity
public class Seguro implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String poliza;
    private Calendar fecini;
    private Calendar fecfin;
    private String aseguradora;
    //private 

    @OneToMany
    private List<SeguroCobertura> coberturas;

    @Column(name = "poliza")
    public String getPoliza() {
        return poliza;
    }

    public List<SeguroCobertura> getCoberturas() {
        return coberturas;
    }

    public void setCoberturas(List<SeguroCobertura> coberturas) {
        this.coberturas = coberturas;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    @Column(name = "fecini")
    @Temporal(TemporalType.DATE)
    public Calendar getFecini() {
        return fecini;
    }

    public void setFecini(Calendar fecini) {
        this.fecini = fecini;
    }

    @Column(name = "fecfin")
    @Temporal(TemporalType.DATE)
    public Calendar getFecfin() {
        return fecfin;
    }

    public void setFecfin(Calendar fecfin) {
        this.fecfin = fecfin;
    }

    @Column(name = "aseguradora")
    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
    
            
         

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
        if (!(object instanceof Seguro)) {
            return false;
        }
        Seguro other = (Seguro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sigaenterprise.backend.bienes.model.Seguro[ id=" + id + " ]";
    }
    
}
