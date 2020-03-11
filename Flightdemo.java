package Introtri;



public class Flight extends Bird {

	public String flightName;

	public String airlines;

	Flight()

	{

		legs=0;

		wings=2;

		flightName="504";

		airlines="Air India";

	

	}



	public void fly()

	{

		System.out.println(airlines+" "+flightName+"taking off...");

	}

}

