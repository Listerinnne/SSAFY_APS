package SWEA_1215_회문1;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		// 한 줄에 제시된 문자 갯수만큼 배열 크기를 설정
		Scanner sc = new Scanner(System.in);
		String str = "";
		int count = 0;
		String[][] arr = new String[8][8];
		
		for(int tc=0; tc<10; tc++) {	//테스트케이스 갯수만큼 반복
			int len = sc.nextInt();     //문제였던 부분 2(위치가 잘못)
			System.out.printf("#%d ",tc+1);
			for(int i=0; i<8; i++){
				arr[i] = sc.next().split("");
			}

			for(int i=0; i<8; i++){   //가로
				for(int j=0; j<8-len+1; j++){   //첫번째 글자가 움직일 범위 설정
					str = "";
					for(int k=j; k<len+j; k++){  //str에 arr 안 문자를 len만큼 집어넣음
						str += arr[i][k];      //문제인줄 알았던 부분
					}
					String rev = "";
					for (int h = str.length()-1; h>=0; h--) {   //str 안 글자를 하나씩 빼서 역순으로 rev에 저장
						rev += str.charAt(h);    //문제였던 부분(h 수정 안 함)
					}
					if (str.equals(rev)) 
						++count;
				}
			}
			for(int i=0; i<8; i++){   //세로
				for(int j=0; j<8-len+1; j++){   //첫번째 글자가 움직일 범위 설정
					str = "";
					for(int k=j; k<len+j; k++){   //str에 arr 안 문자를 len만큼 집어넣음
						str += arr[k][i];
					}
					String rev = "";
					for (int h = str.length() - 1; h >= 0; h--) {   //str 안 글자를 하나씩 빼서 역순으로 rev에 저장
						rev += str.charAt(h);
					}
					if (str.equals(rev)) 
						++count;
				}
			}
			System.out.println(count);
			count=0;

		}
	}
}