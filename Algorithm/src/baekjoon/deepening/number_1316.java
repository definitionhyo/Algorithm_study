package baekjoon.deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_1316 {

	public static void main(String[] args) throws IOException {
		
//		문제
//		그룹 단어란 단어에 존재하는 모든 문자에 대해서, 
//		각 문자가 연속해서 나타나는 경우만을 말한다. 
//		예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
//		kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
//		aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//
//		단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
//		둘째 줄부터 N개의 줄에 단어가 들어온다. 
//		단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//
//		출력
//		첫째 줄에 그룹 단어의 개수를 출력한다.

//		생각
//		1) 연속하는지 확인

 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		int N = Integer.parseInt(br.readLine()); // 단어 개수
		int count = 0; // 카운트하는 정수형 변수 count 생성
		
//		--------- check함수를 통한 카운트 반복문 시작 ---------  
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			if(check(str)) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
	}
	
//		-------- 1) 확인하는 함수 생성--------
	static boolean check(String str) {
		boolean[] alphabet = new boolean[26]; // 2) 위한 알파벳 개수 크기의 boolean형 배열 생성
		
//			-------- 1) 반복문 시작 --------
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i); // 현재 알파벳
			int pre = (i > 0) ? str.charAt(i - 1) : 0; // 이전 알파벳 삼항연산자

//			--------- 이미 체크 되어있는지 확인하는 if문 ---------
			if(alphabet[now - 'a'] == false) { 
				alphabet[now - 'a'] = true;
			} else if(now != pre) {
				return false;
			}
		}
		return true;
		
	}

}


