package baekjoon.CharAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_27866 {

	public static void main(String[] args) throws IOException {

//		문제
//		단어 
//		S와 정수 i 가 주어졌을 때, 
//		S 의 i 번째 글자를 출력하는 프로그램을 작성하시오.
//
//		1) 입력
//		1-1) 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000 이다.
//		1-2) 둘째 줄에 정수 i가 주어진다. (1 <= i \<= |S| )
//
//		2) 출력
//		S의 i번째 글자를 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성
		String S = br.readLine(); // 1-1)
		int i = Integer.parseInt(br.readLine()); // 1-2)
		
		System.out.println(S.charAt(i - 1)); // 2)
		
		
		
	}

}
