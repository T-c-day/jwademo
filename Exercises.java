package D8Exercise;

import java.util.Scanner;

public class Exercises
{

	public static void exercise1()
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder gender = new StringBuilder("");
		
		long income = 0L;
		boolean condMet = false;
		
		
		System.out.println("Hello! Welcome to my tax calculator");
		
		do 
		{
			System.out.println("Please enter your gender: ");
			String temp = sc.next().toLowerCase();
			
			if(temp.contains("male") || temp.contains("female")) 
			{
				gender.append(temp);
				condMet = true;
			}
			else
				System.out.println("invalid input please try again");
		}while(!condMet);
		
		System.out.println("Please enter your income: ");
		
		condMet = false;;
		do
		{
			if(sc.hasNextLong())
			{
				income = sc.nextLong();
				condMet = true;
			}
			else
			{
				System.out.println("invalid input please try again");
				sc.next();
			}
		}while(!condMet);
		
		float tax = 0.0f;
		
		if(gender.toString().equals("female"))
		{
			if((income <= 190000))
				tax = 0.0f;
			else if(income <= 500000)
				tax = 0.10f;
			else if(income <= 800000)
				tax = 0.20f;
			else
				tax = 0.30f;
		}
		else //if(gender.toString().contains("male")) // We'll always have male or female to leave the loop
		{
			if((income <= 180000))
				tax = 0.0f;
			else if(income <= 500000)
				tax = 0.10f;
			else if(income <= 800000)
				tax = 0.20f;
			else
				tax = 0.30f;
		}
			
		System.out.println("Your tax is: " + (income * tax));
		
		sc.close();
	}
	
	public static void exercise2()
	{
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		int numOfEggs = 0;
		
		System.out.println("Please enter any number of eggs");
		
		do
		{
			if(sc.hasNextInt())
			{
				numOfEggs = sc.nextInt();
				exit = true;
			}
			else
				System.out.println("Invalid input, please put a number");

		}while(!exit);
		
		int gross = numOfEggs / 144;
		int dozen = (numOfEggs - (gross * 144))/12;
		float remainder = numOfEggs % 12;//(numOfEggs - (gross * 144)) % 12;
		
		System.out.println("You have: " + gross + " gross " + dozen + " dozen " + "and " + remainder);
		
		sc.close();
	}
	
	
	public static void main(String[] args) 
	{
		//Exercises.exercise1();
		Exercises.exercise2();
	}

}
