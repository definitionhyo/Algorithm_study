package baekjoon.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_14681 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제 : 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 
//		사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. 
//		"Quadrant n"은 "제n사분면"이라는 뜻이다.
//		예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 
//		점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
//		점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
//		단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 정수를 입력받음
		int x, y; // 변수 x, y 선언
		
		// 반복문 시작
		// 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 
		// 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
		do {
			x = Integer.parseInt(br.readLine()); 
			y = Integer.parseInt(br.readLine());
//			br.close(); 무한루프 원인임 찾아보기
		} while (x < -1000 || x > 1000 || x == 0 || y < -1000 || y > 1000 || y == 0 );
		// -------------- 반복문 종료 --------------
		
		// 조건문 시작
		// 4가지의 조건이 있으니 switch case 사용해봄
		// 변수가 x,y 두개이므로 if else 사용해야할듯
		// x > 0, y > 0 : 1사분면
		// x < 0, y > 0 : 2사분면
		// x < 0, y < 0 : 3사분면
		// x > 0, y < 0  4사분면
		if (x > 0 && y > 0) {
			System.out.println(1);
		} else if (x > 0 && y < 0) {
			System.out.println(4);
		} else if (x < 0 && y > 0) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		// -------------- 조건문 종료 --------------
		
		
		// 숫자 한번 잘못치면 무한루프 되는거같음 
		// 해결방법 : br.close 삭제하면 됨 = 이유찾아보기
		
	}

}
