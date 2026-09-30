package com.nt;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.LayeredController;
import com.nt.model.Employee;

@SpringBootApplication
public class RealtimeDiLayeredAppsApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(RealtimeDiLayeredAppsApplication.class, args);
		
		try(Scanner sc = new Scanner(System.in);ctx){
			
			System.out.println("Enter DesigNation 1:");
			String desgn1 = sc.nextLine();
			
			System.out.println("Enter DesigNation 2:");
			String desgn2 = sc.nextLine();
			
			System.out.println("Enter DesigNation 3:");
			String desgn3 = sc.nextLine();
			
			LayeredController lc = ctx.getBean("ctlr", LayeredController.class);
			
		    List<Employee> lst = lc.processEmployeeBydesg(desgn1, desgn2, desgn3);
		    
			/*  lst.forEach(emp->{
				System.out.println(emp);
			});*/
		    
		    Iterator<Employee> itr = lst.iterator();
		    
		    while(itr.hasNext()) {
		    	
		    	System.out.println(itr.next());
		    	System.out.println("==========================");
		    }
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
