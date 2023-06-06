package calc;

import java.util.Scanner;

public class Display {

	public Display() {
	}

	public void controller() {

		String num1,num2,op, opInfo;
		int result = 9;

		while(true) {
			display();
			display("Enter \"1\" to Start.");
			if(input().equals("1"))
			{
				break;
			}
		}

		num1 = new String();		
		while(true) {
			//display();
			display("Enter a number.");
			num1 = input();
			if(isNum(num1)) {
				break;
			}
		}
		display("First number: " + num1);

		num2 = new String();
		while(true) {
			//display();
			display("Enter another number.");
			num2 = input();
			if(isNum(num2)) {
				break;
			}
		}
		display("First number: " + num1 + "\nSecond number: " + num2);

		op = new String();
		opInfo = new String();
		while(true) {
			//display();
			display("Enter an operator:\n\n1.Add\n2.Subtract\n3.Multiply\n4.Divide");
			op = input();
			if(op.equals("1")) {
				opInfo  = " + ";
				break;
			}
			if(op.equals("2")) {
				opInfo = " - ";
				break;
			}
			if(op.equals("3")) {
				opInfo = " * ";
				break;
			}
			if(op.equals("4")) {
				opInfo = " / ";
				break;
			}
		}

		Operation cOperation = new Operation();


		switch(op) {
		case "1": result = cOperation.addition(Integer.parseInt(num1), Integer.parseInt(num2));	

		break;
		case "2": result = cOperation.subtraction(Integer.parseInt(num1), Integer.parseInt(num2));

		break;
		case "3": result = cOperation.multiplication(Integer.parseInt(num1), Integer.parseInt(num2));

		break;
		case "4": result = cOperation.division(Integer.parseInt(num1), Integer.parseInt(num2));

		break;
		}

		while(true) {			
			display(num1 + opInfo + num2 + " = " + result + "\nEnter \"1\" to restart.");			
			if(input().equals("1")) {
				controller();
			}
		}
	} 

	public boolean isNum(String value) {
		boolean checkNum;

		try {
			Integer.parseInt(value);
			checkNum = true;		
		}catch(Exception e){
			checkNum = false;			
		}
		return checkNum;
	}

	public String input(){
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public void display(String text) {
		System.out.println(text);
	}

	public void display() {
		System.out.print("\n\n\n*****************************\n\n\n       Calculator v1.00;           \n\n                    by Byulz\n\n******************************\n");
	}
}
