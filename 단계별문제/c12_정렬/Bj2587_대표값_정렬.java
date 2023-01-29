package 단계별문제.c12_정렬;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 2587 대표값
// 5개의 숫자가 주어지면 평균, 중앙값 출력

class Bj2587_대표값_정렬 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 5;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		int sum = 0; int mid = 0;
		for(int i = 0; i < N; i++) {
			int x = list.get(i);
			sum += x;
			if(i == 2)
				mid = x;

		}
		
		StringBuffer sb = new StringBuffer();
		sb.append(sum / N).append("\n").append(mid);
		System.out.println(sb);
	}
}