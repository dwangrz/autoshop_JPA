/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import entity.AutoShop;
import entity.Employee;
import entity.Mechanics;
import entity.SalesMen;
import service.EmployeeService;
import service.QueryService;
import service.ShopService;

/**
 *
 * @author User
 */
public class Main {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CarPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();


        EmployeeService emservice = new EmployeeService(em);
        ShopService shopservice = new ShopService(em);
        
        tx.begin();
        Set<Employee> employees = new HashSet<>();
        

        employees.add(new SalesMen(1L, "Mikael", "Johansson", Date.valueOf("1981-1-1"), "junior sale", 30000, Boolean.TRUE));
        employees.add(new Mechanics(2L, "Olle", "Andersson", Date.valueOf("1978-8-20"), "senior mechanics", 38000, "Mounting"));
        employees.add(new Mechanics(3L, "Peter", "Wang", Date.valueOf("1988-12-20"), "junior mechanics", 32000, "Welding"));
        employees.add(new Mechanics(4L, "Mathias", "Lundström", Date.valueOf("1985-6-30"), "senior mechanics", 40000, "Driling"));
        employees.add(new Mechanics(5L, "Jonas", "Backström", Date.valueOf("1989-1-12"), "junior mechanics", 33000, "Mounting"));

        AutoShop shop1 = new AutoShop(1L, "Drottningsgatan 99");
        AutoShop shop2 = new AutoShop(2L, "Kungsgatan 100");
        
        shop1.setEmployees(employees);
        
        shopservice.creatAutoShop(shop1);
        shopservice.creatAutoShop(shop2);
        
        tx.commit();
        
        System.out.println(shop1);
        System.out.println(employees);
        
        //remove
//        tx.begin();                     
//        shopservice.removeAutoShop(shop1);
//        
//        for (Employee employee : employees) {
//            emservice.removeEmployee(employee);
//        }
//        tx.commit();
        
//        
//        System.out.println(shop1);
//        System.out.println(employees);


        QueryService qservice = new QueryService(em);
        
        System.out.println();
        System.out.println("Query the salary:");

        tx.begin();
        
//        qservice.querySalry();
        qservice.querySalryTyped();
        
        tx.commit();
        
        System.out.println();
        System.out.println("Query the person:");
        
        tx.begin();
        qservice.queryMechanicsTyped();
        tx.commit();
        
        
        em.close();
        
        emf.close();
        
        

    }
    
}
