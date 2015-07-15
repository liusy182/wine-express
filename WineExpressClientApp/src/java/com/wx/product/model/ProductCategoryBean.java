package com.wx.product.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.io.IOException;  
import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.UUID;  
import javax.faces.bean.SessionScoped;
  
import javax.faces.context.FacesContext;  
import javax.faces.event.ActionEvent;  
import javax.servlet.ServletContext;  
/**
 *
 * @author Zhou Wenyi
 */
@ManagedBean
@SessionScoped
public class ProductCategoryBean implements Serializable{

    private List<Category> categories;  
    private Category selectedCategory;
    private boolean displayProductList; 
        
    private final static String[] colors;  
      
    private final static String[] manufacturers; 
    
    static {  
        colors = new String[10];  
        colors[0] = "Black";  
        colors[1] = "White";  
        colors[2] = "Green";  
        colors[3] = "Red";  
        colors[4] = "Blue";  
        colors[5] = "Orange";  
        colors[6] = "Silver";  
        colors[7] = "Yellow";  
        colors[8] = "Brown";  
        colors[9] = "Maroon";  
          
        manufacturers = new String[10];  
        manufacturers[0] = "Mercedes";  
        manufacturers[1] = "BMW";  
        manufacturers[2] = "Volvo";  
        manufacturers[3] = "Audi";  
        manufacturers[4] = "Renault";  
        manufacturers[5] = "Opel";  
        manufacturers[6] = "Volkswagen";  
        manufacturers[7] = "Chrysler";  
        manufacturers[8] = "Ferrari";  
        manufacturers[9] = "Ford";  
    }  
    
    /**
     * Creates a new instance of ProductCategoryBean
     */
    public ProductCategoryBean() {
        categories = new ArrayList<>();  
        displayProductList = false;  
        populateCategories(categories);   
          
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    private void populateCategories(List<Category> categories) {
        
        List<SubCategory> subcategories = new ArrayList<>();
        
        for(int i = 0 ; i < 10 ; i++)  
            subcategories.add(new SubCategory(colors[i]));
        
        categories.add(new Category("Colors","",subcategories));
        
        subcategories = new ArrayList<>();
        
        for(int i = 0 ; i < 10 ; i++)  
            subcategories.add(new SubCategory(manufacturers[i]));
        
        categories.add(new Category("Manufacturers","",subcategories));
        
    }

    public boolean isDisplayProductList() {
        return displayProductList;
    }

    public void setDisplayProductList(boolean displayProductList) {
        this.displayProductList = displayProductList;
    }
    
    public String testAction(){
        setDisplayProductList(true);
        return "main.xhtml?faces-redirect=true";
    }

    public Category getSelectedCategory() {
        return selectedCategory;
    }

    public void setSelectedCategory(Category selectedCategory) {
        this.selectedCategory = selectedCategory;
    }
    
    

}
