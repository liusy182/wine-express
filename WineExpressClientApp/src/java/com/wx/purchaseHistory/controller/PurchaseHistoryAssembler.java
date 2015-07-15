/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.purchaseHistory.controller;

import com.wx.common.utility.DateConverter;
import com.wx.purchaseHistory.client.PurchaseRecordDTO;
import com.wx.purchaseHistory.model.PurchaseHistoryBean.PurchaseItem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yiyuan
 */
public class PurchaseHistoryAssembler {
    
    public static List<PurchaseItem> convertDTOToBean(List<PurchaseRecordDTO> purchaseRecordDTOs){
        List<PurchaseItem> purchaseItemList = new ArrayList<PurchaseItem>();
        if (purchaseRecordDTOs != null && purchaseRecordDTOs.size() > 0){
            for (PurchaseRecordDTO record : purchaseRecordDTOs){
                PurchaseItem item = new PurchaseItem();
                item.setEmail(record.getEmail());
                item.setProductName(record.getPurchaseProductName());
                item.setPurchaseDate(DateConverter.toDate(record.getPurchaseDate()));
                purchaseItemList.add(item);
            }
        }
        return purchaseItemList;
    }
}
