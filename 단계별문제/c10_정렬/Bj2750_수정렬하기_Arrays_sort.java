package 단계별문제.c10_정렬;

// 2750 수 정렬하기
import java.util.Arrays;
import java.util.Scanner;

public class Bj2750_수정렬하기_Arrays_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i =0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int v : arr) System.out.println(v);
		
	}

}
/*   

5
5
2
3
4
1

(출력)
1
2
3
4
5

*/