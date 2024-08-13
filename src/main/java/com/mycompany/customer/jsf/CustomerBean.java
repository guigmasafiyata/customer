/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.customer.jsf;

import com.mycompany.customer.CustomerManager;
import com.mycompany.customer.entity.Customer;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *  Backing bean de la page customerList.xhtml.
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {
     private List<Customer> customerList;  


    /**
     * Creates a new instance of CustomerBean
     */
    @Inject  
private CustomerManager customerManager;
    
    public CustomerBean() {
    }
         
    
  /** 
   * Retourne la liste des clients pour affichage dans une DataTable.
     * @return 
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}
    

