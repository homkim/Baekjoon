/* 배열의 최대, 최소값 */
package 단계별문제.c04_1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class P01_최대최소 {
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