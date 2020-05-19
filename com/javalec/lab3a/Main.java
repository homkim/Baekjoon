package com.javalec.lab3a;

/**
 * n까지의 합 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for(int j:arr)
			if (j < num)
				System.out.print(j + " ");
	}
}