package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

//		입력
//		1-1) 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

//		출력
//		2-1) 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		int N; // 정수형 변수 N(N번째 줄) 선언
		boolean isValid; //boolean형 변수 isValid(N의 범위) 선언  
		
//		-------- 1-1) 반복문 시작 --------
		do {
			N = Integer.parseInt(br.readLine()); // br을 통해 받은 문자열을 정수형으로 형변환 후 N에 대입
			isValid = (N >= 1 && 100 >= N); // N의 조건 설정
			if (!isValid) {
				System.out.println("N은 1~100의 숫자 입니다");
			}
		} while (!isValid);
//		-------- 1-1) 반복문 종료 --------
		
		
		
//		-------- 2-1) 반복문 시작 --------
		for(int i = 0; N > i; i++) {
			for(int j = 0; i >= j; j++) { // *의 개수 만큼 출력
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
//		-------- 2-1) 반복문 종료 --------
		
	}

}
