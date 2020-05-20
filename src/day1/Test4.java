package day1;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		 * 두 수를 입력받아서 값의 크기를 비교해라
		 
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		String c;
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		if(a > b) {
			c = ">";
		} else if ( a < b) {
			c = "<";
		} else {
			c = "==";
		}
		System.out.println(c);
		
		*/
		// 시험 성적을 입력받아서 등급을 출력하자
		Scanner sc = new Scanner(System.in);
		int a;
		
		a = sc.nextInt();
		if(a >= 90 && a <= 100) {
			System.out.println("A");
		} else if (a >= 80 && a < 90) {
			System.out.println("B");
		} else if (a >= 70 && a < 80) {
			System.out.println("C");
		} else if (a >= 60 && a < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
			
		
		
		
	}

}
