package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_25304 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 
//		그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 
//		준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
//
//		영수증에 적힌,
//
//		구매한 각 물건의 가격과 개수
//		구매한 물건들의 총 금액 을 보고, 
//		구매한 물건의 가격과 개수로 계산한 총 금액이 
//		영수증에 적힌 총 금액과 일치하는지 검사해보자.
//
//		1) 입력
//		1-1) 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
//		1-2) 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
//		이후 
//		1-3) N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
//
//		2) 출력
//		2-1) 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 
//		2-2) 일치하지 않는다면 No를 출력한다.
//
//		3) 제한
//		1 ≤ X ≤ 1,000,000,000
//		1 ≤ N ≤ 100 
//		1 ≤ a ≤ 1,000,000 
//		1 ≤ b ≤ 10 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		StringTokenizer st; // StringTokenizer 객체 선언
		boolean isValid; // Boolean 타입 객체 선언
		int X; // 정수형 변수 선언(영수증에 적힌 총 금액)
		int N; // 정수형 변수 선언(물건의 수 = N개의 줄)
		int sum = 0; // 정수형 변수 선언(물건들의 가격의 합)
		
		// -------- 1-1), 1-2) 반복문 시작 --------
		do {
			
			X = Integer.parseInt(br.readLine()); // 정수형으로 형변환 후 X에 대입(1-1)
			N = Integer.parseInt(br.readLine()); // 정수형으로 형변환 후 N에 대입(1-2)
			
			isValid = ( X >= 1 && X <= 1000000000 && N >= 1 && 100 >=N ); // 3) isValid 조건설정
			
			if (!isValid) {
				System.out.println("X는 1~1000000000 N은 1~100 a는 1~1000000 b는 1~10의 수 입니다");
			}
			
		} while (!isValid);
		// -------- 1-1), 1-2) 반복문 종료 --------
		
		// -------- 1-3) 반복문 시작 --------
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 공백을 구분자로 한 st 객체 생성
			int a = Integer.parseInt(st.nextToken()); // 첫번째 토큰을 정수형으로 형변환 후 a에 대입(1-3) 
			int b = Integer.parseInt(st.nextToken()); // 두번째 토큰을 정수형으로 형변환 후 b에 대입(1-3) 
			sum += a * b;
		}
		// -------- 1-3) 반복문 종료 --------
		
		// -------- 2) 조건문 시작 --------
		if (X == sum) {
			System.out.println("Yes"); // 2-1)
		} else {
			System.out.println("No"); // 2-2)
		}
		// -------- 2) 조건문 종료 --------
		
		
	}

}
