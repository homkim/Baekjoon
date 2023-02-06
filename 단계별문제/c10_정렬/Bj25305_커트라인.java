package 단계별문제.c10_정렬;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//25305 커트라인
class Bj25305_커트라인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++)
			list.add(sc.nextInt());
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list.get(k-1));
	}
}