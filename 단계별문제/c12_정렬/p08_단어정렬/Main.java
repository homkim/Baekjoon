package 단계별문제.c12_정렬.p08_단어정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length())
					return s1.compareTo(s2);
				else
					return s1.length() - s2.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			if( i > 0 && arr[i].equals(arr[i-1]) )
				continue;
			sb.append(arr[i]).append("\n");
		}
		System.out.println(sb);
	}

}
