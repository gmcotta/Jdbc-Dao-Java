package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Department obj = new Department(1, "Books");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
		System.out.println("\n\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department); 
		
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n\n=== TEST 3: seller findAll ===");
		List<Seller> list2 = sellerDao.findAll(); 
		
		for (Seller s : list2) {
			System.out.println(s);
		}
		
		/*
		System.out.println("\n\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		*/
		/*
		System.out.println("\n\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(8);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		*/
		
		System.out.println("\n\n=== TEST 6: seller delete ===");
		System.out.print("Enter id for delete seller: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		list2 = sellerDao.findAll();
		for(Seller s : list2) {
			System.out.println(s);
		}
		
		sc.close();
	}

}
