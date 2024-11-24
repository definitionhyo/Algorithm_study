package baekjoon.deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class number_3003 {

	public static void main(String[] args) throws IOException {
		
//		문제
//		동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
//		체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 
//		하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
//		체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//		동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
//
//		출력
//		첫째 줄에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력한다. 
//		만약 수가 양수라면 동혁이는 그 개수 만큼 피스를 더해야 하는 것이고, 음수라면 제거해야 하는 것이다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체 생성 후 초기화
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 객체 생성 후 초기화, 구분자 : 공백
//		int king = 1;
//		int queen = 1;
//		int look = 2;
//		int bishop = 2;
//		int knight = 2;
//		int pawn = 8;
		
		System.out.print(
						(1 - Integer.parseInt(st.nextToken())) 
						 + " " + (1 - Integer.parseInt(st.nextToken())) 
						 + " " + (2 - Integer.parseInt(st.nextToken()))
						 + " " + (2 - Integer.parseInt(st.nextToken()))
						 + " " + (2 - Integer.parseInt(st.nextToken()))
						 + " " + (8 - Integer.parseInt(st.nextToken()))
						);
		
		
	}

}
