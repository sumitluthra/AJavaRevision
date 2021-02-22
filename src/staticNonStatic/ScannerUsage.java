package staticNonStatic;

import java.util.Scanner;

public class ScannerUsage {
	
	public static void main(String[] args) {
		//Print sum of 2 numbers after taking inputs from console
		
		Scanner s = new Scanner(System.in);
		System.out.println("Print sum of 2 numbers after taking inputs from console");
		int A = s.nextInt();
		int b = s.nextInt();
		System.out.println(A+b);
	}
}
