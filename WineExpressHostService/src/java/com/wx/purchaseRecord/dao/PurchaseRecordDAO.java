/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.purchaseRecord.dao;

import com.wx.purchaseRecord.*;
import java.util.List;

/**
 *
 * @author yiyuan
 */
public interface PurchaseRecordDAO {
    public boolean addRecord(PurchaseRecord purchaseRecord);
    public boolean deleteRecord(PurchaseRecord purchaseRecord);
    public boolean updateRecord(PurchaseRecord purchaseRecord);
    public List<PurchaseRecord> loadRecordList(String email);
}
