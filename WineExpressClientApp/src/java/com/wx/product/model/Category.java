/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.product.model;

import java.util.ArrayList;  
import java.util.List;  

/**
 *
 * @author Zhou Wenyi
 */
public class Category {
    
    private String name;
    private String description;
    private List<SubCategory> subcategories;

    public Category(String name, String description, List<SubCategory> subcategories) {
        this.name = name;
        this.description = description;
        this.subcategories = subcategories;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SubCategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubCategory> subcategories) {
        this.subcategories = subcategories;
    }
    
    public List<String> getNameListfromSubCategories (){
        List<String> names = new ArrayList<>(); 
        
        for (SubCategory s : subcategories) {
            names.add(s.getName());
        }
        return names;
        
    }
    
    
    
}
