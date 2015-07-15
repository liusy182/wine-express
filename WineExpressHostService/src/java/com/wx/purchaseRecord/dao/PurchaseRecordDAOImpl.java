/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.purchaseRecord.dao;

import com.wx.common.utility.EntityManagerFactorySingleton;
import com.wx.purchaseRecord.PurchaseRecord;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author yiyuan
 */
public enum PurchaseRecordDAOImpl implements PurchaseRecordDAO{    

    INSTANCE;

    @Override
    public boolean addRecord(PurchaseRecord purchaseRecord){
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();;
        EntityManager em = null;
        boolean successful = false;
        try{
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(purchaseRecord);
            em.getTransaction().commit();
            successful = true;
        } catch (Exception ex){
            Logger.getLogger(PurchaseRecordDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (em != null && em.isOpen()){
                em.close();
            }
            return successful;
        }
    }

    @Override
    public boolean deleteRecord(PurchaseRecord purchaseRecord) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateRecord(PurchaseRecord purchaseRecord) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PurchaseRecord> loadRecordList(String email) {
        List<PurchaseRecord> purchaseRecordList = null;
        EntityManagerFactory emf = EntityManagerFactorySingleton.INSTANCE.getInstance();;
        EntityManager em = null;
        try{
            em = emf.createEntityManager();
            em.getTransaction().begin();
            TypedQuery<PurchaseRecord> query = em.createNamedQuery("PurchaseRecord.findByEmail", PurchaseRecord.class).setParameter("email", email);
            purchaseRecordList = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception ex){
            Logger.getLogger(PurchaseRecordDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (em != null && em.isOpen()){
                em.close();
            }
        }
        return purchaseRecordList;
    }
    
}
