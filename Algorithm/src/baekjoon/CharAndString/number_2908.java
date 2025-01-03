package baekjoon.CharAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_2908 {

	public static void main(String[] args) throws IOException {

//		문제
//		상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
//		이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
//		상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
//
//		상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
//		예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//
//		두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
//		두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
//
//		출력
//		첫째 줄에 상수의 대답을 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성 후 초기화
		int a = Integer.parseInt(st.nextToken()); // 첫번째 토큰 정수형으로 형변환
		int b = Integer.parseInt(st.nextToken()); // 두번째 토큰 정수형으로 형변환
		int ra = 0; // 거꾸로 읽을 a 저장할 변수
		int rb = 0; // 거꾸로 읽을 b 저장할 변수
		
		while(a > 0) {
			int tmp = a % 10;
			a = a / 10;
			ra = ra * 10 + tmp;
		}
		
		while(b > 0) {
			int tmp = b % 10;
			b = b / 10;
			rb = rb * 10 + tmp;
		}
		
		if(ra > rb) {
			System.out.println(ra);
		} else {
			System.out.println(rb);
		}
		
	}

}
