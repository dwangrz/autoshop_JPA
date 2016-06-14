package entity;

import entity.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-14T22:06:26")
@StaticMetamodel(AutoShop.class)
public class AutoShop_ { 

    public static volatile SingularAttribute<AutoShop, String> address;
    public static volatile SingularAttribute<AutoShop, Long> id;
    public static volatile SetAttribute<AutoShop, Employee> employees;

}