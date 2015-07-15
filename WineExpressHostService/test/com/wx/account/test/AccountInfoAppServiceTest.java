/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.test;

import com.wx.account.dto.AccountInfoDTO;
import com.wx.account.dto.AccountStateDTO;
import com.wx.account.service.AccountInfoAppService;
import com.wx.common.constant.ErrorMassageCode;
import static com.wx.common.constant.ErrorMassageCode.ACC_NOT_ACTIVED;
import static com.wx.common.constant.ErrorMassageCode.ACC_WRONG_USR_OR_PWD;
import com.wx.common.enumation.UserState;
import com.wx.common.exception.FatalException;
import com.wx.common.singleton.ValidationErrorMsg;
import com.wx.common.utility.EntityManagerFactorySingleton;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Hao
 */
public class AccountInfoAppServiceTest implements ErrorMassageCode{

    AccountInfoAppService accountInfoAppService;

    public AccountInfoAppServiceTest() {
        accountInfoAppService = new AccountInfoAppService();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        EntityManagerFactorySingleton.INSTANCE.getInstance().close();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

   // @Test(testName = "RegisterService")
    public void testRegisterService() {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setActivated(false);
        Calendar calender = Calendar.getInstance();
        calender.set(1988, 8, 24);
        accountInfoDTO.setBirthday(calender.getTime());
        accountInfoDTO.setEmail("a@gmail.com");
        accountInfoDTO.setSex("FAMALE");
        accountInfoDTO.setState(UserState.MEMBER);
        accountInfoDTO.setPassword("1234");
        AccountStateDTO accountStateDTO = null;
        try {
            accountStateDTO =  accountInfoAppService.registerAccount(accountInfoDTO);
        } catch (FatalException ex) {
            Logger.getLogger(AccountInfoAppServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
             Assert.assertNotNull(accountStateDTO);
        Assert.assertEquals(true, accountStateDTO.isRegisterSuccessed());
    }
    
   //  @Test(testName = "RegisterWithExistingEmail")
    public void testRegisterWithExistingEmail() {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setActivated(false);
        Calendar calender = Calendar.getInstance();
        calender.set(1988, 8, 24);
        accountInfoDTO.setBirthday(calender.getTime());
        accountInfoDTO.setEmail("fu.lei88@gmail.com");
        accountInfoDTO.setSex("FAMALE");
        accountInfoDTO.setState(UserState.MEMBER);
        accountInfoDTO.setPassword("1234");
        AccountStateDTO accountStateDTO = null;
        try {
            accountStateDTO =  accountInfoAppService.registerAccount(accountInfoDTO);
        } catch (FatalException ex) {
            Logger.getLogger(AccountInfoAppServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Assert.assertNotNull(accountStateDTO);
//        Assert.assertEquals(false, accountStateDTO.isRegisterSuccessed());
//        Assert.assertEquals(ACC_ALREADY_EXISTED, accountStateDTO.getFailCode());
//        Assert.assertEquals(ValidationErrorMsg.getInstance().getErrorMesage(ACC_ALREADY_EXISTED), accountStateDTO.getFailMassage());
    }

   // @Test(testName = "getAccountInfo")
    public void testGetAccountInfo() {
        String email = "fu.lei88@gmail.com";
        try {
            AccountInfoDTO accountInfoDTO = accountInfoAppService.getAccountInfo(email);
            printAccountInfoDTO(accountInfoDTO);
        } catch (FatalException ex) {
            Logger.getLogger(AccountInfoAppServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
  //   @Test(testName = "ListAccountInfo")
    public void testListAccountInfo() {
      
        try {
            List<AccountInfoDTO> accountInfoDTOList = accountInfoAppService.getAllMemberAccountInfo();
            for(AccountInfoDTO accountInfoDTO: accountInfoDTOList)
                printAccountInfoDTO(accountInfoDTO);
        } catch (FatalException ex) {
            Logger.getLogger(AccountInfoAppServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
 //   @Test(testName = "LoginInactivatedAccount")
    public void testLoginInactivatedAccount() {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setEmail("fu.lei88@gmail.com");
        accountInfoDTO.setPassword("1234");
        AccountStateDTO accountState = null;
        try {
          accountState = accountInfoAppService.loginExistingAccount(accountInfoDTO);
        } catch (FatalException ex) {
            Logger.getLogger(AccountInfoAppServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Assert.assertNotNull(accountState);
        Assert.assertEquals(accountState.isLoginSuccessed(), false);
        Assert.assertEquals(ACC_NOT_ACTIVED, accountState.getFailCode());
        Assert.assertEquals(ValidationErrorMsg.getInstance().getErrorMesage(ACC_NOT_ACTIVED),accountState.getFailMassage());
    }
    
//    @Test(testName = "Activate account")
    public void testActivateAccount() {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setEmail("fu.lei88@gmail.com");
        accountInfoDTO.setActivationCode("598331c2-ff12-4fa9-83bd-197e30318566");
        AccountStateDTO accountState = null;
        try {
          accountState = accountInfoAppService.activateAccount(accountInfoDTO);
        } catch (FatalException ex) {
            Logger.getLogger(AccountInfoAppServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Assert.assertNotNull(accountState);
        Assert.assertEquals(accountState.isActivationSuccessed(), true);
//        Assert.assertEquals(ACC_NOT_ACTIVED, accountState.getFailCode());
//        Assert.assertEquals(ValidationErrorMsg.getInstance().getErrorMesage(ACC_NOT_ACTIVED),accountState.getFailMassage());
    }
    
  //   @Test(testName = "ActivateAccountAgain")
    public void testActivateAccountAgain() {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setEmail("fu.lei88@gmail.com");
        accountInfoDTO.setActivationCode("598331c2-ff12-4fa9-83bd-197e30318566");
        AccountStateDTO accountState = null;
        try {
          accountState = accountInfoAppService.activateAccount(accountInfoDTO);
        } catch (FatalException ex) {
            Logger.getLogger(AccountInfoAppServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Assert.assertNotNull(accountState);
        Assert.assertEquals(accountState.isActivationSuccessed(), false);
        Assert.assertEquals(ACC_ALREADY_ACTIVED, accountState.getFailCode());
        Assert.assertEquals(ValidationErrorMsg.getInstance().getErrorMesage(ACC_ALREADY_ACTIVED),accountState.getFailMassage());
    }
    
   @Test(testName = "ActivateWrongActivationCode")
    public void testActivateWrongActivationCode() {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setEmail("a88@gmail.com");
        accountInfoDTO.setActivationCode("598331c2-ff12-4fa9-83bd-197e30318566");
        AccountStateDTO accountState = null;
        try {
          accountState = accountInfoAppService.activateAccount(accountInfoDTO);
        } catch (FatalException ex) {
            Logger.getLogger(AccountInfoAppServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Assert.assertNotNull(accountState);
        Assert.assertEquals(accountState.isActivationSuccessed(), false);
        Assert.assertEquals(ACC_WRONG_ACTIVATION_CODE, accountState.getFailCode());
        Assert.assertEquals(ValidationErrorMsg.getInstance().getErrorMesage(ACC_WRONG_ACTIVATION_CODE),accountState.getFailMassage());
    }
    
    //  @Test(testName = "LoginWithWrongPassword")
    public void testLoginWithWrongPassword() {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setEmail("fu.lei88@gmail.com");
        accountInfoDTO.setPassword("12345");
        AccountStateDTO accountState = null;
        try {
          accountState = accountInfoAppService.loginExistingAccount(accountInfoDTO);
        } catch (FatalException ex) {
            Logger.getLogger(AccountInfoAppServiceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Assert.assertNotNull(accountState);
        Assert.assertEquals(accountState.isLoginSuccessed(), false);
        Assert.assertEquals(ACC_WRONG_USR_OR_PWD, accountState.getFailCode());
        Assert.assertEquals(ValidationErrorMsg.getInstance().getErrorMesage(ACC_WRONG_USR_OR_PWD),accountState.getFailMassage());
    }

    private void printAccountInfoDTO(AccountInfoDTO accountInfoDTO) {
        if (accountInfoDTO != null) {
            if (accountInfoDTO.getActivationCode() != null) {
                System.out.println("Activation Code: " + accountInfoDTO.getActivationCode());
            }
            if (accountInfoDTO.getBirthday()!= null) {
                System.out.println("Birthday: " + accountInfoDTO.getBirthday().toString());
            }
            if (accountInfoDTO.getEmail()!= null) {
                System.out.println("Email: " + accountInfoDTO.getEmail());
            }
            if (accountInfoDTO.getPassword()!= null) {
                System.out.println("Password: " + accountInfoDTO.getPassword());
            }
            if (accountInfoDTO.getSex()!= null) {
                System.out.println("Sex: " + accountInfoDTO.getSex());
            }
            if (accountInfoDTO.getState()!= null) {
                System.out.println("State: " + accountInfoDTO.getState().toString());
            }
        }
    }
}
