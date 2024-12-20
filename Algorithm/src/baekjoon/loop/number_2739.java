package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		
//		입력
//		첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

//		출력
//		출력형식과 같게 N*1부터 N*9까지 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받기 위한 버퍼 리더 객체 생성
		int A = 0; // 정수형 변수 선언
		boolean isValid; // 조건에 맞지 않을 시 출력 위한 불린 변수 선언 
		
		// -------- 입력 반복문 시작 -------- 
		do {
			A = Integer.parseInt(br.readLine()); // 정수형 형변환 후 A에 저장
			isValid = (A >= 1 && A <= 9); // isValid 조건 설정
			
			if (!isValid) {
				System.out.println("1 ~ 9 의 숫자를 입력해주세요");
			}
			
		} while (!isValid);
		// -------- 입력 반복문 종료 --------
		
		// -------- 출력 반복문 시작 --------
		for (int i = 1; i < 10; i++) {
			System.out.println(A + " * " + i + " = " + A * i);
		}
		// -------- 출력 반복문 종료 --------
		
		
		
	}

}
