package day1;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		String msg = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 문구를 입력하세요.");

		msg = sc.next();

		String key = msg;

		// 여기에 왜 안걸릴까...

		if (key == "cat") {
			System.out.println("\\    /\\ \n" + " )  ( ') \n" + " (  /  ) \n" + "  \\(__)|");
		} else {
			System.out.println("고양이가 아니다" + key);
		}
			

	}

}
