package 모의테스트;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 신입사원분반테스트_시험후풀이_fail {


	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input_im.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc=0; tc<t; tc++) {
			int n = sc.nextInt();
			int min = sc.nextInt();
			int max = sc.nextInt();
			int[] nScore = new int[n];	//입력받은 점수들을 저장할 배열
			for(int i=0; i<n; i++) {
				nScore[i] = sc.nextInt();
			}
			//-------------------------------
			//점수의 최댓값 찾기
			int maxScore = 0;
			for(int i=0; i<n; i++) {
				maxScore = maxScore > nScore[i] ? maxScore : nScore[i] ;
			}
			
			//누적합 배열 생성
			int[] count = new int[maxScore+1];
			
			//누적합배열 요소 채우기
			for(int i=0; i<n; i++) {
				count[nScore[i]]++;
			}
//			System.out.println(Arrays.toString(count));
			
			//리스트에 0이 아닌 배열의 요소 저장
			List<Integer> list = new ArrayList<>();
			for(int i=0; i<count.length; i++) {
				if(count[i] != 0) list.add(count[i]); 
			}
			System.out.println(list);
			
			//최소인원을 만족하지 못할 때
			/*1. 최소인원을 만족하지 못하는 요소 확인
			 * 2. 해당 요소의 앞 또는 뒤가 막혀있는지 확인
			 * 		2-1. 막혀있다면 그 반대 방향에 있는 요소를 하나씩 더해주기
			 * 		- 더할 때마다 min과 max 사이에 있는지 비교
			 * 		- 비교 후 조건에 부합하면 가장 큰 요소와 가장 작은 요소를 뺀 후 
			 * 		minScore와 비교하여 작은 값을 minScore에 저장(minScore의 초기값 : 맨 처음에 뺀 요소의 차)
			 * */
			//배열의 최솟값 찾기
			int minScoreSum = list.get(0);
			for(int i=0; i<list.size(); i++){
				minScoreSum = minScoreSum < list.get(i) ?minScoreSum : list.get(i) ; 
			}
			//배열의 최댓값 찾기
			int maxScoreSum = list.get(0);
			for(int i=0; i<list.size(); i++){
				maxScoreSum = maxScoreSum > list.get(i) ?maxScoreSum : list.get(i) ; 
			}
			
			//요소가 3개일 때
			if(list.size() == 3) {
				if(minScoreSum < min) {	//가장 작은 요소가 min보다도 작을 경우 -1출력 
					System.out.println(-1);
					continue;
				}
				System.out.println(maxScoreSum - minScoreSum);	//가장 작은 요소가 max보다도 클 경우 1출력
				continue;
			}
			
			//요소가 3개 이상일 때
			

		}
		
	}

}