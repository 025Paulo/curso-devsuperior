package com._paulo.estudos;

import com._paulo.estudos.entities.Order;
import com._paulo.estudos.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudosApplication implements CommandLineRunner {

	private OrderService orderService;


	public EstudosApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {

		SpringApplication.run(EstudosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Exemplo 1
		Order order1 = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código: " + order1.getCode() + " Valor total: R$" + (String.format("%.2f", orderService.total(order1))));

		// Exemplo 2
		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código: " + order2.getCode() + " Valor total: R$" + (String.format("%.2f", orderService.total(order2))));

		// Exemplo 3
		Order order3 = new Order(1309, 95.90, 0);
		System.out.println("Pedido código: " + order3.getCode() + " Valor total: R$" + (String.format("%.2f", orderService.total(order3))));
	}

}
