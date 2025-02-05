package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_2480 {

	public static void main(String[] args) throws IOException {

//		1) 문제 
//		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
//		1-1) 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//		1-2) 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//		1-3) 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
//		또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
//		3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		
//		2) 입력 
//		2-1) 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
		
//		3) 출력
//		첫째 줄에 게임의 상금을 출력 한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받기 위한 버퍼 리더 객체 생성
		StringTokenizer st; // 문자열을 구분자를 기준으로 나누기 위한 객체 선언
		int a = 0; // 정수형 변수 선언(첫번째 주사위) 
		int b = 0; // 정수형 변수 선언(두번째 주사위)
		int c = 0; // 정수형 변수 선언(세번째 주사위)
		
		boolean isValid;
		
		// -------- 2-1) 반복문 시작 -------- 
		do {
			st = new StringTokenizer(br.readLine(), " "); // 객체 생성
			a = Integer.parseInt(st.nextToken()); // 정수형으로 형변환 후 저장 
			b = Integer.parseInt(st.nextToken()); // 정수형으로 형변환 후 저장
			c = Integer.parseInt(st.nextToken()); // 정수형으로 형변환 후 저장
			
			isValid = (a >= 1 && a <= 6 && b >= 1 && b <= 6 && c >= 1 && c <= 6); // isValid 조건 추가
			
			if (!isValid) {
				System.out.println("1~6의 숫자만 입력가능합니다");
			}
			
		} while (!isValid);
		// -------- 반복문 종료 -------- 
		
		
		// -------- 조건문 시작 -------- 
		// 1-1) 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
		if (a == b && a == c && b == c) {
			System.out.println(10000 + a * 1000);
		} else if (a == b && a != c) { // 1-2) a랑 b가 같은경우
			System.out.println(1000 + a * 100);
		} else if (b == c && a != b) { // 1-2) b랑 c가 같은경우
			System.out.println(1000 + b * 100);
		} else if (a == c && a != b) { // 1-2) a랑 c가 같은 경우
			System.out.println(1000 + c * 100);
		} else if (a > b && a > c) { // 1-3) a가 가장 큰 경우
			System.out.println(a * 100);
		} else if (b > a && b > c) { // 1-3) b가 가장 큰 경우
			System.out.println(b * 100);
		} else if (c > a && c > b) { // 1-3) c가 가장 큰 경우
			System.out.println(c * 100);
		}
		// -------- 조건문 종료 -------- 
		
		
	}

}















