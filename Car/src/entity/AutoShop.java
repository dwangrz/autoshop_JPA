/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class AutoShop{


    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String address;
    
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name = "auto_FK")
//    @JoinTable(name = "AutoShop_Employee", 
//            joinColumns = @JoinColumn(name = "AutoShop_fk"),
//            inverseJoinColumns = @JoinColumn(name = "Employee_fk"))
    private Set<Employee> employees = new HashSet<>();

    public AutoShop() {
    }
    

    public AutoShop(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
    

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("AutoShop{");
      sb.append("id=").append(id);
      sb.append(", Address='").append(address).append('\'');
      sb.append('}');
      return sb.toString();
    }
    
}
