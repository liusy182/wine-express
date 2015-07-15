/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.assembler;

import com.wx.account.constant.AccountInfoConstants;
import com.wx.account.dto.AccountInfoDTO;
import com.wx.account.form.IsAccUserinfo;
import com.wx.common.enumation.UserState;

/**
 *
 * @author Hao
 */
public class AccountInfoAssembler implements AccountInfoConstants {

    public static AccountInfoDTO covertEntityToDTO(IsAccUserinfo isAccUserinfo) {
        AccountInfoDTO accountInfoDTO = null;
        if (isAccUserinfo != null) {
            accountInfoDTO = new AccountInfoDTO();
            accountInfoDTO.setBirthday(isAccUserinfo.getBirthday());
            accountInfoDTO.setEmail(isAccUserinfo.getEmail());
            accountInfoDTO.setSex(isAccUserinfo.getSex());
            accountInfoDTO.setState(UserState.fromString(isAccUserinfo.getType()));
        }
        return accountInfoDTO;

    }

    public static IsAccUserinfo covertDTOtoEntity(AccountInfoDTO accountInfoDTO) {
        IsAccUserinfo isAccUserinfo = null;
        if (accountInfoDTO != null) {
            isAccUserinfo = new IsAccUserinfo();
            isAccUserinfo.setBirthday(accountInfoDTO.getBirthday());
            isAccUserinfo.setEmail(accountInfoDTO.getEmail());
            isAccUserinfo.setPassword(accountInfoDTO.getPassword());
            isAccUserinfo.setSex(accountInfoDTO.getSex());
            isAccUserinfo.setType(accountInfoDTO.getState().getStateName());
            String actived = null;
            if (accountInfoDTO.isActivated()) {
                actived = AccountInfoConstants.ACTIVE;
            } else {
                actived = AccountInfoConstants.INACTIVE;
            }
            isAccUserinfo.setActived(actived);

        }
        return isAccUserinfo;
    }

    public static void mergeEntity(IsAccUserinfo oldEntity, IsAccUserinfo newEntity) {
        if (oldEntity != null && newEntity != null && oldEntity.getEmail().equals(newEntity.getEmail())) {
            if (newEntity.getBirthday() != null) {
                if (oldEntity.getBirthday() == null || oldEntity.getBirthday().equals(newEntity.getBirthday()) == false) {
                    oldEntity.setBirthday(newEntity.getBirthday());
                }
            }
            if (newEntity.getPassword() != null) {
                if (oldEntity.getPassword() == null || oldEntity.getPassword().equals(newEntity.getPassword()) == false) {
                    oldEntity.setPassword(newEntity.getPassword());
                }
            }
            if (newEntity.getSex() != null) {
                if (oldEntity.getSex() == null || oldEntity.getSex().equals(newEntity.getSex()) == false) {
                    oldEntity.setSex(newEntity.getSex());
                }
            }
            if (newEntity.getType() != null) {
                if (oldEntity.getType() == null || oldEntity.getType().equals(newEntity.getType()) == false) {
                    oldEntity.setType(newEntity.getType());
                }
            }
        }else{
            throw new IllegalStateException("Trying to merge two different account instances");
        }
    }
}
