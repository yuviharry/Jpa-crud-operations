package com.jpa.example.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner{
@Autowired private RepoForEmpdet repo;
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//empDetail(); 
		//updateempdet();
		listempdet();
		//getempdet();
		deleteempdet();
		
	}
	private void updateempdet() {
		Integer id =2;
		Employeedetails employee = repo.findById(id);
		employee.setEmail("babulprasad@gmail.com");
		
		repo.update(employee);
		
		
	}
	private void deleteempdet() {
		Integer id = 2;
		repo.delete(id);
	}
	private void getempdet() {
		Integer id=2;
		Employeedetails emp = repo.findById(id);
		System.out.println(emp);
	}

	private void empDetail() {
		Employeedetails employee =new Employeedetails();
		employee.setEmployee_Name("Babul prasad");
		employee.setEmail("babul64@gmail.com");
		employee.setMobileNumber("84345329568");
		repo.save(employee);
	}
	private void listempdet() {
		List<Employeedetails> listempdet= repo.findAll();
		listempdet.forEach(System.out::println);
	}

     
}
