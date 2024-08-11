package baekjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_2562 {

	public static void main(String[] args) throws IOException {

//		문제
//		9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//
//		예를 들어, 서로 다른 9개의 자연수
//
//		3, 29, 38, 12, 57, 74, 40, 85, 61
//
//		이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
//
//		입력
//		첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
//
//		출력
//		첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		int ary[] = new int[9]; // 9개의 정수형 요소를 가지는 배열 생성
		
//		------------------ ary에 저장하는 반복문------------------
		for(int i = 0; i < 9; i++) {
			ary[i] = Integer.parseInt(br.readLine());  // 정수형으로 형 변환 후 ary[i]에 저장
		}
		
		int max = ary[0]; // 최댓값 비교를 위해 저장
		int num = 0; // 최댓값이 몇번째인지 확인하기위한 정수 생성, 배열 1번 = 인덱스 = 0 
		
		
//		------------------ 최댓값을 찾는 반복문 ---------------
		for(int i = 0; i < 9; i++) {
			if(max < ary[i]) {
				max = ary[i];
				num = i; // 최댓값 번호를 num에 저장
			}
		}
		
		System.out.println(max);
		System.out.println(num + 1); // 인덱스는 0부터 시작
		
		
		
		
	}

}
