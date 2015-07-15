/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.purchaseRecord.service;

import com.wx.common.exception.FatalException;
import com.wx.purchaseRecord.dto.PurchaseRecordDTO;
import java.util.Date;
import java.util.List;
import junit.framework.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author yiyuan
 */
public class PurchaseRecordServiceTest {
    
    PurchaseRecordService service;
    static String accountId;
    
    public PurchaseRecordServiceTest() {
        service = new PurchaseRecordService();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        accountId = "yiyuan1@hotmail.com";
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test()
    public void testAddPurchaseHistory() {
        PurchaseRecordDTO dto = new PurchaseRecordDTO();
        dto.setEmail("yiyuan1@hotmail.com");
        dto.setPurchaseDate(new Date());
        dto.setPurchaseProductName("test");
        boolean successful = false;
        try{
            successful = service.addPurchaseHistory(dto);
        } catch(FatalException ex){
            Assert.assertTrue(false);
        } catch(Exception ex){
            Assert.assertTrue(false);
        }
        Assert.assertTrue(successful);
    }
    
    @Test()
    public void testGetPurchaseHistory() {
        List<PurchaseRecordDTO> purchaseRecordList = null;
        try{
            purchaseRecordList = service.getPurchaseHistory(accountId);
        } catch(FatalException ex){
        }
        
        Assert.assertNotNull(purchaseRecordList);
        Assert.assertTrue(purchaseRecordList.size() > 0);
    }
}
