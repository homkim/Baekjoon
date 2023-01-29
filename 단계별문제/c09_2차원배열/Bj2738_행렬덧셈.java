package 단계별문제.c09_2차원배열;

import java.util.Scanner;

//2738 행렬덧셈
public class Bj2738_행렬덧셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[N][M];

		for(int k = 0; k < 2; k++) {
			for(int i = 0; i < N; i++) {
				for (int j = 0; j <M; j++) {
					arr[i][j] += sc.nextInt();
					
					if (k==1) System.out.print(arr[i][j] + " ");
				}
				if (k==1)
					System.out.println("");
			}
		}
		
	}
	
}
