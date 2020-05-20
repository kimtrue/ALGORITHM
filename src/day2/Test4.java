package day2;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		// 구구단 출력
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		
		for(int i = 1 ; i <10 ; i++) {
			System.out.println(a + " * " + i +" = "+ a * i);
		}
		
	}

}
