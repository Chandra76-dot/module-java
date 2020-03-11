package Arrays;



public class Arraydemo {

	public static void main(String[] args){

		//define single dimensional array

		int subjects[];

		

		String studentName[]=new String[2];

		

		//define single dimensional array

		String computer_languages[]={"C","C++","Java"};

		String trainerNames[]={"Sivaram","Roopa","kalyan"};

		System.out.println("Trainers:");

		for(String trainerName  : trainerNames)

		{

			System.out.println(trainerName);

			

		}

		//declare two dimensional array

		int student_marks[][];

		

		

		//define two dimensional array

		int StudentMarks[][]=new int[2][3];

		

		//declare two dimensional array

		int marks [][][];

		

		//define three dimensional array

		int inter_marks[][][]={{{52,50,75},{44,52,29},{34,72,42}},{{25,52,44},{21,43,72},{99,77,88}}};				

		}

		

	}
