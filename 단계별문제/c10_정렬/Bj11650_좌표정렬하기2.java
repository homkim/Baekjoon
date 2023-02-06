package 단계별문제.c10_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Bj11650_좌표정렬하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, (o1, o2) ->{
			if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
			else return Integer.compare(o1[0], o2[0]);
		});
		
//		for(int i = 0; i < N; i++) {
//			System.out.printf("%d %d\n",arr[i][0], arr[i][1]);
//		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}
