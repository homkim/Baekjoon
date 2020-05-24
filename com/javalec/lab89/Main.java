/* 크로아티아 알파벳  */
package com.javalec.lab89;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}
		int idx = 0, cnt = 0;
		while (idx < str.length()) {
			Boolean flag = false;
			for (int i = 3; i > 0; i--) {
				if (idx + i > str.length())
					continue;
				if (al.contains(str.substring(idx, idx + i))) {
					idx += i;
					cnt++;
					flag = true;
					break;
				}
			}
			if (flag == false) {
				idx++;
				cnt++;
			}

		}
		System.out.println(cnt);
	}
}