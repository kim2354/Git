package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2023.06.13
 * 이름 : 김건우
 * 내용: java 스위치문 이용
 */
public class Switch {
	 public static void main(String[] args) {
		System.out.println("숫자 입력");
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt(5);
		System.out.println(" 숫자입력: " + number);
		switch (number %2) {
		case 0:
			System.out.println("number2는 짝수");
			
			break;
		case 1:
			System.out.println("number5는 홀수");
			break;
		}
		
	}
		
}


