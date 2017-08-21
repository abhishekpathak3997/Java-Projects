/*
Name:-Abhishek C Pathak
Date:-20/08/2017
Email:-abhisheksurya96@gmail.com
Objective:-Calculator with 20 functionality
*/
import java.util.Scanner;
import java.lang.Math;

public class MyCalculator{
	private int a,b,ans;
	private double d,e,ans1;
	public void add(){//Addition method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to add:-");
	a=sc.nextInt();
	b=sc.nextInt();
	ans=a+b;
	System.out.println("Addition of " +a+ " and " +b+ " is:"+ans);
	}//End of Addition method
	
	public void sub(){//Substraction method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to sub:-");
	a=sc.nextInt();
	b=sc.nextInt();
	ans=a-b;
	System.out.println("Substraction of " +a+ " and " +b+ " is:"+ans);
	}//End of Substraction method

	public void multiply(){//Multiplication method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to multiply:-");
	a=sc.nextInt();
	b=sc.nextInt();
	ans=a*b;
	System.out.println("Multiplication of " +a+ " and " +b+ " is:"+ans);
	}//End of Multiplication method

	public void division(){//Division method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to divide:-");
	a=sc.nextInt();
	b=sc.nextInt();
	ans=a/b;
	System.out.println("Division of " +a+ " and " +b+ " is:"+ans);
	}//End of Division method

	public void modulo(){//Modulo method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to find modulo:-");
	a=sc.nextInt();
	b=sc.nextInt();
	ans=a%b;
	System.out.println("Modulo of " +a+ " and " +b+ " is:"+ans);
	}//End of Modulo method

	public void sqr(){//Square  method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find square root:-");
	a=sc.nextInt();
	//b=sc.nextInt();
	ans=a*a;
	System.out.println("Square of " +a+  " is:"+ans);
	}//End of square method	

	public void pie(){//Pie  method
	double pie=3.14;
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find pie:-");
	c=sc.nextInt();
	//b=sc.nextInt();
	d=pie*c;
	System.out.println("Pie of " +c+  " is:"+d);
	}//End of pie method

	public void min(){//Minimum method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to find minimum from them:-");
	a=sc.nextInt();
	b=sc.nextInt();
	ans=Math.min(a,b);
	System.out.println("Minimum of " +a+ " and " +b+ " is:"+ans);
	}//End of minimum method

	public void max(){//Maximum method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to find Maximum from them:-");
	a=sc.nextInt();
	b=sc.nextInt();
	ans=Math.max(a,b);
	System.out.println("Maximum of " +a+ " and " +b+ " is:"+ans);
	}//End of maximum method

	public void abs(){//Absolute method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find Absolute value:-");
	a=sc.nextInt();
	ans=Math.abs(a);
	System.out.println("Absolute of " +a+ " is:"+ans);
	}//End of Absolute method	

	public void cbrt(){//Cube root method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find Cuberoot value:-");
	d=sc.nextDouble();
	ans1=Math.cbrt(d);
	System.out.println("Cuberoot of " +d+ " is:"+ans1);
	}//End of Cuberoot method
	
	public void ceil(){//Ceil  method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find Ceil value:-");
	d=sc.nextDouble();
	ans1=Math.ceil(d);
	System.out.println("Ceil of " +d+ " is:"+ans1);
	}//End of Ceil method

	public void pow(){//Power method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to find power from them:-");
	d=sc.nextInt();//Base
	e=sc.nextInt();//Exponent
	ans1=Math.pow(d,e);
	System.out.println("Power of  base " +d+ " and exponent" +e+ " is:"+ans1);
	}//End of power method
	
	public void round(){//Round method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find Round value:-");
	d=sc.nextDouble();
	ans1=Math.round(d);
	System.out.println("Round of " +d+ " is:"+ans1);
	}//End of round method

	public void log(){//Log method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find log value:-");
	d=sc.nextDouble();
	ans1=Math.log(d);
	System.out.println("Log of " +d+ " is:"+ans1);
	}//End of round method

