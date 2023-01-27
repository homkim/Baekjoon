/**
 * 지그재그 별 찍기
 */
package 단계별문제.tcom.lab56_지그재그형별찍기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i = 0; i < 2*n; i ++){
			for( int j = 0; j < n; j++) {
				if ( ( i%2 == 0 && j%2==0) || (i%2==1 && j%2==1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}


	}
}