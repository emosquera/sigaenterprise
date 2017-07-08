/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.auth.exceptions;

import javax.ejb.ApplicationException;

/**
 *
 * @author syslife02
 */
@ApplicationException(rollback=true)
public class UserNotFoundExeption extends Exception {

    /**
     * Creates a new instance of <code>UserNotFoundExeption</code> without
     * detail message.
     */
    public UserNotFoundExeption() {
    }

    /**
     * Constructs an instance of <code>UserNotFoundExeption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     * @param cause
     */
    public UserNotFoundExeption(String msg, Throwable cause) {
        super(msg, cause);
    }
}
