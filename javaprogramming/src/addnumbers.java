import java.util.Scanner;


public class addnumbers {

	public static void main(String[] args) {
		
		Scanner readinput = new Scanner(System.in);
		
		System.out.println("enter first number");
		int number1 = readinput.nextInt();
		
		System.out.println("second number");
		int number2 = readinput.nextInt();
		
		System.out.println("third firstnumber");
		int number3 = readinput.nextInt();
		
		System.out.println("fourth number");
		int number4 = readinput.nextInt();
		
		int sum = number1 + number2 + number3 + number4; 
		
		System.out.println("sum : " + sum);
	}

}
