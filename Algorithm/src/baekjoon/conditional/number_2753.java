package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_2753 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 문제 : 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
		// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
		// 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 리더를 통해 연도를 문자열로 입력 받음
		int year; // 정수형의 연도 변수 선언
		
		// 반복문 시작
		// 연도를 한번 입력받고 조건이 아닌경우 반복
		do {
			year = Integer.parseInt(br.readLine()); // 정수형으로 변환 후 저장
			br.close(); // 리더기 종료
		} while (year < 1 || year > 4000);
		// --------------- 반복문 종료 ---------------
		
		// 조건문 시작
		// 조건 : 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
//		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			System.out.println("1");
//		} else {
//			System.out.println("0");
//		}
		// --------------- 조건문 종료 ---------------
		
		
		
		// 삼항연산자 될꺼 같음
		int a = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		System.out.println(a);
	}

}
