package Strings;



public class ImmutabilityTest {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Integer x=10;

		change(x);

		

		System.out.println(x);

		

	}

	static void change(Integer i)

	{

		i=20;

	}



}
