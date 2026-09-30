package com.nit.runner;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.nit.Application;
import com.nit.Dao.ProductDAO;
import com.nit.enitity.Product;

@Component
public class AppRunner implements ApplicationRunner {

    private final Application application;
	@Autowired
	Product product;
	@Autowired
	ProductDAO repo;

    AppRunner(Application application) {
        this.application = application;
    }
	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("=====Product ManageMent Menu=====");
			System.out.println("1.Add Product");
			System.out.println("2.View Product by Id");
			System.out.println("3.View All Products");
			System.out.println("4.Update Product");
			System.out.println("5.Delete Product");
			System.out.println("6.Search By Category");
			System.out.println("7.Filter by Price Range");
			System.out.println("8.Show Product Count");
		    System.out.println("Exit");
		    
		    System.out.println("Enter Your Choice");
		    int choice = sc.nextInt();
		    
		    switch(choice) {
		    case 1 -> {
		    	System.out.println("Enter Product Id:");
		    	int id = sc.nextInt();
		    	product.setId(id);
		    	sc.nextLine();
		    	System.out.println("Enter Prouct Name:");
		    	String name = sc.nextLine();
		    	product.setName(name);
		    	System.out.println("Enter Product Category");
		    	System.out.println("Available Products are:Electronics,Footwear,Fashion,Sports");
		    	String cat = sc.nextLine();
		    	product.setCategory(cat);
		    	System.out.println("Enter Proudct Price");
		    	double price = sc.nextDouble();
		    	product.setPrice(price);
		    	repo.insertProduct(product);
		    	if(product!=null) {
		    		System.out.println("Product added Successfully"+product);
		    	}else {
		    		System.out.println("Product added into the Store");
		    	}
		    	break;
		    }
		    
		    case 2 -> {
		    	System.out.println("Enter the product Id to view the Product: ");
		    	int pId = sc.nextInt();
		        Product prod=repo.getProductByid(pId);
		        System.out.println(prod);
		    	break;
		    }
		    case 3 -> {
		    	
		    	System.out.println("\u001B[32m"+"Here you can Explore the Available Products in Store:");
		    	repo.getAllProducts().forEach(System.out::println);
		    	break;
		    }
		    case 4 ->{
		    	System.out.println("Enter the Id of the Product");
		    	int id =sc.nextInt();
		    	product.setId(id);
		    	sc.nextLine();
		    	System.out.println("Enter the New Product Name");
		    	String name = sc.nextLine();
		    	product.setName(name);
		    	System.out.println("Category Want to Update");
		    	String cat = sc.nextLine();
		    	product.setCategory(cat);
		    	System.out.println("Enter the New Price");
		    	double price = sc.nextDouble();
		    	product.setPrice(price);
		    	repo.updateProduct(product);
		    	System.out.println("Product Successfully Updated🎉");
		    	System.out.println("Updated Product:"+repo.getProductByid(id));
		    	break;
		    }
		    case 5 -> {
		    	System.out.println("Enter the ProductId Want to Remove:");
		    	int id = sc.nextInt();
		    	if(id==product.getId()) {
		    		repo.deletProductById(id);
		    		System.out.println("Product Successfully Removed");
		    	}else {
		    		System.out.println("Product doesn't exist");
		    	}
		    	break;
		    }
		    case 6 -> {
		    	System.out.println("Enter The Product Category Want to knew about");
		    	String Category = sc.nextLine().trim();
		    	if (Category.isEmpty()) Category = sc.nextLine().trim();
		    	List<Product> list = repo.getProductsByCategory(Category);
		    	System.out.println("Found: " + list.size() + " products");
		    	list.forEach(System.out::println);
		    	break;
		    }
		    case 7 ->{
		    	System.out.println("Enter Price Range to See the Product between");
		    	System.out.println("Enter min price ");
		    	int min = sc.nextInt();
		    	System.out.println("Enter Max Price:");
		    	int max = sc.nextInt();
		        List<Product> priceRange= repo.getProductsInPriceRange(min, max);
		        for(Product product:priceRange) {
		        	System.out.println(product);
		        }
		    	break;
		    }
		    case 8->{
		    	System.out.println("Total Products:"+repo.countTotalProducts());
		    	break;
		    }
		    case 9 ->{
		    	sc.close();
		    	System.out.println("Exit");
		    	break;
		    }
		    default ->{
		    	System.out.println("Invalid Input........");
		    }
		    
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
