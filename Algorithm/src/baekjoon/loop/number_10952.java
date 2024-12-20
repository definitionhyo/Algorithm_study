package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_10952 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		nullpointer 오류 발생(맨마지막 null 발생)
//		외부 IDE의 경우 입력이 다 끝날 때 \n 이 입력이 됨
//		but 백준 = 파일을 통해 입력 = 테스트케이스를 전부 입력하면 
//		마지막에 EOF(End of file = 더 이상 읽을 수 있는 데이터가 X) 입력
//		br.readLine()은 EOF를 입력받으면 null 리턴하기 때문에 NullPointer발생
//		문자열을 생성해서 while의 조건에 입력
		
//		즉 br.readLine()으로 입력값을 계속 읽되, 읽은 값이 null이 되면 반복문을 종료하는 방식
		
//		문제
//		1-1) 두 정수 A와 B를 입력받은 다음,
//		A+B를 출력하는 프로그램을 작성하시오.

//		입력
//		입력은 여러 개의 테스트 케이스로 이루어져 있다.

//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

//		2-1) 입력의 마지막에는 0 두 개가 들어온다.

//		출력
//		각 테스트 케이스마다 A+B를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		int A; // 정수형 변수 A 선언
		int B; // 정수형 변수 B 선언
//		boolean isValid; // boolean형 변수 isValid 선언
		StringTokenizer st; // StringTokenizer 객체 선언
		
		String input = ""; //NullPointer 오류 해결을 위한 문자열 input 생성
		
//		-------- 2-1) 반복문 시작 --------
//		while (true) {
		while ((input = br.readLine()) != null) {
			
//		-------- 1-1) 반복문 시작 -------- do while문 시간초과로 인해 주석 처리
//			do {
//				st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성
				st = new StringTokenizer(input, " "); // StringTokenizer 객체 생성
				A = Integer.parseInt(st.nextToken()); // 정수형 형변환 후 A에 대입
				B = Integer.parseInt(st.nextToken()); // 정수형 형변환 후 B에 대입
//				isValid = (A > 0 && 10 > A && B > 0 && 10 > B); // isValid 조건
//			} while (!isValid);
//		-------- 1-1) 반복문 종료 --------
			
			if (A == 0 && B == 0) { // A, B == 0 일 경우 반복문 종료
				break;
			}
			
			System.out.println(A + B);
		}
//		-------- 2-1) 반복문 종료 --------
		
	}

}
