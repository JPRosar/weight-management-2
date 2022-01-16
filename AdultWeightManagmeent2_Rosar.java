//John Rosar
//COSC1437
//Lab3 part 1


import java.util.Scanner;

public class AdultWeightManagmeent2_Rosar {
	public static void main(String[] args)
	{
		//declaring variables
		String name;
		int height;
		float exBMI;
		
		Scanner sc = new Scanner(System.in); //sc is scanner object
		System.out.println("Enter your name:");
		name = sc.nextLine(); 
		System.out.println("Enter your Height in Inches:");
		height = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your BMI:");
		exBMI = sc.nextFloat(); 
		sc.nextLine();
		
		 //creating object for Adult_Rosar
		Adult_Rosar object = new Adult_Rosar(name,height,exBMI);
		System.out.println(object);
		  System.out.println("-------------------------------------------");
		System.out.format("Weight:\t\t\t\t%.1f",object.calWeight()); 

		  }
		}