/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.account.dao;

import com.wx.account.form.IsAccUserinfo;
import java.util.List;

/**
 *
 * @author Hao
 */
public interface AccountInfoDAO {
     public IsAccUserinfo readUserInfo(String email);
     public void createUserInfo(IsAccUserinfo isAccUserinfo);
     public void updateUserInfo(IsAccUserinfo isAccUserinfo);
     public void deleteUserInfo(String email);
     public List<IsAccUserinfo> listAllUserInfo();
}
