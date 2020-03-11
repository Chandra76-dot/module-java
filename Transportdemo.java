package inheritance;



public class Transportdemo {

	public static void main(String[] args){

	Bus b=new Bus();

	

	System.out.println("Bus object:"+b);

	b.start();

	System.out.println(" from "+b.fromStation);

	b.stop();

	System.out.print(" at "+b.toStation);

}



}
