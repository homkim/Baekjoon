package sources;
import java.util.Arrays;
import java.util.Scanner;
// 1637 날카로운 눈
class Bj1637_날카로운눈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N;i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		//이분법으로 최소 인접거리를 셋팅했을 때 C를 다 소진하는지 확인한다.
		
		int left = 0;
		int right = arr[N-1] - arr[0] + 1;
		while(left < right) {
			int mid = (left + right) / 2;
			if(getInstallCount(arr, mid) < C)
				right = mid;
			else
				left = mid + 1;
		}
		System.out.println(right-1);
	}
	static int getInstallCount(int[]arr, int dist) {
		int last = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] - last >= dist) {
				count++;
				last = arr[i];
			}
		}
		
		return count;
	}
}