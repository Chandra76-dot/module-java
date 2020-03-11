package Strings;



import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.List;



enum Currency {

	Dollar, Rupee, Yen

};



enum Department {

	Sales, Marketing, Production

};



// create immutable class

final class Company {

	private String companyName;

	private int registartionNumber;

	public List<Employee> elist;

	public String deptarray[];



	// no setter and writer only getters



	// set values to private properties through constructor

	Company(String companyName, int registrationNumber) {

		this.companyName = companyName;

		this.registartionNumber = registrationNumber;

	}



	public String getCompanyName() {

		return companyName;

	}



	public int getReistartionNumber() {

		return registartionNumber;

	}



	public Employee registerEmployee() {

		return new Employee();

	}

}



// mutable class means objects of Employee class allows to change their state



class Employee {

	private StringBuilder empName;

	private int empCode;

	private Currency salaryType;

	private float salary;



	public StringBuilder getEmpName() {

		return empName;

	}



	public void setEmpName(StringBuilder empName) {

		this.empName = empName;

	}



	public int getEmpCode() {

		return empCode;

	}



	public void setEmpCode(int empCode) {

		this.empCode = empCode;

	}



	public Currency getSalaryType() {

		return salaryType;

	}



	public void setSalaryType(Currency salaryType) {

		this.salaryType = salaryType;

	}



	public float getSalary() {

		return salary;

	}



	public void setSalary(float salary) {

		this.salary = salary;

	}



}



public class Myimmutable {



	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO Auto-generated method stub



		Company c1 = new Company("HCL", 12345);

		Company c2 = c1;

		c2 = new Company("Wipro", 9999);

		c2.getCompanyName().replace('W', 'P');



		Currency money = Currency.Rupee;



		// c1=null;

		System.out.println(money);

		System.out.println("Company: " + c1.getCompanyName() + "Registartion Number:" + c1.getReistartionNumber());

		System.out.println("Company: " + c2.getCompanyName() + "Registartion Number:" + c2.getReistartionNumber());



		char reply;

		c1.elist = new ArrayList<Employee>();

		do {

			Employee e = c1.registerEmployee();

			System.out.println("Enter the Employee code:");



			// create input stream reader object

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			e.setEmpCode(Integer.parseInt(br.readLine()));



			System.out.println("Enter Employee Name:");

			e.setEmpName(new StringBuilder(br.readLine()));

			

			

			//accept salary ,salary type here

			e.setSalaryType(money);

			

			System.out.println("Enter salary in "+money);

			e.setSalary(Float.parseFloat(br.readLine()));



			

			//add employee type object list collections

			c1.elist.add(e);



			System.out.println("Wish to add more?(y/n)");

			reply = br.readLine().toLowerCase().charAt(0);

		} while (reply == 'y');



		for (Employee emp : c1.elist) {

			System.out.println(emp.getEmpCode() + "\t" + emp.getEmpName());



		}



	}



}
