package sources;
import java.util.Scanner;

// 2512 예산
class Bj2512_예산_파라메트릭서치 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  // 1만 이하
		
		int max = 0;
		int[] arr = new int[N]; // 10만 이하
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); 
			max = Integer.max(max, arr[i]);
		}
		int M = sc.nextInt(); //10억
		
		int begin = 0;
		int end = max + 1; //ub사용
		while(begin < end) {
			int mid = (begin + end)/2;
			
			int sum = 0;
			for(int x : arr) {
				if(x <= mid) sum += x;
				else sum += mid;
			}
			
			if(sum <= M) 
				begin = mid + 1;
			else
				end = mid;
		}
		System.out.println(end - 1);
		
		
	}
}