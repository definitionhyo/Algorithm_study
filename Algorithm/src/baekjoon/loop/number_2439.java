package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

//		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

//		입력
//		1-1) 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

//		출력
//		2-1) 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		boolean isValid; // boolean타입 isValid 변수 선언(N 범위)
		int N; // 정수형 변수 N 선언
		
//		--------- 1-1) 반복문 시작 ---------
		do {
			N = Integer.parseInt(br.readLine()); // 정수형으로 형변환 후 int형 정수 N에 대입
			isValid = (N >= 1 && 100 >= N); // N범위 선언
		} while (!isValid);
//		--------- 1-1) 반복문 종료 ---------
		
//		--------- 2-1) 반복문 시작 ---------
		for(int i = 0; N > i; i++) {
			
//			for(int j = 0; N - i > j; j++) { // 공백 출력 - 틀린답 - 별이 들어가는자리 빼서 1부터 시작해야함
			for(int j = 1; N - i > j; j++) { // 공백 출력
				System.out.print(" ");
			}
			
			for(int k = 0; i >= k; k++) { // 별 출력
				System.out.print("*"); 
			}
			
			System.out.println(); // 줄바꿈
			
		}
//		--------- 2-1) 반복문 종료 ---------
		
	}

}
