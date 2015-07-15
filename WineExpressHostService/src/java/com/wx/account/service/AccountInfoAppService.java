/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.service;

import com.wx.account.assembler.AccountInfoAssembler;
import com.wx.account.constant.AccountInfoConstants;
import com.wx.account.dao.AccountInfoDAO;
import com.wx.account.dao.AccountInfoDAOJTAImpl;
import com.wx.account.dao.AccountInfoDAOLocalImpl;
import com.wx.account.dto.AccountInfoDTO;
import com.wx.account.dto.AccountStateDTO;
import com.wx.account.form.IsAccUserinfo;
import com.wx.account.utility.AccountInfoValidator;
import com.wx.common.enumation.UserState;
import com.wx.common.exception.FatalException;
import com.wx.common.exception.ValidationFailedException;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Hao
 */
@WebService(serviceName = "AccountInfoAppService")
@Stateless()
public class AccountInfoAppService implements AccountInfoConstants {

    /**
     * Web service operation
     *
     * @param accountInfoDTO
     * @return accountStateDTO
     * @throws com.wx.common.exception.FatalException
     */
    
    private final AccountInfoDAO accountInfoDAO;
    
    public AccountInfoAppService(){
        accountInfoDAO = AccountInfoDAOLocalImpl.INSTANCE;
    }
    @WebMethod(operationName = "loginExistingAccount")
    public AccountStateDTO loginExistingAccount(@WebParam(name = "accountInfoDTO") AccountInfoDTO accountInfoDTO) throws FatalException {
        //TODO write your implementation code here:
        AccountStateDTO accountStateDTO = new AccountStateDTO();
        try {

            String email = accountInfoDTO.getEmail();
            IsAccUserinfo isAccUserinfo =accountInfoDAO.readUserInfo(email);
            AccountInfoValidator validator = new AccountInfoValidator(accountInfoDTO, isAccUserinfo);
            AccountInfoValidator.validate(accountInfoDTO, AccountInfoDTO.class);
            validator.validateAccountPasswordCorrectness();
            validator.validateAccountActivated();

            accountStateDTO.setLoginSuccessed(true);
            String savedState = isAccUserinfo.getType();
            UserState state = UserState.fromString(savedState);
            accountStateDTO.setState(state);
        } catch (ValidationFailedException vfe) {
            accountStateDTO.setLoginSuccessed(false);
            accountStateDTO.setFailCode(vfe.getErrorCode());
            accountStateDTO.setFailMassage(vfe.getErrorMassag1e());
        } catch (RuntimeException e) {
            FatalException fatalException = new FatalException(e);
            Logger.getLogger(AccountInfoAppService.class.getName()).log(Level.SEVERE, null, e);
            throw fatalException;
        }
        return accountStateDTO;
    }

    /**
     * Web service operation
     *
     * @param accountInfoDTO
     * @return AccountStateDTO
     * @throws com.wx.common.exception.FatalException
     */
    @WebMethod(operationName = "activateAccount")
    public AccountStateDTO activateAccount(@WebParam(name = "accountInfoDTO") AccountInfoDTO accountInfoDTO) throws FatalException {
        //TODO write your implementation code here:
        AccountStateDTO accountStateDTO = new AccountStateDTO();
        try {
            String email = accountInfoDTO.getEmail();
            IsAccUserinfo isAccUserinfo = accountInfoDAO.readUserInfo(email);
            AccountInfoValidator validator = new AccountInfoValidator(accountInfoDTO, isAccUserinfo);
            AccountInfoValidator.validate(accountInfoDTO, AccountInfoDTO.class);
            validator.validateActivationCode();
            //Validation is successed if code goes here
            //Change the user information to validation success 
            isAccUserinfo.setActived(ACTIVE);
            accountInfoDAO.updateUserInfo(isAccUserinfo);
            //Build up response object
            accountStateDTO.setActivationSuccessed(true);
        } catch (ValidationFailedException vfe) {
            accountStateDTO.setActivationSuccessed(false);
            accountStateDTO.setFailCode(vfe.getErrorCode());
            accountStateDTO.setFailMassage(vfe.getErrorMassag1e());
        } catch (RuntimeException e) {
            FatalException fatalException = new FatalException(e);
            Logger.getLogger(AccountInfoAppService.class.getName()).log(Level.SEVERE, null, e);
            throw fatalException;
        }
        return accountStateDTO;
    }

