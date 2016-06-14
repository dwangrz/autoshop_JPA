/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;



import entity.Employee;
import entity.Mechanics;
import entity.SalesMen;
import javax.persistence.EntityManager;

/**
 *
 * @author User
 */
public class EmployeeService {
    
    private EntityManager em;

    public EmployeeService(EntityManager em) {
        this.em = em;
    }
    
    public SalesMen creatSalesMen(SalesMen salesMen){
        em.persist(salesMen);
        return salesMen;
    }
    
    public void removeSalesMen(SalesMen salesMen){
        em.remove(em.merge(salesMen));
    }
    
    
    public SalesMen findSalesMen(Long id){
        return em.find(SalesMen.class, id);
    }
    
    
    public Mechanics creatMechanics(Mechanics mechanics){
        em.persist(mechanics);
        return mechanics;
    }
    
    public void removeMechanics(Mechanics mechanics){
        em.remove(em.merge(mechanics));
    }
    
    
    public Mechanics findMechanics(Long id){
        return em.find(Mechanics.class, id);
    }
            
    
    public void removeEmployee(Employee employees){
        em.remove(em.merge(employees));
    }  
            
}
