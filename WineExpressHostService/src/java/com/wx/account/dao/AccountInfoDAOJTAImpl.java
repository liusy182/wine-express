/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.dao;

import com.wx.account.form.IsAccUserinfo;
import com.wx.common.utility.EntityManagerFactorySingleton;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author Hao
 */
public enum AccountInfoDAOJTAImpl implements AccountInfoDAO {

    INSTANCE;

    @Override
    public IsAccUserinfo readUserInfo(String email) {
        IsAccUserinfo userInfo = null;
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();
        EntityManager em = emf.createEntityManager();

        try {
            UserTransaction transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            userInfo = em.find(IsAccUserinfo.class, email);
            transaction.commit();
        } catch (NamingException | NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            Logger.getLogger(AccountInfoDAOJTAImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            em.close();
        }
        return userInfo;
    }

    @Override
    public List<IsAccUserinfo> listAllUserInfo() {
        List<IsAccUserinfo> userInfoList = null;
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();
        EntityManager em = emf.createEntityManager();
        try {
            UserTransaction transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            TypedQuery<IsAccUserinfo> query = em.createNamedQuery("IsAccUserinfo.findAll", IsAccUserinfo.class);
            userInfoList = query.getResultList();
            transaction.commit();
        } catch (NamingException | NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            Logger.getLogger(AccountInfoDAOJTAImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            em.close();
        }
        return userInfoList;
    }

    @Override
    public void createUserInfo(IsAccUserinfo isAccUserinfo) {
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();
        EntityManager em = emf.createEntityManager();
        try {
            UserTransaction transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            em.persist(isAccUserinfo);
            transaction.commit();
        } catch (NamingException | NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            Logger.getLogger(AccountInfoDAOJTAImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            em.close();
        }
    }

    @Override
    public void updateUserInfo(IsAccUserinfo isAccUserinfo) {
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();
        EntityManager em = emf.createEntityManager();
        try {
            UserTransaction transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            em.merge(isAccUserinfo);
            transaction.commit();
        } catch (NamingException | NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            Logger.getLogger(AccountInfoDAOJTAImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteUserInfo(String email) {
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();
        EntityManager em = emf.createEntityManager();
        try {
            UserTransaction transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            IsAccUserinfo isAccUserinfo = em.find(IsAccUserinfo.class, email);
            em.remove(isAccUserinfo);
            transaction.commit();
        } catch (NamingException | NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException ex) {
            Logger.getLogger(AccountInfoDAOJTAImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            em.close();
        }
    }

}
