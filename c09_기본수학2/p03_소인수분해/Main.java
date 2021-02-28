package c09_기본수학2.p03_소인수분해;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer N = scanner.nextInt();
		
		int i;
		for ( i = 2; i <= Math.sqrt(N); i++) {
			while (N%i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if (N != 1) System.out.println(N);
	}

}