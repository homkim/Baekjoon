/* 배열에서 x번째 분수 찾기  */
package 단계별문제.c07_기본수학1;

import java.util.Scanner;

public class P03_분수찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 1;
		int i = 1, j = 1;
		String d = "down";  //initial direction
		while (n > 1 && cnt < n) {
			if (i == 1 && d.equals("down")) {  //to move right
				j++;
				d = "right"; // moved right
			} else if (j == 1 && d.equals("right")) {  // to move down
				i++;
				d = "down";
			} else if (d.equals("right")) { // current mode: to down-left
				i++;
				j--;
			} else {   // current mode: to upper-right
				i--;
				j++;
			}
				
			cnt++;
		}
		System.out.println(i + "/" + j);
		}

}