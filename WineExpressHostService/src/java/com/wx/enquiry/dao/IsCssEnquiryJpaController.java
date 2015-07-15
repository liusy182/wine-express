/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.enquiry.dao;

import com.wx.enquiry.dao.exceptions.NonexistentEntityException;
import com.wx.enquiry.dao.exceptions.PreexistingEntityException;
import com.wx.enquiry.dao.exceptions.RollbackFailureException;
import com.wx.enquiry.form.IsCssEnquiry;
import com.wx.enquiry.form.IsCssEnquiryPK;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

/**
 *
 * @author guyan_000
 */
public class IsCssEnquiryJpaController implements Serializable {

    public IsCssEnquiryJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(IsCssEnquiry isCssEnquiry) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (isCssEnquiry.getIsCssEnquiryPK() == null) {
            isCssEnquiry.setIsCssEnquiryPK(new IsCssEnquiryPK());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(isCssEnquiry);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findIsCssEnquiry(isCssEnquiry.getIsCssEnquiryPK()) != null) {
                throw new PreexistingEntityException("IsCssEnquiry " + isCssEnquiry + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(IsCssEnquiry isCssEnquiry) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            isCssEnquiry = em.merge(isCssEnquiry);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                IsCssEnquiryPK id = isCssEnquiry.getIsCssEnquiryPK();
                if (findIsCssEnquiry(id) == null) {
                    throw new NonexistentEntityException("The isCssEnquiry with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(IsCssEnquiryPK id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            IsCssEnquiry isCssEnquiry;
            try {
                isCssEnquiry = em.getReference(IsCssEnquiry.class, id);
                isCssEnquiry.getIsCssEnquiryPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The isCssEnquiry with id " + id + " no longer exists.", enfe);
            }
            em.remove(isCssEnquiry);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<IsCssEnquiry> findIsCssEnquiryEntities() {
        return findIsCssEnquiryEntities(true, -1, -1);
    }

    public List<IsCssEnquiry> findIsCssEnquiryEntities(int maxResults, int firstResult) {
        return findIsCssEnquiryEntities(false, maxResults, firstResult);
    }

    private List<IsCssEnquiry> findIsCssEnquiryEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(IsCssEnquiry.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public IsCssEnquiry findIsCssEnquiry(IsCssEnquiryPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(IsCssEnquiry.class, id);
        } finally {
            em.close();
        }
    }

    public int getIsCssEnquiryCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<IsCssEnquiry> rt = cq.from(IsCssEnquiry.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
