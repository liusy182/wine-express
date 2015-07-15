/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.csm.appservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author liusi
 */
@WebService(serviceName = "PasswordGenerationService")
@Stateless()
public class PasswordGenerationService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "GeneratePasssord")
    public String GeneratePasssord(@WebParam(name = "email") String email) {
        if(validateEmail(email))
        {
            String newPassword = genPassword();
            return "call email service to send the new password";
        }
        else
            return "email validation failed";
    }
    
    private boolean validateEmail(String email)
    {
        //TODO: call which service ?
        String test = email;
        return true;
    }
    
    private String genPassword()
    {
        //TODO: call a public API to generate password
        return "abc";
    }
    
}
