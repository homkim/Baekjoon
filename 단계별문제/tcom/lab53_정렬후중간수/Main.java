/**
 * 정렬 후 중간 수
 */
package 단계별문제.tcom.lab53_정렬후중간수;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[3];
		for(int i = 0; i < 3 ; i++)
			num[i] = sc.nextInt();
		Arrays.sort(num);
		System.out.println(num[1]);
		
	}
}