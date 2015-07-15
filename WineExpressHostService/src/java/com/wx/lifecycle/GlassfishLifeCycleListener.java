/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.lifecycle;

import com.sun.appserv.server.LifecycleEvent;
import static com.sun.appserv.server.LifecycleEvent.SHUTDOWN_EVENT;
import com.sun.appserv.server.LifecycleListener;
import com.sun.appserv.server.ServerLifecycleException;
import com.wx.common.utility.EntityManagerFactorySingleton;

/**
 *
 * @author Hao
 */
public class GlassfishLifeCycleListener implements LifecycleListener {

    @Override
    public void handleEvent(LifecycleEvent le) throws ServerLifecycleException {
       switch(le.getEventType()){
           case SHUTDOWN_EVENT:
               EntityManagerFactorySingleton.INSTANCE.getInstance().close();
           default:
       }
    }
    
}
