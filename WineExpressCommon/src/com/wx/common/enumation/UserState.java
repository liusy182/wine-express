/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.common.enumation;

/**
 *
 * @author Hao
 */
public enum UserState {
       GUEST("guest"),
       MEMBER("member"),
       ADMIN("admin");
       
       private UserState(String stateName){
           this.stateName = stateName;
       }
       
       private String stateName;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    
    @Override
    public String toString(){
        return stateName;
    }
    
    public static UserState fromString(String state){
        for(UserState userState : UserState.values()){
            if(userState.getStateName().equals(state)){
                return userState;
            }
        }
        return null;
    }
           
}
