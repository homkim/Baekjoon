package 단계별문제.c12_정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bj2751_수정렬하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i < N; i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int v : arr)
			sb.append(v).append("\n");
		
		System.out.println(sb);
		
	}

}
