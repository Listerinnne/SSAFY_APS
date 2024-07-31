package SWEA_1989_초심자의외문검사;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	//테케 개수 입력받음
		
		for(int i=0; i<t; i++) {	//테케 개수만큼 반복
			System.out.printf("#%d ", i+1);
			String str = sc.next();	//문자열 입력받기
			String rev = "";	//뒤집은 문자열을 저장할 변수 생성
			
			for(int j=str.length()-1; j>-1; j--) {	//str 뒤에서부터 문자를 빼내서 rev에 누적한다
				rev += "" + str.charAt(j);
			}
//			System.out.println(rev);
			if(rev.equals(str)) 	//동일할 경우 1 출력
				System.out.println(1);
			else					//동일하지 않을 경우 0 출력
				System.out.println(0);
		}
		
	}
}