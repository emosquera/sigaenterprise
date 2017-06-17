/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth_enums;

/**
 *
 * @author syslife02
 */
public enum UserStatus {
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

    private UserStatus(String name) {
        this.name = name;
    }
    
    
}
