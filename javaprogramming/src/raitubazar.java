


import java.util.Scanner;

public class raitubazar {

	public static void main(String[] args) {
	
		Scanner readvalues = new Scanner(System.in);
	
		System.out.println("potato price");
		double potatoprice = readvalues.nextDouble();
		
		System.out.println("noofkg potato purchase");
		double noofkgpotato = readvalues.nextDouble();
		
		System.out.println("tomato price");
		double tomatoprice = readvalues.nextDouble();
		
		System.out.println("noofkg tomato purchase");
		double noofkgtomato = readvalues.nextDouble();
		
		
		 double total = potatoprice*noofkgpotato + tomatoprice * noofkgtomato;
		 System.out.println("total = : "+total);
		 
		
		

	}

}
