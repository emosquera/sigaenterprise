/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigaenterprise.backend.auth.local.exceptions;

import javax.ejb.ApplicationException;

/**
 *
 * @author syslife02
 */
@ApplicationException(rollback=true)
public class UserLocalException extends Exception {

    /**
     * Creates a new instance of <code>UserLocalException</code> without detail
     * message.
     */
    public UserLocalException() {
    }

    /**
     * Constructs an instance of <code>UserLocalException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     * @param cause
     */
    public UserLocalException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
