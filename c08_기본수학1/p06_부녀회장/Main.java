/* 부녀회 */
package c08_기본수학1.p06_부녀회장;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			int result = 0;
			int[][] arr = new int[k+1][n];
			for (int j = 0; j < n; j++) {
				arr[0][j] = j + 1;
			}
			for (int j = 1; j <= k; j++) {  //층
				for (int l = 0; l < n; l++) { // 호수
					for (int l2 = 0; l2 <= l; l2++) {
						arr[j][l] += arr[j-1][l2];
					}
				}
			}
			
			System.out.println(arr[k][n-1]);

		}

	}
}