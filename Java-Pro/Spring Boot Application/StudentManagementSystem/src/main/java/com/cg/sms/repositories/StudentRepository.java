package com.cg.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sms.entites.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
