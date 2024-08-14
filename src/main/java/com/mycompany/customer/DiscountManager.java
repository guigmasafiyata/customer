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
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import java.util.List;


@RequestScoped  
public class DiscountManager { 
    
    @PersistenceContext(unitName = "customerPU")
private EntityManager em;


    public List<Discount> getAllDiscounts() {
        
        Query query = em.createNamedQuery("Discount.findAll");
       return query.getResultList();
       
    }  

    @Transactional
    public Customer update(Discount discount) {
      return null;  
    } 
    
     @Transactional
    public void persist(Discount discount) {
        em.persist(discount);
    }
    
    public Discount findById(String code) {
  return em.find(Discount.class, code);
}
}