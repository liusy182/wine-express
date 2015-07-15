/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.common.singleton;

import com.wx.common.constant.ErrorMassageCode;
import java.util.HashMap;

/**
 *
 * @author Hao
 */
public class ValidationErrorMsg implements ErrorMassageCode{
    private HashMap<String, String> validationErrorMsgMap = new HashMap<String, String>();
    private ValidationErrorMsg() {
        validationErrorMsgMap.put(INVALID_INPUT, "Invalid input information");
        validationErrorMsgMap.put(ACC_WRONG_USR_OR_PWD, "Input username or password is not correct");
        validationErrorMsgMap.put(ACC_NOT_ACTIVED, "Your Account is not Activated yet. please Activate your account first");
        validationErrorMsgMap.put(ACC_ALREADY_ACTIVED, "Your Account is already activated");
        validationErrorMsgMap.put(ACC_ALREADY_EXISTED, "Email address is already existed");
        validationErrorMsgMap.put(ACC_WRONG_ACTIVATION_CODE, "Input Activation Code is not correct");   
        validationErrorMsgMap.put(NULL_RESPONSE, "Null Response from backend");
    }
    
    public static ValidationErrorMsg getInstance() {
        return ValidationErrorMsgHolder.INSTANCE;
    }
    
    private static class ValidationErrorMsgHolder {

        private static final ValidationErrorMsg INSTANCE = new ValidationErrorMsg();
    }   
    
    public String getErrorMesage(String errorCode){
        String errorMsg = null;
        if(validationErrorMsgMap.containsKey(errorCode)){
            errorMsg = validationErrorMsgMap.get(errorCode);
        }else{
            errorMsg = "Undefined ErrorCode" + errorCode;
        }
        return  errorMsg;
    }
}
