/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import entity.Employee;
import entity.Mechanics;


/**
 *
 * @author User
 */
public class QueryService {
    
    private EntityManager em;

    public QueryService(EntityManager em) {
        this.em = em;
    }

    
    public void querySalry(){
        Query query = em.createQuery("SELECT e FROM Employee e WHERE e.salary > 35000");
        
        List persons = query.getResultList();
        for(int i = 0; i < persons.size(); i++){
            Employee employee = (Employee)persons.get(i);
            System.out.println(employee);
            
        }
    }
    
    public void querySalryTyped(){
        TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e WHERE e.salary > 35000", Employee.class);
        
        List<Employee> persons = query.getResultList();
        for(int i = 0; i < persons.size(); i++){
            Employee employee = persons.get(i);
            System.out.println(employee);
            
        }
    }
    
    public void queryMechanicsTyped(){
        TypedQuery<Mechanics> query = em.createQuery("SELECT m FROM Mechanics m", Mechanics.class);
        
        List<Mechanics> persons = query.getResultList();
        System.out.println("Mechanics in the project:");
        for (Mechanics person : persons) {
            System.out.println("First Name: " + person.getFirstName() + ", Skill: " + person.getSpecificSkill() );
        }
           
    }
    
}
