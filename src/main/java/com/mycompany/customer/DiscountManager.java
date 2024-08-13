/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.customer;

import com.mycompany.customer.entity.Customer;
import com.mycompany.customer.entity.Discount;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

/**
 *
 * @author GUIGMA Safiyata
 */




@RequestScoped 
public class DiscountManager {
    
    @PersistenceContext(unitName = "")
private EntityManager em;
    
    public List<Customer> getAllDiscounts() {  
      return null;  
    }  

    @Transactional
    public Discount update(Discount discount) {
 return em.merge(discount);  
    } 
    
     @Transactional
    public void persist(Discount discount) {
       em.persist(discount);
    }
    
     public Discount findById(int idDiscount) {
        return em.find(Discount.class, idDiscount);
    }
}
    

