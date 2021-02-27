/**
 * 평균점수
 */
package tcom.lab51_평균점수;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 5;
		int sum = 0;
		for(int i = 0; i < n ; i++){
			int score = sc.nextInt();
			if(score < 40) score = 40;
			sum += score;
		}
		System.out.println(sum / n);

	}
}