package Introtri;



public class Incometax {

	public static void main(String[] args){

		long income=190000L;

		String category;

		System.out.println("Income tax for general:");

		

		incometax("general", income);

		System.out.println("Income tax for women");

		incometax("women",income);

	}

	

	public static void incometax(String category,long income){

		switch(category)

		{

		

		case "general" :

		if(income>=0 && income<=180000)

		{

			System.out.println("no tax");

		

		}else if (income>180000 && income<=500000)

		{

			System.out.println("10%");

		}

		break;

		

		

		case "women":

			if(income>=0 && income<=180000)

			{

				System.out.println("no tax");

			

			}else if (income>190000 && income<=500000)

			{

				System.out.println("10%");

			}

			break;

			}

		

		

		if(income>500000 && income<=800000)

		{

			System.out.println("20%");

		}

		else if(income>80000)

		{

			System.out.println("30%");

			

		}

		

			}



}
