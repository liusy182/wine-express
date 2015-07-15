/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.application.galleria.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.AfterBegin;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Hao
 */
@ManagedBean
@ViewScoped
public class galleriaBean implements Serializable{

    private static List<String> images;
    private static final long serialVersionUID = -6817178542527874374L;

    /**
     * Creates a new instance of galleriaBean
     */
    public galleriaBean() {
        images = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            images.add("wine" + i + ".jpg");
        }
    }

    @AfterBegin
    public void initialize() {

    }

    public List<String> getImages() {
        return images;
    }

}
