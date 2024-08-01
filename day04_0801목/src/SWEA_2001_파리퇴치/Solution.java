package SWEA_2001_파리퇴치;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input2001.txt");
		Scanner sc = new Scanner(file);
		
		int t = sc.nextInt();	//테케 개수 입력받기
		
		for(int i=0; i<t; i++) {	//테케 개수만큼 반복
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][n];
			
			for(int r=0; r<n; r++) {	//입력값 n*n 배열에 저장
				for(int c=0; c<n; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			/*기준이 되는 칸이 이동할 수 있는 범위를 정하고
			 * {{0,0}(기준),{0,1},{1,0},{1,1}}; 만큼의 방향에 할당된 값을 전부 더해서 비교
			 */
			int max = 0;	//최대값을 저장할 변수
			for(int fr=0; fr<n-m+1; fr++){	//기준이 되는 칸이 이동할 수 있는 범위 정하기
				for(int fc=0; fc<n-m+1; fc++) {
					
					int sum = 0;	//잡을 수 있는 파리 수를 저장할 변수
					
					//m*m 크기의 파리채로 잡을 수 있는 파리 수 구하기
					for(int mr=fr; mr<fr+m; mr++) {	
						for(int mc=fc; mc<fc+m; mc++) {
							sum += arr[mr][mc];
						}
					}
					max = max>sum ? max : sum ;
					
				}
			}
			
			System.out.printf("#%d %d\n",i+1 ,max);
			
		}
		
	}
	
	
}