package baekjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class number_5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		X대학 M교수님은 프로그래밍 수업을 맡고 있다. 
//		교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
//
//		교수님이 내준 특별과제를 28명이 제출했는데, 
//		그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
//
//		1) 입력
//		1-1) 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 
//		출석번호에 중복은 없다.
//
//		2) 출력
//		출력은 2줄이다. 
//		2-1) 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 
//		2-2) 2번째 줄에선 그 다음 출석번호를 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		int[] student = new int[30]; // 30크기의 정수형 배열 생성 후 초기화
		
//		-------- 1-1) 반복문 시작 --------
		for(int i = 0; i < 28; i++) {
			int num = Integer.parseInt(br.readLine()); // 정수형으로 형변환 후 대입
			student[num - 1] = num; 
		}
		
//		-------- 2) 반복문 시작 --------
		for(int j = 0; j < 30; j++) {
			if(student[j] == 0) {
				System.out.println(j + 1);
			}
		}
		
		
	}

}
