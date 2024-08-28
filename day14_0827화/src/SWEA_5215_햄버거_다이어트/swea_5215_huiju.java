import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class swea_5215 {
	
	static int n;	//재료의 수
	static int l;	//제한 칼로리
	static int[][] arr;	//각 재료의 점수와 칼로리를 저장하는 배열
	static int max;

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("5215_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc=0; tc<t; tc++) {	//테케 갯수만큼 반복
			
			n = sc.nextInt();
			l = sc.nextInt();
			arr = new int[n][2];
			
			for(int i=0; i<n; i++) {	//이차원배열에 점수와 칼로리 저장
				arr[i][0] = sc.nextInt();	//점수
				arr[i][1] = sc.nextInt();	//칼로리
			}
			
			//----------------------------------
			max = 0;	//!!!!!!!!!초기화필수!!!!!!!!!
			combination(0,0,0);
			
			System.out.printf("#%d %d\n", tc+1, max);
		}
		
	}
	
	static void combination(int idx, int score, int cal) {	//점수의 최대값을 구함
		
		//기저조건
		if(cal > l) 	//칼로리가 제한칼로리를 초과할 경우 종료
			return;
		
		if(idx == n) {	//탐색가능한 배열 크기를 초과할 경우 
			max = Math.max(max, score);	//최댓값을 구하고 종료
			return;
		}
		
		//재귀부분
		int scoreSum = score + arr[idx][0];	//현재 점수와 인덱스의 점수를 더한다
		int calSum = cal + arr[idx][1];		//현재 칼로리와 인덱스의 칼로리를 더한다
		combination(idx+1, scoreSum, calSum);	//재귀호출
		//기저조건에 걸렸을 경우 호출됨, 이전 단계로 돌아가서 인덱스만 한 칸 옮긴 후 실행
		combination(idx+1, score, cal);	
	}

}