    /**
     * Web service operation
     *
     * @param email
     * @return AccountInfoDTO
     * @throws com.wx.common.exception.FatalException
     */
    @WebMethod(operationName = "getAccountInfo")
    public AccountInfoDTO getAccountInfo(@WebParam(name = "email") String email) throws FatalException {
        //TODO write your implementation code here:
        AccountInfoDTO accountInfoDTO = null;
        try {

            IsAccUserinfo isAccUserinfo = accountInfoDAO.readUserInfo(email);
            accountInfoDTO = AccountInfoAssembler.covertEntityToDTO(isAccUserinfo);
        } catch (RuntimeException e) {
            FatalException fatalException = new FatalException(e);
            Logger.getLogger(AccountInfoAppService.class.getName()).log(Level.SEVERE, null, e);
            throw fatalException;
        }
        return accountInfoDTO;
    }

    /**
     * @return @throws com.wx.common.exception.FatalException Web service
     * operation
     */
    @WebMethod(operationName = "getAllMemberAccountInfo")
    public List<AccountInfoDTO> getAllMemberAccountInfo() throws FatalException {
        //TODO write your implementation code here:
        List<AccountInfoDTO> accountInfoDTOList = new LinkedList<>();
        try {

            List<IsAccUserinfo> accUserinfoList = accountInfoDAO.listAllUserInfo();
            for (IsAccUserinfo isAccUserinfo : accUserinfoList) {
                AccountInfoDTO accountInfoDTO = null;
                accountInfoDTO = AccountInfoAssembler.covertEntityToDTO(isAccUserinfo);
                if (accountInfoDTO != null) {
                    accountInfoDTOList.add(accountInfoDTO);
                }
            }
        } catch (RuntimeException e) {
            FatalException fatalException = new FatalException(e);
            Logger.getLogger(AccountInfoAppService.class.getName()).log(Level.SEVERE, null, e);
            throw fatalException;
        }
        return accountInfoDTOList;
    }

    /**
     * Web service operation
     *
     * @param accountInfoDTO
     * @return
     * @throws com.wx.common.exception.FatalException
     */
    @WebMethod(operationName = "registerAccount")
    public AccountStateDTO registerAccount(@WebParam(name = "accountInfoDTO") AccountInfoDTO accountInfoDTO) throws FatalException {
        //TODO write your implementation code here:
        AccountStateDTO accountStateDTO = new AccountStateDTO();
        try {
            IsAccUserinfo isAccUserinfo = AccountInfoAssembler.covertDTOtoEntity(accountInfoDTO);
            String email = isAccUserinfo.getEmail();
            AccountInfoValidator.validateAccountExisted(email);
            
            String activationCode = UUID.randomUUID().toString();
            isAccUserinfo.setPrivatekey(activationCode);
            isAccUserinfo.setActived(INACTIVE);
            accountInfoDAO.createUserInfo(isAccUserinfo);
            //Build up the response object
            accountStateDTO.setRegisterSuccessed(true);
        } catch (ValidationFailedException vfe) {
            accountStateDTO.setRegisterSuccessed(false);
            accountStateDTO.setFailCode(vfe.getErrorCode());
            accountStateDTO.setFailMassage(vfe.getErrorMassag1e());
        } catch (Exception e) {
            FatalException fatalException = new FatalException(e);
            Logger.getLogger(AccountInfoAppService.class.getName()).log(Level.SEVERE, null, e);
            throw fatalException;
        }

        return accountStateDTO;
    }

    /**
     * Web service operation
     *
     * @param accountInfoDTO
     * @throws com.wx.common.exception.FatalException
     */
    @WebMethod(operationName = "updateAccount")
    public void updateAccount(@WebParam(name = "accountInfoDTO") AccountInfoDTO accountInfoDTO) throws FatalException {
        try {
            IsAccUserinfo toBeUpdateAccount = AccountInfoAssembler.covertDTOtoEntity(accountInfoDTO);
            String email = accountInfoDTO.getEmail();
            IsAccUserinfo existingAccount = accountInfoDAO.readUserInfo(email);
            AccountInfoAssembler.mergeEntity(existingAccount, toBeUpdateAccount);
            accountInfoDAO.updateUserInfo(existingAccount);
        } catch (Exception e) {
            FatalException fatalException = new FatalException(e);
            Logger.getLogger(AccountInfoAppService.class.getName()).log(Level.SEVERE, null, e);
            throw fatalException;
        }
    }
}
