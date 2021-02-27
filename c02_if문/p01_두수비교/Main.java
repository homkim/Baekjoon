package c02_if문.p01_두수비교;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) System.out.println(">");
		if (a < b) System.out.println("<");
		if (a == b) System.out.println("==");


	}
}