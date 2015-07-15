/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.common.exception;

/**
 * This exception is thrown by validator only. 
 * Validator will throw this exception for any validation failure in the process of validation.
 * any application services methods must handle the exception
 * @author Hao
 */
public class ValidationFailedException extends Exception{
    private static final long serialVersionUID = -2549433453268440715L;
    private String errorCode;
    private String errorMassag1e;

    public ValidationFailedException(String errorCode, String errorMassag1e) {
        this.errorCode = errorCode;
        this.errorMassag1e = errorMassag1e;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMassag1e() {
        return errorMassag1e;
    }

    public void setErrorMassag1e(String errorMassag1e) {
        this.errorMassag1e = errorMassag1e;
    }
}
