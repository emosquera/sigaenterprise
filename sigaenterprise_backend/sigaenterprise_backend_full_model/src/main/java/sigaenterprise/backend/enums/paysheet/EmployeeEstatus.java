/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.enums.paysheet;

/**
 *
 * @author cidesa
 */
public enum EmployeeEstatus {
    A("Activo"),
    E("Eliminado"),
    P("Pendiente"),
    S("Suspendido");
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private EmployeeEstatus(String name) {
        this.name = name;
    }
}
