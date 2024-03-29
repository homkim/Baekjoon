package 단계별문제.c08_기본수학2;

import java.util.Scanner;

public class P02_소수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int primeSum = 0;
		int primeMin = 10001;
		for (int i = m; i < n + 1; i++) {
			if (isPrime(i)) {
				primeSum += i;
				if (primeMin == 10001)
					primeMin = i;
			}
		}
		if (primeSum == 0)
			System.out.println("-1");
		else {
			System.out.println(primeSum);
			System.out.println(primeMin);
		}
		

	}

	private static boolean isPrime(int n) {
		if (n == 1)
			return false;
		
		for (int j = 2; j < n; j++) {
			if (n % j == 0)
				return false;
		}

		return true;
	}
}