package com.manipal.Mar24;

import java.util.*;

public class HashMapProgram {
	
	Map mylist = new HashMap();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		HashMapProgram obj = new HashMapProgram(); 
		
		System.out.println("Available options are");
		System.out.println(" 1 add\n 2 remove\n 3 get\n 4 size\n 5 traverse\n 6 update\n 7 clear\n 8 Exit");
		
		boolean choice1 = true;
		int choice=0;
		while(choice1!=false)
		{
			
			System.out.print("\nEnter your choice : ");
			try {
			 choice = obj.sc.nextInt();
			}catch (InputMismatchException ae) {
				 System.out.println("\n"+ae);
				 System.out.println("Enter integer as input!");
				 
			 }
		switch(choice)
		{
		case 1 : obj.addmethod();
				 break;
			
		case 2 : obj.removemethod();
				 break;
			
		case 3 : obj.getmenthod();
				 break;
			
		case 4 : obj.sizemethod();
		 		 break;
		
		case 5 : obj.traversemethod();
				 break;
			
		case 6 : obj.updatemethod();
				 break;
			
		case 7 : obj.clearmethod();
				 break;
			
		case 8 :  System.out.println("Program Terminated!");
		          choice1=false;
		          break;
			
		default : System.out.println("Entered choice is invalid!");
				  choice1=false;
				  break;
		}
		}
	}
		 void addmethod()
		{
			 System.out.print("\nEnter number of records to be created : ");
			 int choice=0;
			 try {
			 choice=sc.nextInt();
			 sc.nextLine();			 
			 System.out.println("\n");
			 
			 for(int i=0; i<choice; i++)
			 {
			System.out.print("Enter Key & Valuve in the record "+(i+1)+" : ");
			int msg1 = sc.nextInt();
			String msg2 = sc.nextLine();
			mylist.put(msg1, msg2);
			 }
			}catch (InputMismatchException ae) {
				 System.out.println("\n"+ae);
				 System.out.println("Enter integer as input!");
			 }			 
		}
		 
		 void removemethod()
		 {
			 
			 try {
				 System.out.print("\nEnter index number to delete the element : ");
				 int choice=sc.nextInt();
				 mylist.remove(choice);
				 System.out.println("element at index "+choice+" is removed.");
				 
			 }catch (IndexOutOfBoundsException | InputMismatchException ae) {
				 System.out.println("\n"+ae);
				 System.out.println("Entered is invalid!");
			 }
		 }
		 
		 void getmenthod()
		 {
			 int choice=0;
			 System.out.print("\nEnter index number to get an element : ");
			 try {
				 choice=sc.nextInt();
				 System.out.println("Element at index "+choice+" is : "+mylist.get(choice));
				 
			 }
			 catch (IndexOutOfBoundsException | InputMismatchException ae) {
				 System.out.println("\n"+ae);
				 System.out.println("Entered index is invalid!");
			 }	 
			 
		 }
		 
		 void sizemethod()
		 {
			 System.out.println("\nCurrent size of the HashMap is : "+mylist.size());
		 }
		
		 void traversemethod()
		 {
			 System.out.println("\nDisplaying keys of HashMap : "+mylist.keySet());
			 			 
			 System.out.println("\nDisplaying values of HashMap : "+mylist.values());
			 
			 System.out.println("\nDisplaying Key & Value pairs : "+mylist.entrySet());		
		 }
		 
		 void updatemethod()
		 {
			 int choice=0;
			 String msg;
			 try {
				 System.out.print("\nEnter the Index : ");
				 choice=sc.nextInt();
				 sc.nextLine();
				 System.out.print("Enter the updated element : ");
				 msg=sc.nextLine();
				 System.out.print("\nThe element "+mylist.get(choice)+" at index "+choice+" is replaced by ");
				 mylist.replace(choice, msg);
				 System.out.print(mylist.get(choice)+"\n");
			 }catch (IndexOutOfBoundsException | InputMismatchException ae) {
				 System.out.println("\n"+ae);
				 System.out.println("Entered index is invalid!");
			 }
		 }
		 
		 void clearmethod()
		 {
			 mylist.clear();
			 System.out.println("\nHashMap is Cleared!");
		 }	
}
