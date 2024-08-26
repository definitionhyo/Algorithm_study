package baekjoon.array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class number_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		문제
//		두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
//		예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//
//		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
//		그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//
//		1) 입력
//		1-1) 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 
//		이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//
//		2) 출력
//		첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		HashSet<Integer> num = new HashSet<Integer>(); // HashSet 객체 생성 후 초기화
		
		for(int i = 0; i < 10; i++) {
			num.add(Integer.parseInt(br.readLine()) % 42); // True일 경우(HashSet안의 값이 중복이 아닌 경우) HashSet에 저장  
		}
		
		System.out.println(num.size());
		
	}

}
