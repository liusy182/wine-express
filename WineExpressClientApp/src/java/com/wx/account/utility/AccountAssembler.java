/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.account.utility;

import com.wx.account.service.AccountInfoDTO;

/**
 *
 * @author Hao
 */
public class AccountAssembler {
    public static AccountInfoDTO buildLoginAccountInfoDTO(String account,String password){
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setEmail(account);
        accountInfoDTO.setPassword(password);
        return accountInfoDTO;
    }
}
