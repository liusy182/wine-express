/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.controller;

import com.wx.account.model.AccountBean;
import com.wx.account.model.AccountInfoBean;
import com.wx.account.service.AccountInfoDTO;
import com.wx.account.service.AccountStateDTO;
import com.wx.account.utility.AccountAssembler;
import com.wx.account.utility.AccountHostCall;
import com.wx.common.enumation.MenuItems;
import com.wx.common.enumation.UserState;
import com.wx.main.controller.MainController;
import com.wx.purchaseHistory.client.FatalException_Exception;
import com.wx.purchaseHistory.client.PurchaseRecordDTO;
import com.wx.purchaseHistory.client.PurchaseRecordService;
import com.wx.purchaseHistory.client.PurchaseRecordService_Service;
import static com.wx.purchaseHistory.controller.PurchaseHistoryAssembler.convertDTOToBean;
import com.wx.purchaseHistory.model.PurchaseHistoryBean;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Hao
 */
@ManagedBean(name = "accountController")
@ViewScoped
public class AccountController {

    @ManagedProperty("#{mainController}")
    private MainController mainController;

    @ManagedProperty("#{accountBean}")
    private AccountBean accountBean;

    @ManagedProperty("#{accountInfoBean}")
    private AccountInfoBean accountInfoBean;

    @ManagedProperty("#{purchaseHistoryBean}")
    private PurchaseHistoryBean purchaseHistoryBean;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void setPurchaseHistoryBean(PurchaseHistoryBean purchaseHistoryBean) {
        this.purchaseHistoryBean = purchaseHistoryBean;
    }

    public void setAccountBean(AccountBean accountBean) {
        this.accountBean = accountBean;
    }

    public void setAccountInfoBean(AccountInfoBean accountInfoBean) {
        this.accountInfoBean = accountInfoBean;
    }

    /**
     * Creates a new instance of accountController
     */
    public AccountController() {
    }

    public void testMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successful", "Hello "));

    }
    
     public String loginTest() {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sample info message", "PrimeFaces rocks!"));
         return "main.xhtml";
     }
     
         public void loginTest(ActionEvent event) {
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sample info message", "PrimeFaces rocks!"));
       
     }

    public String login() {
        mainController.prepareMemberState();
        mainController.openPage(MenuItems.PHOTO_GALLERY);
        return "main.xhtml?faces-redirect=true";
        /*
        AccountInfoDTO inputAccountInfoDTO = AccountAssembler.buildLoginAccountInfoDTO(accountBean.getUserName(), accountBean.getPassword());
        AccountStateDTO accountStateDTO = AccountHostCall.callLoginService(inputAccountInfoDTO);
        if (accountStateDTO == null) {
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "NULL RESPONSE", "no signals returned from backend"));
            return null;
        } else if (accountStateDTO.isLoginSuccessed() == false) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,accountStateDTO.getFailCode(), accountStateDTO.getFailMassage()));
            return null;
        } else {
            AccountInfoDTO accountInfoDTO = AccountHostCall.callGetAccountInfoService(accountBean.getUserName());
            com.wx.account.service.UserState state = accountInfoDTO.getState();
            if (state != null) {
                switch (state) {
                    case MEMBER:
                        mainController.prepareMemberState();
                        break;
                    case ADMIN:
                        mainController.prepareAdminState();
                        break;
                    default:
                }
            }
            //login done, assign the requested DTO to session scope for others to use it
            accountInfoBean.setAccountInfoDTO(accountInfoDTO);
            mainController.openPage(MenuItems.PHOTO_GALLERY);
            return "main.xhtml?faces-redirect=true";
        } */

    }

    public String openActivationPage() {
        mainController.openPage(MenuItems.ACCOUNT_ACTIVATION);
        return "main.xhtml?faces-redirect=true";
    }
    
      public String openRegisterPage() {
        mainController.openPage(MenuItems.REGISTER_FORM);
        return "main.xhtml?faces-redirect=true";
    }

    public String logout() {
        accountInfoBean.setAccountInfoDTO(null);
        mainController.prepareGuestState();
        return "main.xhtml?faces-redirect=true";
    }

    public String openChangePasswordPage() {
        if (mainController.getUserState().equals(UserState.GUEST)) {
            throw new IllegalStateException("This method is not valid for Guest State");
        }
        mainController.openPage(MenuItems.CHANGE_PASSWORD);
        return "main.xhtml?faces-redirect=true";
    }
    
        public String openChangeParticularsPage() {
        if (mainController.getUserState().equals(UserState.GUEST)) {
            throw new IllegalStateException("This method is not valid for Guest State");
        }
        mainController.openPage(MenuItems.CHANGE_PATICULARS);
        return "main.xhtml?faces-redirect=true";
    }

    public String viewPurchaseHistory() {
        if (mainController.getUserState().equals(UserState.GUEST)) {
            throw new IllegalStateException("This method is not valid for Guest State");
        }
        // TODO
        String userAccountId = "yiyuan1@hotmail.com";
        try {
            PurchaseRecordService_Service service = new PurchaseRecordService_Service();
            PurchaseRecordService port = service.getPurchaseRecordServicePort();
            List<PurchaseRecordDTO> purchaseRecordList = port.getPurchaseHistory(userAccountId);
            purchaseHistoryBean.setPurchaseItemsList(convertDTOToBean(purchaseRecordList));
            mainController.openPage(MenuItems.PURCHASE_HISTORY);
        } catch (FatalException_Exception ex) {

        }
        return "main.xhtml?faces-redirect=true";
    }
 
}
