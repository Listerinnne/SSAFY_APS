package SWEA_1209_Sum    ;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("input.txt");

		Scanner sc = new Scanner(file);
		int[][] arr = new int[100][100];
		int max = 0;	//최대값 저장할 변수
		int sum = 0;	//줄마다 더한 값을 저장할 변수


		for(int t=0; t<10; t++) {	//테스트케이스 개수만큼 반복
			int tc = sc.nextInt();	//테스트케이스 숫자 받기
			max = 0;	//최대값 저장할 변수 초기화
			
			for(int i=0;i<100; i++) {	//배열에 테스트케이스 집어넣기
				for(int j=0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for(int i=0;i<100; i++) {	//가로 더해서 비교하기
				sum = 0;
				for(int j=0; j<100; j++) {
					sum += arr[i][j];
				}
				max = (max>sum)? max : sum ;	//max값이 sum보다 크면 그대로, sum이 더 크면 sum을 max값에 집어넣는다. 
			}

			for(int j=0;j<100; j++) {	//세로 더해서 비교하기
				sum = 0;
				for(int i=0; i<100; i++) {
					sum += arr[i][j];
				}
				max = (max>sum)? max : sum ;	//max값이 sum보다 크면 그대로, sum이 더 크면 sum을 max값에 집어넣는다. 
			}
			
			sum = 0;
			for(int i=0; i<100; i++) {	//대각선1
				sum += arr[i][i];
			}
			max = (max>sum)? max : sum ;	//max값이 sum보다 크면 그대로, sum이 더 크면 sum을 max값에 집어넣는다. 
			
			sum = 0;
			for(int i=0; i<100; i++) {	//대각선2
				sum += arr[i][100-1-i];
			}
			max = (max>sum)? max : sum ;	//max값이 sum보다 크면 그대로, sum이 더 크면 sum을 max값에 집어넣는다. 
			
			System.out.printf("#%d %d\n",tc, max);
		}
	}

}