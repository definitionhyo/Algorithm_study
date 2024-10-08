package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
//		입력
//		1-1) 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		1-2) 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
//		출력
//		각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		StringTokenizer st; // StringTokenizer 객체 선언
		int T; // 정수형 변수 T 선언(테스트 케이스 개수)
		boolean isValidT; // boolean형 변수 isValidT 선언(T > 0)
		
//		-------- 1-1)반복문 시작 --------
		do {
			T = Integer.parseInt(br.readLine()); // 정수형으로 형변환 후 T에 대입
			isValidT = (T > 0);
			if (!isValidT) {
				System.out.println("T 는 1 이상이어야 합니다");
			}
		} while (!isValidT);
//		-------- 1-1)반복문 종료 --------
		
//		--------- 1-2)반복문 시작 ----------
		for(int i = 1; T >= i; i++) {
			st = new StringTokenizer(br.readLine(), " "); // st 객체 생성
			int A = Integer.parseInt(st.nextToken()); // 첫번째 토큰을 정수형으로 형변환 후 A 에 대입
			int B = Integer.parseInt(st.nextToken()); // 두번째 토큰을 정수형으로 형변환 후 B 에 대입
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
		}
//		--------- 1-2)반복문 종료 ----------
		
		
	}

}
