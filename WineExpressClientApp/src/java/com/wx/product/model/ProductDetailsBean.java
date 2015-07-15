/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.product.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.io.IOException;  
import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.Date;
import java.util.List;  
import java.util.UUID;  
  
import javax.faces.context.FacesContext;  
import javax.faces.event.ActionEvent;  
import javax.servlet.ServletContext;  


  
/**
 *
 * @author Zhou Wenyi
 */
@ManagedBean
@RequestScoped
public class ProductDetailsBean implements Serializable{

    /**
     * Creates a new instance of ProductCommentBean
     */
    public ProductDetailsBean() {
        comments = new ArrayList<>();  
          
        populateRandomComments(comments, 50);   
    }
    
        
    private final static String[] contents;  
    
    private final static String[] users; 
      
    static {  
        users = new String[10];  
        users[0] = "Johanna";  
        users[1] = "Meiting Xu";  
        users[2] = "Sim Mongyi";  
        users[3] = "SmilebabyWEN";  
        users[4] = "Wai Cheong Lok";  
        users[5] = "CM Wong";  
        users[6] = "Haitian Zhu";  
        users[7] = "Wang Earthman";  
        users[8] = "Betty Sanjaya";  
        users[9] = "Natasha Hudges";  
          
        contents = new String[10];  
        contents[0] = " faction of humans who colonize the Alpha Centauri star system to escape from a totalitarian Earth government. The player assumes the role of Nikola ap Io, the leader of an Alpha Centauri milita";  
        contents[1] = "difficult development process. Critical reception was highly positive. Reviewers praised its tactical elem";  
        contents[2] = "However, reception of its graphics was mixed, and many noted the game's steep system requirements. ";  
        contents[3] = "Despite critical acclaim and sales above 100,000 units, the game was a commercial failure";  
        contents[4] = "Peninsular War: In the Battle of Barrosa, an Anglo-Spanish-Portuguese force trying to lift the Siege of Cádiz was able to defeat a French attack, although they were ultimately unable to break the siege itself.";  
        contents[5] = "he Gloster Meteor (pictured), the first operational jet fighter for the Allied Powers, had its first flight";  
        contents[6] = "pioneering British home computer, was launched by Sinclair Research an";  
        contents[7] = "hat there were actually 40 variants of the \"One Ring\" designed by Jens Hoyer Hansen for use in shooting The Lord of the Rings films";  
        contents[8] = "For Wikipedia-related communication in languages other than English.";  
        contents[9] = "Announcements, updates, articles and press releases on Wikipedia and the Wikimedia Foundation.";  
               
    }  
  
    private List<Comment> comments;  
    
    private Product product;
    
    private void populateRandomComments(List<Comment> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Comment(i, getRandomContent(),"daddypig1987@gmail.com", getRandomUser(), getRandomDate()));  
        
    }  
  
    public List<Comment> getComments() {  
        return comments;  
    }  
  
    private Date getRandomDate() {  
        return new Date();
    }  
      
    private String getRandomContent() {  
        return contents[(int) (Math.random() * 10)];  
    }  
      
    private String getRandomUser() {  
        return users[(int) (Math.random() * 10)];  
    }  

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
}
