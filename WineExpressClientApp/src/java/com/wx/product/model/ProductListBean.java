/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.product.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  


  
/**
 *
 * @author Zhou Wenyi
 */
@ManagedBean
@ViewScoped
public class ProductListBean implements Serializable{
    private static final long serialVersionUID = 5405231951061180880L;

    /**
     * Creates a new instance of ProductListBean
     */
    public ProductListBean() {
        products = new ArrayList<>();  
          
        populateRandomProducts(products, 50);   
    }
    
        
    private final static String[] colors;  
    
    private final static String[] manufacturers; 
    
    private final static String[] models;
      
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
        
        models = new String[10];  
        models[0] = "99 Vines Pinot Noir";  
        models[1] = "A to Z Pinot Fris";  
        models[2] = "Annalisa Moscato d'Asti";  
        models[3] = "Annalisa Soave";  
        models[4] = "Anton Bauer Gruner Veltliner";  
        models[5] = "Artadi Pagos Viejos 00";  
        models[6] = "Babshee Chardonnay";  
        models[7] = "Basket Press Blanc";  
        models[8] = "Belle Provencale White";  
        models[9] = "Benjamin Romeo Contador";         
    }  
  
    private List<Product> products;  
      
    private Product selectedProduct;  
  
    private Product[] selectedProducts;
    
    private List<Product> filteredProducts;
    
      
    public Product getSelectedProduct() {  
        return selectedProduct;  
    }  
  
    public void setSelectedProduct(Product selectedProduct) {  
        this.selectedProduct = selectedProduct;  
    }  
  
    private void populateRandomProducts(List<Product> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Product(getRandomModel(), getRandomYear(), getRandomManufacturer(), getRandomColor()));  
    }  
  
    public List<Product> getProducts() {  
        return products;  
    }  
  
    private int getRandomYear() {  
        return (int) (Math.random() * 50 + 1960);  
    }  
      
    private String getRandomColor() {  
        return colors[(int) (Math.random() * 10)];  
    }  
      
    private String getRandomManufacturer() {  
        return manufacturers[(int) (Math.random() * 10)];  
    }  
      
    private String getRandomModel() {  
        return models[(int) (Math.random() * 10)];  
    }  

    public Product[] getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(Product[] selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public List<Product> getFilteredProducts() {
        return filteredProducts;
    }

    public void setFilteredProducts(List<Product> filteredProducts) {
        this.filteredProducts = filteredProducts;
    }

    
}
