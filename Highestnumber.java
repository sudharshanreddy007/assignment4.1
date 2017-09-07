package highestamonggiven3numbers;


	
	import java.util.Scanner;

	public class Highestnumber {
	public static void main(String args[]){
		int num1; //declaring   values to the integer 
		int num2;
		int num3;
		
		Scanner sc=new Scanner (System.in);//to scan values which we initialize
		System.out.println("enter any three numbers:");
		num1=sc.nextInt(); //scans next token of the input as int
		num2=sc.nextInt();
		num3=sc.nextInt();
		
	        if (num1>num2 && num1>num3)	//checking if num1 is greater than 2 & 3
			{		
			System.out.println("the highest number is :"+num1);// if 1 is highest after checking the condition it prints this
			}
	       
		else if (num2>num1 && num2>num3) //checking if num2 is greater than 1 & 3
		 {
			 System.out.println("the highest number is :" +num2);// if 2 is highest after checking the condition it prints this
		 }
		 else if (num3>num1 && num3>num2) //checking if num3 is greater than 1& 2
		 {
		System.out.println("the highest number is:" +num3);// if 3 is highest after checking the condition it prints this
		 }
		else
			System.out.println("the numbers are not distinct");// if the numbers are same it prints this
		}
	}

