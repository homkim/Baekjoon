/* 배열의 최대, 최소값 */
package c05_1차원배열.p01_최소최대;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);	
		System.out.println(num[0] + " " + num[n-1]);
	}
}