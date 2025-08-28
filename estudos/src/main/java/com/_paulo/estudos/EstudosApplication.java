package com._paulo.estudos;

import com._paulo.estudos.entities.Employee;
import com._paulo.estudos.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudosApplication implements CommandLineRunner {

	private SalaryService salaryService;

	public EstudosApplication(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {

		SpringApplication.run(EstudosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Paulo", 4000.0);
		System.out.println(salaryService.netSalary(employee));
	}
}
