package day2;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		// 알람 45분 일찍 맞추기
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a == 0 && b < 45) {
			a = 23;
			b = (b - 45) + 60;
		} else if(a > 0 && b < 45) {
			a = a -1;
			b = (b - 45) + 60;
		} else {
			b = b - 45;
		}
		System.out.println(a + " " + b);
	}

}
