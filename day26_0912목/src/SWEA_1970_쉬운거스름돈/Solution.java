package SWEA_1970_쉬운거스름돈;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {	//테케 수만큼 반복
			int n = sc.nextInt();		//금액
			
			int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};		//화폐 단위 저장
			int[] money = new int[unit.length];								//단위 사용개수 저장
			
			for(int i=0; i<unit.length; i++) {

				money[i] = n / unit[i];		//사용개수 저장
				n = n % unit[i];			//n 업데이트
				
			}
			
			System.out.println("#" + tc);
			for(int num : money) {
				System.out.print(num + " ");
			}
			System.out.println();
		}//테케 수만큼 반복 끝
		
		
	}
}