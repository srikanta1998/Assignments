package com.manipal.Mar24;
import java.util.*;

enum Varient{
	petrol, disel, electric, hydrogen, hybrid
}

public class EnumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Select a varient to display it features : ");
		System.out.println("Available Cars are : ");
		System.out.println("Petrol, Disel, Electric, Hydrogen, Hybrid");
		//Scanner sc = new Scanner(System.in);
		//String choice = sc.nextLine();
		//choice.toLowerCase();
		//Cars obj = new Cars(Varient.choice);
		Cars obj = new Cars(Varient.petrol);
		obj.model();
	}
	
}
class Cars
{
	Varient Car_model;
	Cars(Varient Car_model)
	{
		this.Car_model = Car_model;
	}
	void model()
	{

		switch(Car_model)
		{
		case petrol :
			System.out.println("This is Petrol Car");
			break;
		case disel :
			System.out.println("This is Disel Car");
			break;
		case electric :
			System.out.println("This is Electric Car");
			break;
		case hydrogen :
			System.out.println("This is Hydrogen Car");
			break;
		case hybrid :
			System.out.println("This is Hybrid Car");
			break;
		}
	}
	
}

