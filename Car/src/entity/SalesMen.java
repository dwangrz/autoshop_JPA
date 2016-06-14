/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
public class SalesMen extends Employee {
    
    @Column(name = "Managing")
    private Boolean isManaging;

    public SalesMen() {
    }

    public SalesMen(Boolean isManaging) {
        this.isManaging = isManaging;
    }
    
    public SalesMen(Long id, String firstName, String lastName, Date dateOfBirth, String title, Integer salary, Boolean isManaging) {
        
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.title = title;
        this.salary = salary;
        this.isManaging = isManaging;
    }

    public Boolean getIsManaging() {
        return isManaging;
    }

    public void setIsManaging(Boolean isManaging) {
        this.isManaging = isManaging;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder("SalesMen{");
      sb.append("id=").append(id);
      sb.append(", FirstName='").append(firstName).append('\'');
      sb.append(", LastName='").append(lastName).append('\'');
      sb.append(", DateOfBirth='").append(dateOfBirth).append('\'');
      sb.append(", Title='").append(title).append('\'');
      sb.append(", Salary='").append(salary).append('\'');
      sb.append(", Managing='").append(isManaging).append('\'');
      sb.append('}');
      return sb.toString();
    }

}
