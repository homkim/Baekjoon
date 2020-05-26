// 사각형이 되기위한 남은 한점 찾기
package com.javalec.laba7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] p = new int[3][2];
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			p[i][0] = Integer.parseInt(st.nextToken());
			p[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int x = 0, y = 0;
		if(p[0][0] == p[1][0] )  x = p[2][0];
		else if (p[0][0] == p[2][0]) x = p[1][0];
		else x = p[0][0];
		
		if(p[0][1] == p[1][1] )  y = p[2][1];
		else if (p[0][1] == p[2][1]) y = p[1][1];
		else y = p[0][1];
		
		System.out.println(x + " " + y);
	}
}
