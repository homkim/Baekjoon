package com.javalec.labc3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] iarr = new int[n][3];
		for (int i = 0; i < n; i++) {
			iarr[i][0] = sc.nextInt();
			iarr[i][1] = sc.nextInt();
			iarr[i][2] = i + 1;
		}
		
		Arrays.sort(iarr, (o1,o2) -> {
			if(o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			} else {
				return Integer.compare(o1[0],o2[0]);
			}
		});
		
		for (int i = 0; i < iarr.length; i++) {
			
			System.out.println(iarr[i][0] + " " + iarr[i][1] + " " + iarr[i][2]);
		}
	}
}
