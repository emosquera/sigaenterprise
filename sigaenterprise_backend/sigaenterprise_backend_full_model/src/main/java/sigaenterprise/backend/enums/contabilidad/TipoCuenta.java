/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.enums.contabilidad;

/**
 *
 * @author syslife01
 */
public enum TipoCuenta {
    P("Pendiente"),
    A("Aprobado"),
    N("Anulado");
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private TipoCuenta(String name) {
        this.name = name;
    }
}
