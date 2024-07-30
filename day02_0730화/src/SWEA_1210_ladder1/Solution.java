package SWEA_1210_ladder1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.util.Arrays;




/*!!!!!!!!!!!!!!테케 10개 중 하나가 틀림!!!!!!!!!!!!!!!*/
public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);

		int[][] arr = new int[100][102];	//양옆을 0으로 감싸는 열 추가

		for(int t=0; t<10; t++) {	//테스트케이스 수만큼 반복
			int tc = sc.nextInt();	//테스트케이스 번호 입력받기
			int idx = 0;	//2의 가로 인덱스를 저장할 변수

			for(int i=0; i<100; i++) {	//입력값 배열에 저장하기
				arr[i][0] = 0;	//양 옆을 0으로 감싸 예외를 방지. 
				arr[i][101] = 0;
				for(int j=1; j<101; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			//2의 위치 찾기
			for(int j=0; j<100; j++) {
				if(arr[99][j]==2)
					idx = j;	//2의 가로 인덱스를 idx에 저장
			}
			

			for(int i=99; i>-1; i--) {	//어차피 최종적으로 올라가야 하는 높이는 i만큼이기 때문에 굳이 무한반복일 필요는 없을 듯?
//				System.out.printf("i : %d, idx : %d\n", i, idx);
				if(arr[i][idx+1] ==1) {	//현위치의 오른쪽에 1이 있을 경우
					while(arr[i][idx+1] ==1) {	//오른쪽 진로가 1일 동안 반복	//여기서 문제 발생
						idx = idx+1;
//								System.out.println("진로가 1일 때 반복");
					}
				}
				else if(arr[i][idx-1] ==1) {	//현위치의 왼쪽에 1이 있을 경우
					while(arr[i][idx-1] ==1) {	//왼쪽 진로가 1일 때
						idx = idx-1;
					}
					
				}


			}
			
			System.out.printf("#%d %d\n", tc, idx-1);	//양 옆으로 0을 둘렀기 때문에 가로 인덱스가 1씩 밀린다. 따라서 idx에서 1을 빼줌

		}
	}
}
//				if(arr[i][idx+1]==1) {	//진로의 오른쪽에 1이 있을 때
//					if(arr[i][idx+1] !=0 ) {	//idx가 0을 만나지 않을 때
//						arr[i][idx] = arr[i][idx+1];
//						idx+=1;
//					}
//				}else if(arr[i][idx-1]==1) {	//진로의 왼쪽에 1이 있을 때
//
//				}