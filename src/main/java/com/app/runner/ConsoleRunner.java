package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Employee;
import com.app.repo.EmployeeRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.deleteAll();
		// insert data using save()
		Employee e= repo.save(new Employee(101,"AA",2.3));
		repo.save(new Employee(102,"BB",3.3));
		repo.save(new Employee(103,"CC",4.3));
		repo.save(new Employee(104,"DD",5.3));
		
		//insert data with primary key
		Employee e1 = new Employee();
		e1.setId("123abc");
		e1.setEmpId(105);
		e1.setEmpName("EE");
		e1.setEmpCode(6.3);
		repo.save(e1);
		System.out.println(e);
		System.out.println(e1.toString());
		
		//insert data using insert()
		repo.insert(new Employee(106,"FF",7.3));
		System.out.println("done");
		
	}
	

}
