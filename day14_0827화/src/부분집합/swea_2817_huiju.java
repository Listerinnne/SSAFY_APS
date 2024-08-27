import java.util.Arrays;
import java.util.Scanner;

public class swea_2817 {
	
	static int n;	//자연수의 개수
	static int k;	//더해서 만들어져야 하는 수
	static int arr[];	//자연수를 저장할 배열
	static int cnt;		//k가 되는 경우의 수를 업데이트할 변수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc=0; tc<t; tc++) {	//테케 개수만큼 반복
			
			n = sc.nextInt();
			k = sc.nextInt();
			arr = new int[n];
			
			for(int i=0; i<n; i++) {	//자연수를 배열에 저장
				arr[i] = sc.nextInt();
			}
//			System.out.println(Arrays.toString(arr));
			//-----------------------------------------------
			cnt = 0;	//조합의 개수 업데이트할 변수를 초기화
			combination(0, 0);
			
			System.out.printf("#%d %d\n", tc+1, cnt);	//결과 출력
			
		}
	}
	
	static void combination(int idx, int sum) {
		
		//기저조건
		if(sum > k) return;	//sum이 k를 초과할 경우 종료
		
		else if(sum == k) {	//sum과 k가 일치할 경우
			cnt++;			//cnt 업데이트 후 종료
			return;
		}
		if(idx == n) return;	//배열의 인덱스가 배열 크기를 초과할 경우 종료
		
		//재귀
		int sumUpdate = sum + arr[idx];	//현재까지 더한 값과 현재 인덱스에 해당하는 값을 더한다 
		combination(idx+1, sumUpdate);	//업데이트한 값으로 재귀호출
		combination(idx+1, sum);		//sum이 k를 초과할 경우 이전의 sum값으로 되돌린 후 인덱스를 한 칸 옮기고 재귀호출
	}
	
	
	

}
