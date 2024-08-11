package SWEA_1289_원재의_메모리_복구;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("1289_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {	//테케 개수만큼 반복
			
			String original = sc.next();	//원래 상태 입력받기
			int[] modify = new int[original.length()];	//원래 상태의 길이+1만큼의 배열 생성
			int num = 0;
			int sum = 0;
			//------------------------------------------
			
			for(int i=0; i<modify.length; i++) {	//원래 상태와 배열 비교하기
				
				if(original.charAt(i) - '0' != modify[i]) {	//해당 인덱스 요소가 동일하지 않으면
					num = ++num % 2;
					for(int j=i+1; j<modify.length; j++) 
						modify[j] = num;	//현재 인덱스의 다음 요소만 바꿔준다
					
					sum++;
					
				}
			}
			System.out.println("#" + tc + " " + sum);
			
			
		}
		
	}
}