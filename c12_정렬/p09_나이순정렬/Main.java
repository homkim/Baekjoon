package c12_정렬.p09_나이순정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		String[][] arr = new String[N][3];
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		
		Arrays.sort(arr, (o1,o2) -> {
			return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}
