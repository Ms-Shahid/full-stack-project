package com.cg.sms.services.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.cg.sms.entites.Student;
import com.cg.sms.repositories.StudentRepository;
import com.cg.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	//whenever we are using single field, we can create a constructor insted of Autowired annotation
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	
}
