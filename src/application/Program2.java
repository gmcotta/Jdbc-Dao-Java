package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById ===");
		Department dept = departmentDao.findById(2);
		System.out.println(dept);
		
		System.out.println("\n\n=== TEST 2: findAll ===");
		List<Department> list = new ArrayList<Department>();
		list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		/*
		System.out.println("\n\n=== TEST 3: insert ===");
		Department newDep = new Department(5, "Mobile");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		*/
		/*
		System.out.println("\n\n=== TEST 4: update ===");
		dept = departmentDao.findById(6);
		dept.setName("Music");
		departmentDao.update(dept);
		System.out.println("Update completed!");
		list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		*/
		
		System.out.println("\n\n=== TEST 5: delete ===");
		System.out.print("Enter id for delete department: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		list = departmentDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		
		sc.close();

	}

}