	public void floor(){//floor  method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find Floor value:-");
	d=sc.nextDouble();
	ans1=Math.floor(d);
	System.out.println("Floor of " +d+ " is:"+ans1);
	}//End of floor method

	public void tan(){//tan  method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value to find tan value:-");
	d=sc.nextDouble();
	e=Math.toRadians(d);//Converting input value into radians using toRadians mathod
	ans1=Math.tan(e);
	System.out.println("Tan of " +d+ " is:"+ans1);
	}//End of tan method
	
	public void toDegree(){//toDegree  method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an angle to convert into degree value:-");
	d=sc.nextDouble();
	e=Math.toDegrees(d);//Converting input value into degrees using toDegrees mathod
	ans1=Math.tanh(e);
	System.out.println("Degree value of angle " +d+ " is:"+ans1);
	}//End of toDegree method

	public void toRadian(){//toRadian  method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an angle to convert into radian value:-");
	d=sc.nextDouble();
	e=Math.toRadians(d);//Converting input value into radian using toRadian mathod
	ans1=Math.tanh(e);
	System.out.println("Radian value of angle " +d+ " is:"+ans1);
	}//End of toRadian method

	public void log10(){//log10 method
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find base10 logarithm value:-");
	d=sc.nextDouble();
	ans1=Math.log10(d);
	System.out.println("base10 logarithm value " +d+ " is:"+ans1);
	}//End of log10 method

	
		
		
	public static void main(String[] args){
	int choice;
	MyCalculator objMyCalc = new MyCalculator();
	while(true){
	System.out.println("Please enter your choice:");
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Modulo");
	System.out.println("6.Square");
	System.out.println("7.Pie");
	System.out.println("8.Minimum");
	System.out.println("9.Maximum");
	System.out.println("10.Absolute");
	System.out.println("11.Cuberoot");
	System.out.println("12.Ceil");
	System.out.println("13.Power");
	System.out.println("14.Round");
	System.out.println("15.Log");
	System.out.println("16.Floor");
	System.out.println("17.Tan");
	System.out.println("18.toDegree");
	System.out.println("19.toRadian");
	System.out.println("20.base10 log");
	System.out.println("0.Exit");
	Scanner sc = new Scanner(System.in);
	choice = sc.nextInt();
	switch(choice){//selecting choice 
	case 1:objMyCalc.add();//addition method call
		break;
	case 2:objMyCalc.sub();//Substraction method call
		break;
	case 3:objMyCalc.multiply();//Multiply method call
		break;
	case 4:objMyCalc.division();//Division method call
		break;
	case 5:objMyCalc.modulo();//Modulo method call
		break;
	case 6:objMyCalc.sqr();//Square method call
		break;
	case 7:objMyCalc.pie();//Square method call
		break;
	case 8:objMyCalc.min();//Minimum method call
		break;
	case 9:objMyCalc.max();//Maximum method call
		break;
	case 10:objMyCalc.abs();//Absolute methid call
		break;
	case 11:objMyCalc.cbrt();//Cuberoot method call
		break;
	case 12:objMyCalc.ceil();//Ceil methood call
		break;
	case 13:objMyCalc.pow();//Power method call
		break;
	case 14:objMyCalc.round();//Round method call
		break;
	case 15:objMyCalc.log();//log method call
		break;
	case 16:objMyCalc.floor();//log method call
		break;
	case 17:objMyCalc.tan();//tan method call
		break;
	case 18:objMyCalc.toDegree();//toDegree method call
		break;
	case 19:objMyCalc.toRadian();//toRadian method call
		break;
	case 20:objMyCalc.log10();//log10 method call
		break;


	case 0:
		System.out.println("Thanks for using my calculator");
		//System.out.print("Do u wish to continue:Y/N");
		System.exit(0);//Exit method call
		//break;
		

		      }//end of choice
		   }//end of while
	
	}//End of main class




}//End of MyCalculator class