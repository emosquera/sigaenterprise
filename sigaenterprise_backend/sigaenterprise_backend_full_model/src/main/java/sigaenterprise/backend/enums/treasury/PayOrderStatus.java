/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.enums.treasury;

/**
 *
 * @author martinmgb
 */
public enum PayOrderStatus {
    P("Pendiente"),
    C("Cancelada"),
    E("Efectiva");
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private PayOrderStatus(String name) {
        this.name = name;
    }
    
}
