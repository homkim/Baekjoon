/**
 * 상근날드
 */
package com.javalec.lab52;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hambug = 2001;
		int drink = 2001;
		int sum = 0;
		for(int i = 0; i < 3 ; i++){
			int price = sc.nextInt();
			if(price < hambug) hambug = price;
		}
		for(int i = 0; i < 2 ; i++){
			int price = sc.nextInt();
			if(price < drink) drink = price;
		}		
		System.out.println(hambug + drink - 50);

	}
}