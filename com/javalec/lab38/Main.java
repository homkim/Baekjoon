package com.javalec.lab38;

/**
 * 더하기 
 */
import java.util.Scanner;

public class Main {
	static int T = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {

			int i = sc.nextInt();
			int j = sc.nextInt();

			System.out.printf("Case #%d: %d + %d = %d\n",(test_case+1), i, j, (i + j));
		}
	}
}