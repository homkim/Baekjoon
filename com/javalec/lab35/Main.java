package com.javalec.lab35;

/**
 * n까지의 합 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i > 0; i--)
			System.out.println(i);
	}
}