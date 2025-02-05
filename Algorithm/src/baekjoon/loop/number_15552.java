package baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class number_15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		1) 입력
//		1-1) 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
//		다음 T줄에는 
//		1-2) 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

//		2) 출력
//		각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
//		StringTokenizer st; // StringTokenizer 객체 선언
//		int T; // 정수형 변수 선언(테스트케이스의 개수)
//		boolean tIsValid; // boolean타입 변수 선언(T조건)
//		boolean abIsValid; // boolean타입 변수 선언(A,B조건)
//		int A; // 정수형 변수 선언(A)
//		int B; // 정수형 변수 선언(B)
//		
//		// -------- 1-1) 반복문 시작 --------
//		do {
//			T = Integer.parseInt(br.readLine()); // 인스턴스 br을 사용하여 값을 입력받아 T에 저장
//			tIsValid = (T > 0 && 1000000 >= T);
//			if (!tIsValid) {
//				System.out.println("T의 범위는 1 ~ 1000000 입니다");
//			}
//		} while (!tIsValid);
//		// -------- 1-1) 반복문 종료 --------
//		
//		// -------- 1-2) 반복문 시작 --------
//		for(int i = 0; i < T; i ++) {
//			do {
//				st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성
//				A = Integer.parseInt(st.nextToken()); // 토큰화한 첫번째 문자열을 형변환 후 A에 저장
//				B = Integer.parseInt(st.nextToken()); // 토큰화한 첫번째 문자열을 형변환 후 B에 저장
//				abIsValid = (A >= 1 && 1000 >= A && B >= 1 && 1000 >= B);
//				if (!abIsValid) {
//					System.out.println("A, B의 범위는 1 ~ 1000 입니다");
//				}
//			} while (!abIsValid);
//		
//			System.out.println(A + B); // 2)출력
//		}
		// -------- 1-2) 반복문 종료 --------
		
		
//		---------------------------------------------------------------------------------------
		// 시간초과라 떠서 주석 후 다시 풀어봄
		// System.out.println이 아닌 BufferedWriter 사용해봄
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter 객체 생성
		
		StringTokenizer st; // StringTokenizer 객체 선언
		int T = Integer.parseInt(br.readLine()); // 테스트케이스 개수 저장
		
		// --------- 반복문 시작 --------
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n"); // 형변환 후 계산 후 줄바꿈 까지한 후 버퍼에 저장 
		}
		// --------- 반복문 종료 --------
		
		br.close();
		bw.flush(); // 버퍼에 있는 데이터 출력 후 비움
		bw.close();
	}

}
