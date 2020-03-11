package Strings;



import java.util.Vector;

import static java.lang.System.out;

public class Stringdemo {



	public static void main(String[] args) {

		int age;

		Vector v;

		String s="Hello";

		out.println("Object id :"+s.hashCode());

		

		String s1="Hello";

		out.println("Object id :"+s1.hashCode());

		out.print(s1);

		

		

		String name=" Sachin ";

		name.concat(" Tendulkar ");

		out.println(name);

		

		//String Buffer

		

		StringBuffer myname=new StringBuffer("Sachin");

		myname.append(" Tendulkar ");

		out.print(myname);

		

		//String Builder

		

		StringBuilder sb=new StringBuilder("Hindusthan");

		sb.append(" Coputers Limited ");

		out.println(" is working in "+sb);

		//creating vector class type object

		

		v=new Vector();

		

		v.addElement(s1);

		v.add(myname);

		out.println("Collection v:"+v);

		

		

	}



}


