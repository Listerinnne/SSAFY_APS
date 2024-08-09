package SWEA_1966_숫자를_정렬하자;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("1966_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();	//테케 개수 입력받기

		for(int tc=0; tc<t; tc++) {	//테케 개수만큼 반복
			System.out.printf("#%d ", tc+1);

			int[] arr = new int[sc.nextInt()];	//배열 생성

			for(int i=0; i<arr.length; i++) {	//입력값을 배열에 집어넣기	
				arr[i] = sc.nextInt();
			}

			//------------------------------------------

			for(int n=1; n<arr.length; n++ ) {	//n의 1번째 요소부터 비교
				int tmp = arr[n];	//arr[n]을 tmp에 저장해둔다.
				int s = 0;
				for(s=n-1; s>=0 && arr[s] > tmp; s--) {	//비교할 s의 범위 정하기 //정렬된 수가 정렬되지 않은 비교하는 수보다 큰 경우
//						//정렬된 수를 뒤로 한 칸 민다. 
						arr[s+1] = arr[s];
//						//정렬되지 않은 수가 정렬된 수 중 본인보다 작은 수를 만날 때까지 반복

				}
				arr[s+1] = tmp;
			}

			for(int num : arr) {
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}
}