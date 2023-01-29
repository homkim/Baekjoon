package 단계별문제.c09_2차원배열;
import java.util.Scanner;

//2566 최대값

class Bj2566_최대값 {
	public static void main(String[] args) {
		int N = 9, M = 9;
		
		Scanner sc = new Scanner(System.in);
		int max=-1, x=0,y=0,z;
		for(int i=1; i<=N;i++) {
			for(int j=1; j<=M;j++) {
				z = sc.nextInt();
				if(max < z) {
					max = z;
					x = i;
					y = j;
				}
				
			}
		}
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}