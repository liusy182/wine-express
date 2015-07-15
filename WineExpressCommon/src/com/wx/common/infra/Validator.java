/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.common.infra;

import com.wx.common.constant.ErrorMassageCode;
import static com.wx.common.constant.ErrorMassageCode.INVALID_INPUT;
import com.wx.common.exception.ValidationFailedException;
import com.wx.common.singleton.ValidationErrorMsg;

/**
 *
 * @author Hao
 */
public abstract class Validator implements ErrorMassageCode{
    public static void validate(BaseEntityObject entityObject, Class<? extends BaseEntityObject> clazz) throws ValidationFailedException{
       if(clazz.isInstance(entityObject) == false){
           throw new ValidationFailedException(INVALID_INPUT, ValidationErrorMsg.getInstance().getErrorMesage(INVALID_INPUT));
       }
    }
    
    public static void validate(BaseDTO baseDTO, Class<? extends BaseDTO> clazz) throws ValidationFailedException{
           if(clazz.isInstance(baseDTO) == false){
           throw new ValidationFailedException(INVALID_INPUT, ValidationErrorMsg.getInstance().getErrorMesage(INVALID_INPUT));
       }
    }
}
