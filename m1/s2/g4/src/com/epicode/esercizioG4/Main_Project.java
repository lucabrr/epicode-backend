package com.epicode.esercizioG4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product ( 4381L,"cipolla","Boys",33.5);
		Product p2 = new Product ( 1123L,"ciuccio","Baby",20.0);
		Product p3 = new Product ( 3132L,"unLibro","Books",10.0);
		Product p4 = new Product ( 0324L,"babboNatale","Boys",100.0);
		Product p5 = new Product ( 2542L,"zucchinaDoro","Books",200.0);
		Product p6 = new Product ( 4381L,"ps4","gaming",33.5);
		Product p7 = new Product ( 1123L,"sedia","mobile",20.0);
		Product p8 = new Product ( 3132L,"pianta","Giardinaggio",10.0);
		Product p9 = new Product ( 0324L,"penna","Disegno",100.0);
		Product p10 = new Product ( 2542L,"nacosa","Baby",200.0);
		Customer c1 = new Customer(1L, "gennaro", 1);
		
		
		List<Product> arr1 = new ArrayList();
		arr1.add(p1);
		arr1.add(p2);
		arr1.add(p3);
		arr1.add(p4);
		arr1.add(p5);
		List<Product> arr2 = new ArrayList();
		arr2.add(p6);
		arr2.add(p7);
		arr2.add(p8);
		arr2.add(p9);
		arr2.add(p10);
		
		Order o1 = new Order(1L, "In progress", LocalDate.now(), LocalDate.now().plusDays(3), arr1, c1);
		Order o2 = new Order(2L, "In progress", LocalDate.now(), LocalDate.now().plusDays(5), arr2, c1);
		
		
		List<Product> arrStream =  	arr1.stream()
									.filter(x -> x.category.equals("Books"))
									.filter(x -> x.price > 100)
									.collect(Collectors.toList());
		
		
		for (Product p : arrStream) {
			System.out.println( "Prodotto Book superiore 100" + p.toString());
		}
		//esercizio 2
		List<Order> arrOrder = new ArrayList();
		arrOrder.add(o1);
		arrOrder.add(o2);
		
		List<Order> arrOrderFiltered = arrOrder.stream()
										.filter(x -> x.products.stream()
												.anyMatch(product -> product.category.equals("Baby")))
										.collect(Collectors.toList());
										
		for (Order order : arrOrderFiltered) {
			System.out.println(order);
		}
		// esercizio 3
		List<Product> arrProductBoysDiscount = arr1.stream()
												.filter(x-> x.category.equals("Boys"))
												.map(x -> {double sconto = (x.getPrice() * 0.10);
															x.setPrice(x.getPrice() - sconto);
															return x;} )
												.collect(Collectors.toList());
		
		System.out.println("con prodotti scontati "+arr1);
		
												
		
		
		
		
		
		
	}

}
