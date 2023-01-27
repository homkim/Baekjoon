package 단계별문제.c11_브루트포스.p03_덩치;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		int[] rnk = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++) {
				if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1]) {
					rnk[j]++;
				}
			}
		}
		
		for(int i=0; i<n;i++) {		
			System.out.print( (rnk[i] + 1) + " ");
		}
		
	}
}
