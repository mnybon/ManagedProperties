/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.netdesign.common.osgi.config.exception;

/**
 *
 * @author mnn
 */
public class InvocationException extends ManagedPropertiesException {

    public InvocationException(String message) {
	super(message);
    }

    public InvocationException(String message, Throwable cause) {
	super(message, cause);
    }

    public InvocationException(Throwable cause) {
	super(cause);
    }

    public InvocationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }

}
