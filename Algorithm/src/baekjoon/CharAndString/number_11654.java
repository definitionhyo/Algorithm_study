package baekjoon.CharAndString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_11654 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
//
//		입력
//		알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
//
//		출력
//		입력으로 주어진 글자의 아스키 코드 값을 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		System.out.println((int)br.readLine().charAt(0));
		
		
	}

}
