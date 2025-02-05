package baekjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_10871 {

	public static void main(String[] args) throws IOException {

//		*오류 NoSuchElementException
//		:  StringTokenizer에서 더 이상 토큰이 없는데 토큰을 요청할 때 발생
//		StringTokenizer는 한 줄 씩 처리할 때 마다 새로 객체 생성해야됨
		
//		StringBuilder 사용해야함
//		그냥 String 으로 연산을 계속하면 메모리 할당이 계속 반복되어 성능이 좋지않음
		
		
		
		
		
		
//		문제
//		정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
//		이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//
//		1) 입력
//		1-1) 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//		둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
//		주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//
//		2) 출력
//		X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. 
//		X보다 작은 수는 적어도 하나 존재한다.

		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
//		int N; // 정수형 변수 N 생성
//		int X; // 정수형 변수 X 생성
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");; // StringTokenizer 객체 선언
//		
////		1-1)
//		N = Integer.parseInt(st.nextToken()); // 첫번째 토큰을 정수형 형변환 후 대입
//		X = Integer.parseInt(st.nextToken()); // 두번째 토큰을 정수형 형변환 후 대입
//		
//		int[] array = new int[N]; // N개의 정수형 배열 생성
//		
////		-------- 반복문 시작(배열에 대입) --------
//		for(int i = 0; N > i; i++) {
//			array[i] = Integer.parseInt(st.nextToken()); // i번째 토큰을 정수형 형변환 후 대입 
//		}
////		-------- 반복문 종료 --------
//		
////		-------- 2) 반복문 시작 --------
//		for(int j = 0; N > j; j++) {
//			if(X > array[j]) {
//				System.out.print(array[j] + " ");
//			}
//		}
//		-------- 2) 반복문 종료 --------
		
//		--------------------------------------- StringBuilder사용 -------------------------------------------
//		1-1)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		int N; // 정수형 변수 N 선언
		int X; // 정수형 변수 X 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성 후 초기화
		
		N = Integer.parseInt(st.nextToken()); // 첫번째 토큰을 정수형 형변환 후 N에 대입
		X = Integer.parseInt(st.nextToken()); // 두번째 토큰을 정수형 형변환 후 N에 대입
		
		st = new StringTokenizer(br.readLine(), " "); // 두번째 줄의 데이터 토큰화
		
		StringBuilder sb = new StringBuilder(); // StringBuilder 객체 생성 후 초기화
		
		
		
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken()); // 형변환 후 토큰을 a 에 반복해서 저장
			
			if(a < X) {
				sb = sb.append(a).append(" "); // append메소드는 StringBuilder 객체 자신을 반환하기 때문에 연속적으로 메소드 호출 가능(메소드체이닝)
			}
		}
		
//		2)
		System.out.println(sb); // sb 출력
	}

}
