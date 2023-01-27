/* 시간여행 */
package 단계별문제.c08_기본수학1;

import java.util.Scanner;

public class P09_시간여행 {
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