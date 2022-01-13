//package com.couponProject.testing;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import com.couponProject.Utils.Art;
//import com.couponProject.main.ClientType;
//import com.couponProject.main.LoginManager;
//import com.couponProject.services.ClientService;
//
//@Component
////@Order(1)
//public class AdminTest implements CommandLineRunner {
//
//	@Autowired
//	private LoginManager loginManager;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		adminLoginTesting();
//	}
//	
//	public void adminLoginTesting() {
//		Art.printAdminTest();
////		PrintUtils.printTest("# Test 1: Login - bad credentials");
////		System.out.println(
////				"Login unsuccessfully: " + ((ClientService) adminService).login("kobi@gmail.com", "admin") + "\r\n");
//		Scanner s = new Scanner(System.in);
//		ClientService service = null;
//		while (service == null) {
//			try {
//				System.out.println("Enter E-mail: ");
//				String email = s.nextLine();
//				System.out.println("Enter Password: ");
//				String password = s.nextLine();
//				System.out.println("Enter choice of client type (1 - Administrator, 2 - Company, 3 - Customer): ");
//				int choice = s.nextInt();
//				while (choice < 1 || choice > 3) {
//					System.out.println("Invalid choice, try again! (1 - Administrator, 2 - Company, 3 - Customer) ");
//					choice = s.nextInt();
//				}
//				service = loginManager.login(email, password, ClientType.values()[choice - 1]);
//				if (service == null) {
//					System.out.println("Unsuccessful login attempt!");
//					s.nextLine();
//				} else {
//					System.out.println("You are logged in!");
//				}
//			} catch (InputMismatchException e) {
//				System.err.println("Enter digits only for the client type!");
//				s.nextLine();
//			}
//		}
//		/*-----------------------------------------------------------------------------------------------------------*/
////		PrintUtils.printTest("# Test 2: Login - good credentials");
////		System.out.println(
////				"Login successfully: " + ((ClientService) adminService).login("admin@admin.com", "admin") + "\r\n");
//	}
//
//}
