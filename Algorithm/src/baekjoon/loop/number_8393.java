package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//
//		입력
//		1) 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//
//		출력
//		2) 1부터 n까지 합을 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더 객체 생성
		int n = 0; // 정수형 변수 선언
		Boolean isValid; // 불린형 변수 선언
		int total = 0; // 정수형 변수 선언(총 합)
		
		// -------- 1) 반복문 시작 --------
		do {
			n = Integer.parseInt(br.readLine()); // 입력받은 문자형을 정수형으로 형변환 후 A 에저장
			isValid = (n >= 1 && n <= 10000); // n의 조건 설정
			if (!isValid) {
				System.out.println("1~10000의 숫자를 입력해주세요");
			}
			
		} while (!isValid);
		// -------- 1) 반복문 종료 --------
		
		// -------- 2) 반복문 시작 --------
		for(int i = 1; i <= n; i++) {
			total += i; // n = n + (n-1)
		}
		// -------- 2) 반복문 종료 --------
		
		System.out.println(total);
		
		
		
	}

}
