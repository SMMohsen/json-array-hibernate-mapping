package com.hibernate.hibernate.json.array.repository;

import com.hibernate.hibernate.json.array.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sun.net.www.content.image.jpeg;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
