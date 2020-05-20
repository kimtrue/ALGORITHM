package day2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 사분면 구역 구하기
		//if (-12, 5) 면 2분면
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > 0 && b > 0) {
			c = 1;
		} else if(a < 0 && b > 0) {
			c = 2;
		} else if(a < 0 && b < 0) {
			c = 3;
		} else {
			c = 4;
		}
		System.out.println(c);
		
	}

}
