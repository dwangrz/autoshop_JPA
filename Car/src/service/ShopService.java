/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.persistence.EntityManager;
import entity.AutoShop;


/**
 *
 * @author User
 */
public class ShopService {
    
    private EntityManager em;

    public ShopService(EntityManager em) {
        this.em = em;
    }
    
     public AutoShop creatAutoShop(AutoShop autoshop){
        em.persist(autoshop);
//         for (Employee employee : autoshop.getEmployees()) {
//             em.persist(employee);
//         }
        return autoshop;
    }
    
    public void removeAutoShop(Long id){
        AutoShop autoshop = em.find(AutoShop.class, id);
        if (autoshop != null)
            em.remove(autoshop);
    }
    
    public void removeAutoShop(AutoShop autoshop){
        //em.remove(em.merge(autoshop));
        em.merge(autoshop);
        em.remove(autoshop);
    }
    
    
    public AutoShop findAutoShop(Long id){
        return em.find(AutoShop.class, id);
    }
    
}
