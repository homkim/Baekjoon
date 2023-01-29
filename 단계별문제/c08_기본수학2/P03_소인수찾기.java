package 단계별문제.c08_기본수학2;

import java.util.Scanner;

public class P03_소인수찾기 {

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