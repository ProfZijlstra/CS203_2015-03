/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lecture;

/**
 *
 * @author mzijlstra
 */
public class SuperBadException extends Exception {

    public SuperBadException() {
    }

    public SuperBadException(String message) {
        super(message);
    }

    public SuperBadException(String message, Throwable cause) {
        super(message, cause);
    }

    public SuperBadException(Throwable cause) {
        super(cause);
    }

    public SuperBadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
