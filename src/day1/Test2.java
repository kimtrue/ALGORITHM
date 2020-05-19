package day1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		System.out.println("A와 B는 0보다 크고 10보다 작아야한다.");
		System.out.print("A:");
		a = sc.nextInt();
		if(a < 0 && a > 10) {
			System.out.println("다시입력하세요");
			System.out.print("A:");
			a = sc.nextInt();
		} else {
			System.out.print("B:");
			b = sc.nextInt();
			System.out.println();
			if(b < 0 && b > 10) {
				System.out.println("다시입력하세요");
				System.out.print("B:");
				b = sc.nextInt();
			} 
			else {
				System.out.println("두 수의 합은 ?" + (a+b));
			}
				
		}
	}
}
			
			

