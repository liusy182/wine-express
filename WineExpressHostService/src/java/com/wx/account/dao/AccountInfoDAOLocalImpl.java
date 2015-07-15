/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.dao;

import com.wx.account.form.IsAccUserinfo;
import com.wx.common.utility.EntityManagerFactorySingleton;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author Hao
 */
public enum AccountInfoDAOLocalImpl implements AccountInfoDAO {

    INSTANCE;

    @Override
    public IsAccUserinfo readUserInfo(String email) {
        IsAccUserinfo userInfo = null;
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            userInfo = em.find(IsAccUserinfo.class, email);
            em.getTransaction().commit();
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
            em.getTransaction().begin();
            TypedQuery<IsAccUserinfo> query = em.createNamedQuery("IsAccUserinfo.findAll", IsAccUserinfo.class);
            userInfoList = query.getResultList();
            em.getTransaction().commit();
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
            em.getTransaction().begin();
            em.persist(isAccUserinfo);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void updateUserInfo(IsAccUserinfo isAccUserinfo) {
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(isAccUserinfo);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteUserInfo(String email) {
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            IsAccUserinfo isAccUserinfo = em.find(IsAccUserinfo.class, email);
            em.remove(isAccUserinfo);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

}
