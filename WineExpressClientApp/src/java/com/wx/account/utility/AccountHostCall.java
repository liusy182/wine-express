/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.utility;

import com.wx.account.service.AccountInfoAppService;
import com.wx.account.service.AccountInfoAppService_Service;
import com.wx.account.service.AccountInfoDTO;
import com.wx.account.service.AccountStateDTO;
import com.wx.account.service.FatalException_Exception;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hao
 */
public class AccountHostCall {

    public static AccountStateDTO callLoginService(AccountInfoDTO accountInfoDTO) {
        AccountStateDTO accountStateDTO = null;
        try {
            AccountInfoAppService_Service service = new AccountInfoAppService_Service();
            AccountInfoAppService port = service.getAccountInfoAppServicePort();
            accountStateDTO = port.loginExistingAccount(accountInfoDTO);
        } catch (FatalException_Exception ex) {
            Logger.getLogger(AccountHostCall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountStateDTO;
    }

    public static AccountStateDTO callRegisterService(AccountInfoDTO accountInfoDTO) {
        AccountStateDTO accountStateDTO = null;
        try {
            AccountInfoAppService_Service service = new AccountInfoAppService_Service();
            AccountInfoAppService port = service.getAccountInfoAppServicePort();
            accountStateDTO = port.registerAccount(accountInfoDTO);
        } catch (FatalException_Exception ex) {
            Logger.getLogger(AccountHostCall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountStateDTO;
    }

    public static AccountStateDTO callActiveAccountService(AccountInfoDTO accountInfoDTO) {
        AccountStateDTO accountStateDTO = null;
        try {
            AccountInfoAppService_Service service = new AccountInfoAppService_Service();
            AccountInfoAppService port = service.getAccountInfoAppServicePort();
            accountStateDTO = port.activateAccount(accountInfoDTO);
        } catch (FatalException_Exception ex) {
            Logger.getLogger(AccountHostCall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountStateDTO;
    }

    public static boolean callUpdateAccountService(AccountInfoDTO accountInfoDTO) {
        boolean updateSuccessful = true;
        try {
            AccountInfoAppService_Service service = new AccountInfoAppService_Service();
            AccountInfoAppService port = service.getAccountInfoAppServicePort();
            port.updateAccount(accountInfoDTO);
        } catch (FatalException_Exception ex) {
            updateSuccessful = false;
            Logger.getLogger(AccountHostCall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return updateSuccessful;
    }

    public static AccountInfoDTO callGetAccountInfoService(String email) {
        AccountInfoDTO accountInfoDTO = null;
        try {
            AccountInfoAppService_Service service = new AccountInfoAppService_Service();
            AccountInfoAppService port = service.getAccountInfoAppServicePort();
            accountInfoDTO = port.getAccountInfo(email);
        } catch (FatalException_Exception ex) {
            Logger.getLogger(AccountHostCall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountInfoDTO;
    }

    public static List<AccountInfoDTO> callGetAllMembersInfoService() {
        List<AccountInfoDTO> accountInfoDTOList = null;
        try {
            AccountInfoAppService_Service service = new AccountInfoAppService_Service();
            AccountInfoAppService port = service.getAccountInfoAppServicePort();
            accountInfoDTOList = port.getAllMemberAccountInfo();
        } catch (FatalException_Exception ex) {
            Logger.getLogger(AccountHostCall.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accountInfoDTOList;
    }
}
