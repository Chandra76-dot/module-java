package inheritance;



import  inheritance.PhysicalConstants;



public class UseConstants implements PhysicalConstants{

	

	public static void main(String args[])

	{

		float M=5;

		double E=M*SPEEDOFLIGHTINVACCUM;

		

		float m1=2.5f,m2=3.5f;

		float r=2.0f;

		

		double F=GRAVITATIONALCONSTANT*(m1*m2)/r*r;

		

		float t=5.25f;

		float d=(0.5f)*STANDARDGRAVITATIONALACCELERATION*t;

		

		

		

		System.out.println("E="+E);

		System.out.println("F="+F);

		System.out.println("d="+d);

		

				

	}



}
