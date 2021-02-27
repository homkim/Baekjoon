/* 시간여행 */
package com.lab98;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int move = 0;
			int xMoveCnt = 0;
			int yMoveCnt = 0;
			
			while(true) {
				move++;
				
				x += move;
				xMoveCnt++;
				
				if(x >= y) break; //도착여부
				
				y -=  move;
				yMoveCnt++;
				if(x >= y) break; //도착여부
			}
			System.out.println(xMoveCnt + yMoveCnt);
		}

	}
}