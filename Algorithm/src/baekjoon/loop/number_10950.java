package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		1) 문제
//		1-1) 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//		2) 입력
//		2-1) 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		2-2) 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//		3) 출력
//		3-1) 각 테스트 케이스마다 A+B를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더 객체 생성
		StringTokenizer st; // StringTokenizer 객체 선언
		boolean isValidT = false; 
		boolean isValid = false; 
		int T = 0; // 테스트 케이스 개수 저장을 위한 정수형 변수 선언
		
		// -------- 2-1)반복문 시작 --------
		do {
			T = Integer.parseInt(br.readLine()); // 형변환 후 테스트 케이스 개수 A 에 저장
			isValidT = (T > 0); // 테스트 케이스가 0개이상인 경우
			if(!isValidT) {
				System.out.println("테스크케이스는 1개이상이어야합니다");
			}
		} while (!isValidT);
		// -------- 2-1)반복문 종료 --------
//		System.out.println(T); // 테스트 케이스 출력
		
		// -------- 2-2), 3)반복문 시작 --------
		for(int i = 0; i < T; i++) {  
			st = new StringTokenizer(br.readLine(), " "); // st 객체 생성(토큰화 함)
			int A = Integer.parseInt(st.nextToken()); // 첫번째 토큰을 형변환 후 A에 저장
			int B = Integer.parseInt(st.nextToken()); // 두번째 토큰을 형변환 후 B에 저장
			isValid = (A > 0 && B < 10); // A, B 조건
			
			if(!isValid) {
				System.out.println("A > 0 , B < 10 입니다");
			}
			
			System.out.println(A + B); // 3)각 A + B값 출력
			
		}
		// -------- 2-2), 3)반복문 종료 --------
		
		
		
		
	}

}
