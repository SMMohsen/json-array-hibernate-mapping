package com.hibernate.hibernate.json.array.model;

import com.vladmihalcea.hibernate.type.array.ListArrayType;
import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employees")
@TypeDefs({
        @TypeDef(name = "json", typeClass = JsonType.class),
        @TypeDef(name = "list-array" , typeClass = ListArrayType.class)
})
public class Employee {

    /*
    annotation is deprecated now but as i read from some resources this will be reverted in future
    hibernate release
     */


    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Type(type = "json")
    @Column(name = "addresses",columnDefinition = "jsonb")
    private List<Address> addresses;

    @Type(type = "json")
    @Column(name = "salary",columnDefinition = "jsonb")
    private Salary salary;

    @Type(type = "list-array")
    @Column(name = "departments" , columnDefinition = "integer[]")
    private List<Long> departments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public List<Long> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Long> departments) {
        this.departments = departments;
    }
}
