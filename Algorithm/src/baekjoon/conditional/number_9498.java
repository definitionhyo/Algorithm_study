package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_9498 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 문제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더를 통해 점수를 입력받음
		int score; // 정수형 score(점수) 변수 선언
		
		// 점수를 한번 입력받고 시작해야하니 do while문 사용
		do {
			score = Integer.parseInt(br.readLine()); // 입력받은 점수를 정수형으로 바꾸어 변수에 저장
			br.close(); // 버퍼리더 닫음
		} while (score < 0 || score > 100); // 정의된 점수가 아니면 계속 반복해서 입력받음

		// 점수에 따른 등급 출력
		
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score <= 89) {
			System.out.println("B");
		} else if (score >= 70 && score <= 79) {
			System.out.println("C");
		} else if (score >= 60 && score <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		

	}

}
