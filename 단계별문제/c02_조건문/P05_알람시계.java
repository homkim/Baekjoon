package 단계별문제.c02_조건문;

/**
 * 알람 45분 전으로 맞추기
 */
import java.util.Scanner;

public class P05_알람시계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m >= 45)
			m -= 45;
		else {
			h -= 1;
			m = m + 60 - 45;

			if (h < 0)
				h = 23;
		}
		System.out.println(h + " " + m);

	}
}