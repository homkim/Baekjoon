/* 배열에서 나온 숫자의 갯수 */
package 단계별문제.c04_1차원배열;

import java.util.Scanner;

public class P03_숫자의갯수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1; 
		for(int i = 0; i < 3; i++)
			num *= sc.nextInt();
				
		String str = Integer.toString(num);
		int[] arr = new int[10];
		
		for(int i = 0; i < str.length(); i++) {
			arr[Integer.parseInt(str.substring(i, i+1))]++;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
	}
}