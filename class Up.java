package Introtri;



public class Up {

	public static void main(String[] args) 

	{

		int i,j,k;

		for(i=1; i<=3; i++)

		{

			for(j=3; j>=i; j--)

			{

				System.out.print(" ");

		}

			for(k=1; k<=(2*i-1); k++)

			{

				System.out.print("*");

			}

				System.out.println(" ");

		}

     	for(i=1; i<=2; i++)

     	{

     		for(int counter=0;counter<2;counter++)

 				System.out.print("  ");

     		for(j=1; j<=3; j++)

     		{

     				

     			System.out.print("*");

     		}

     			System.out.println(" ");

     	}

	}

}
