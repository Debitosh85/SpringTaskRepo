package com.nit.spring;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LoanProcessingApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Loan Processing Application ===");
        System.out.println("Select Bank:");
        System.out.println("1. HDFC");
        System.out.println("2. ICICI");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        LoanApllication loanApp = (choice == 1)
                ? ctx.getBean("hdfcLoanApp", LoanApllication.class)
                : ctx.getBean("iciciLoanApp", LoanApllication.class);

        while (true) {
            System.out.println("\n1. Apply for Loan");
            System.out.println("2. Reject Loan");
            System.out.println("3. View All Applications");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int option = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (option) {
                    case 1 -> {
                        System.out.print("Enter Applicant Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Loan Amount: ");
                        double amount = sc.nextDouble();
                        sc.nextLine(); // consume newline
                        loanApp.apply(name, amount);
                    }
                    case 2 -> {
                        System.out.print("Enter Applicant Name to Reject: ");
                        String name = sc.nextLine();
                        loanApp.reject(name);
                    }
                    case 3 -> loanApp.viewAll();
                    case 4 -> {
                        System.out.println("Exiting System...");
                        ctx.close();
                        sc.close();
                        return;
                    }
                    default -> System.out.println("Invalid Option! Try again.");
                }
            } catch (LoanProcessingException | InvalidLoanOperationException e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            }
        }
    }

   }
