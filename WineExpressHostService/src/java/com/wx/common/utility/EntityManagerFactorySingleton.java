/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.common.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hao
 */
public enum EntityManagerFactorySingleton {
    INSTANCE;
//    RESOUCE_LOCAL("LOCAL"),
//    RESOURCE_JTA("JTA");
   // private final EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("");
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(RESOURCE_LOCAL);;
    private static final String RESOURCE_LOCAL = "wineExpressTestUnit";
   // private static final String JTA = "WineExpressHostServicePU";
    public EntityManagerFactory getInstance(){
        return  entityManagerFactory;
    }
    

    
}
