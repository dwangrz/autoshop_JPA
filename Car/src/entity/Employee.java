
package entity;


import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author User
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected String firstName;
    
    protected String lastName;
    
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    protected Date dateOfBirth;
    
    protected String title;
    
    protected Integer salary;
    
   

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
      final StringBuilder sb = new StringBuilder("Employee{");
      sb.append("id=").append(id);
      sb.append(", FirstName='").append(firstName).append('\'');
      sb.append(", LastName='").append(lastName).append('\'');
      sb.append(", DateOfBirth='").append(dateOfBirth).append('\'');
      sb.append(", Title='").append(title).append('\'');
      sb.append(", Salary='").append(salary).append('\'');
      sb.append('}');
      return sb.toString();
    }
    
}
