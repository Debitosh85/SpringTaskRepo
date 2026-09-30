package com.nit.LooseCouplingNew;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.cfgs.AppConfig;
import com.nit.target.IEngine;
import com.nit.target.Vehicle;

public class VehicleMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Vehicle v = ctx.getBean("vehicle",Vehicle.class);
		
		IEngine e = v.getengine();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Vehicle brand....");
		String mvehicle = sc.nextLine();
		v.veModel(mvehicle,e.getClass().getSimpleName());
		
		sc.close();
		ctx.close();
	}
}
