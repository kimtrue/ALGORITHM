package day2;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//윤년 구하기
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		
		if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
				System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
