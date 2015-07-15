 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.utility;

import com.wx.account.constant.AccountInfoConstants;
import com.wx.account.dao.AccountInfoDAOLocalImpl;
import com.wx.account.dto.AccountInfoDTO;
import com.wx.account.form.IsAccUserinfo;
import com.wx.common.exception.ValidationFailedException;
import com.wx.common.infra.Validator;
import com.wx.common.singleton.ValidationErrorMsg;
import com.wx.common.utility.SymmetricCipherEncryper;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;

/**
 *
 * @author Hao
 */
;

public class AccountInfoValidator extends Validator implements AccountInfoConstants {

    private final AccountInfoDTO accountInfoDTO;
    private final IsAccUserinfo accUserinfo;

    public AccountInfoValidator(AccountInfoDTO accountInfoDTO, IsAccUserinfo accUserinfo) {
        this.accUserinfo = accUserinfo;
        this.accountInfoDTO = accountInfoDTO;
    }

    public void validateAccountPasswordCorrectness() throws ValidationFailedException {
        boolean validateFail = true;
        String inputPassword = null;
        String password = null;
        if (accUserinfo != null || accUserinfo.getPassword() != null) {
            password = accUserinfo.getPassword();
            if (accountInfoDTO != null) {
                inputPassword = accountInfoDTO.getPassword();
            }
            if (inputPassword != null && inputPassword.equals(password)) {
                validateFail = false;
            }
        }

        if (validateFail) {
            throw new ValidationFailedException(ACC_WRONG_USR_OR_PWD, ValidationErrorMsg.getInstance().getErrorMesage(ACC_WRONG_USR_OR_PWD));
        }
    }

    public void validateAccountActivated() throws ValidationFailedException {
        String isActived = accUserinfo.getActived();
        if (isActived.equals(INACTIVE)) {
            throw new ValidationFailedException(ACC_NOT_ACTIVED, ValidationErrorMsg.getInstance().getErrorMesage(ACC_NOT_ACTIVED));
        }
    }

    public void validateActivationCode() throws ValidationFailedException {
        boolean validationFail = true;
        if (accUserinfo != null) {
            if (accUserinfo.getActived().equals(ACTIVE)) {
                  throw new ValidationFailedException(ACC_ALREADY_ACTIVED, ValidationErrorMsg.getInstance().getErrorMesage(ACC_ALREADY_ACTIVED));
            }
            
            if(accountInfoDTO != null && accountInfoDTO.getActivationCode() != null){
                try {
                    String inputActivationCode = accountInfoDTO.getActivationCode();
                     String storedActivationCode  = accUserinfo.getPrivatekey();
                    
                    if(inputActivationCode.equals(storedActivationCode)){ 
                        validationFail = false;
                    }
                } catch (Exception ex) {
                    Logger.getLogger(AccountInfoValidator.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
        
        if(validationFail){
             throw new ValidationFailedException(ACC_WRONG_ACTIVATION_CODE, ValidationErrorMsg.getInstance().getErrorMesage(ACC_WRONG_ACTIVATION_CODE));
        }
    }
    
    public static void validateAccountExisted(String email) throws ValidationFailedException{
        boolean validationFail = false;
        IsAccUserinfo existingAcc =  AccountInfoDAOLocalImpl.INSTANCE.readUserInfo(email);
        if(existingAcc != null){
            validationFail = true;
        }
        if(validationFail){
            throw new ValidationFailedException(ACC_ALREADY_EXISTED, ValidationErrorMsg.getInstance().getErrorMesage(ACC_ALREADY_EXISTED));
        }
    }
}
