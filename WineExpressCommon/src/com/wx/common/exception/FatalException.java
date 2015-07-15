/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.common.exception;

/**
 *
 * @author Hao
 */
public class FatalException extends Exception {

    private static final long serialVersionUID = -4866713241611539674L;

    public FatalException(Exception e) {
        super(e);
    }

    public String getErrorMessage() {
        return getMessage();
    }

    @Override
    public void printStackTrace() {
        printStackTrace();
    }
}
