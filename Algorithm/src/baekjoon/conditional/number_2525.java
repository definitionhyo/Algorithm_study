package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_2525 {

	public static void main(String[] args) throws IOException {
		
		// 1) 문제 
		// KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 
		// 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 
		// 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
		// 또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 
		// 끝나는 시각을 알려 주는 디지털 시계가 있다.
		// 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 
		// 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
		
		// 2) 입력
		// 첫째 줄에는 현재 시각이 나온다. 
		// 2-1) 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 
		// 2-2) 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
		
		// 3) 출력
		// 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
		// (단, 3-1) 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 
		//  3-2) 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 리더를 통해 입력받음
//		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 구분자 공백을 통해 토큰화함
		StringTokenizer st; // 무한 입력받는 오류 해결 위해 변수 선언
		
		
		// 2-1) do-while 사용 우선 입력받고 입력 조건에 맞지 않는경우 반복함
		// ---- 정수형 변수 선언할때 0 을 안주면 do while 조건에서 오류나는지 확인하기 ----
		
		// * 계속 입력받는 오류 발생 어떻게 할지 생각 -> 불린 조건 넣어서 맞는경우 true가 될때까지
		// => StringTokenizer을 먼저 변수 선언 후 do while문에서 객체 변수 생성
		// => 이전에 했던것 다 같은 오류 발생했을듯
		
		int A = 0; // 정수형 변수 선언 
		int B = 0; // 정수형 변수 선언
		int C = 0; // 정수형 변수 선언
		
		boolean isValid;
		
		// -------- 입력 반복문 시작 --------
		do {
			st = new StringTokenizer(br.readLine(), " "); // 객체 변수 생성하여 대입
			A = Integer.parseInt(st.nextToken()); // 2-1 형변환 후 대입(현재시간 시)
			B = Integer.parseInt(st.nextToken()); // 2-1 형변환 후 대입(현재시간 분)
			C = Integer.parseInt(br.readLine()); // 2-2 형변환 후 대입(걸리는 요리시간 분)
			
			// 버퍼리더 출력 되는지 확인하기 위해 사용 
//			System.out.println(A); 
//			System.out.println(B);
//			System.out.println(C);
			
			isValid = (A >= 0 && A <= 23 && B >= 0 && B <= 59 && C >= 0 && C <= 1000);
			
			if (!isValid) {
				System.out.println("조건을 다시 확인해주세요");
			}
			
		} while (!isValid);
		// -------- 입력 반복문 종료 --------
		
		// -------- 출력 조건문 시작 --------
//		int totalMin = 60 * A + B + C; //입력받은 시간과 요리 시간을 다 더한 총 걸리는 시간(분)
//		int finalHour = totalMin / 60; // 최종 시간(시)
//		int finalMin = totalMin % 60; // 최종 시간(분)
//		
//		System.out.println(finalHour + " " + finalMin);
		// -------- 조건문이 아니라서 조건문 쓰는걸로 풀어보자 --------
		
		A += C / 60; // 현재시간(분) + 걸리는시간(시)
		B += C % 60; // 현재시간(분) + 걸리는시간(분)
		
		// 조건1 : 60분 이상이면 1시간 추가
		if (B >= 60) {
			A += 1; // 시간에 1시간 추가 A = A + 1;
			B -= 60; // 1시간 추가했으니 60분 뺀다 B = B - 60; 
		}
		
		// 조건 2 : 24시가 지나면 00이 된다
		if (A >= 24) {
			A -= 24; 
		}
		
		System.out.println(A + " " + B);
	}

}
















