package day2;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		a = sc.nextInt();
		int[] cnt = new int[a];
		
		for(int i = 0 ; i < a ; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			cnt[i] = b+c;
		} 
		for(int i = 0; i < a; i++) {
			System.out.println(cnt[i]);
		}
	}
}
			
		

