/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.paysheet.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import sigaenterprise.backend.auth.model.BasicAttributes;
import sigaenterprise.backend.enums.paysheet.EmployeeEstatus;

/**
 *
 * @author cidesa
 */
@Entity
@Table(name = "employee")
public class Employee extends BasicAttributes{
    private String firstName;
    private String lastName;
    private Calendar incorporation;
    private String identification;    
    private Country country;
    private EmployeeEstatus estatus;
    private RoleEmployee rol;

    @Column(name = "firstname")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Column(name = "incorporation")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getIncorporation() {
        return incorporation;
    }

    public void setIncorporation(Calendar incorporation) {
        this.incorporation = incorporation;
    }
    
    @Column(name = "identification")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    
    @ManyToOne
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    public EmployeeEstatus getEstatus() {
        return estatus;
    }

    public void setEstatus(EmployeeEstatus estatus) {
        this.estatus = estatus;
    }

    @ManyToOne
    public RoleEmployee getRol() {
        return rol;
    }

    public void setRol(RoleEmployee rol) {
        this.rol = rol;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        return !((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())));
    }

    @Override
    public String toString() {
        return "employee_model.Employee[ id=" + this.getId() + " ]";
    }
    
}
