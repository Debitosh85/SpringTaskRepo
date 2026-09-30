package com.nit.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.nit.DAO.ProductDAO;
import com.nit.model.Product;
@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	ProductDAO dao;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("===Product Menu===");
		System.out.println("1:Add Product");
		System.out.println("2:View Product by Id ");
		System.out.println("3:View All Product");
		System.out.println("4:Exit");
		
		System.out.println("Enter you Choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 -> {
			Product p = new Product();
			System.out.println("Enter Product id: ");
			int id = sc.nextInt();
			p.setId(id);
			System.out.println("Enter Product Name:");
		    sc.nextLine();
			String name =sc.nextLine();
			p.setName(name);
			System.out.println("Enter Product Category:");
			String cat = sc.nextLine();
			p.setCategory(cat);
			System.out.println("Enter Product price:");
			double price = sc.nextDouble();
			p.setPrice(price);
			int result = dao.insertProduct(p);
			System.out.println(result>0?"Product Added":"Failed");
		}
		case 2 -> {
			System.out.println("Enter the ProductId to See the Product:");
			int id = sc.nextInt();
			try {
				Product pro = dao.getProductById(id);
				System.out.println("Product Found:"+pro);
			}catch(Exception e) {
				System.out.println("Product Not found");
			}
		}
		
		case 3->{
			dao.getAllProducts().forEach(System.out::println);
		}
		
		case 4 -> System.out.println("Exciting");
		default->System.out.println("Invalid Choice");
		}
		sc.close();
		}
	}
	
	

