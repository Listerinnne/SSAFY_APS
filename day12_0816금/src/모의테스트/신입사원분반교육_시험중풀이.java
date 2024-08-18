package 모의테스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 신입사원분반교육_시험중풀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int tc=0; tc<t; tc++) {
			int n = sc.nextInt();	//인원수
			int min = sc.nextInt();	//최소인원
			int max = sc.nextInt();	//최대인원
			int[] nScore = new int[n];	//점수배열

			for(int i=0; i<n;i++) {	//점수배열 입력받기
				nScore[i] = sc.nextInt();
			}
				List<Integer> idxStart = new ArrayList<>();
				List<Integer> idxMiddle = new ArrayList<>();
				List<Integer> idxEnd = new ArrayList<>();

			//------------------------------

			Arrays.sort(nScore);	//점수배열 정렬
//			System.out.println(Arrays.toString(nScore));
			int num = 0;	//동일한 수의 마지막 인덱스
			
			int[] sameScNum = new int[n];	//동일한 점수 개수를 저장할 이차원배열
			
			
			//같은 점수 개수를 저장
			out : for(int i=0; i<n; i++) {	//sameScNum의 인덱스를 증가시킴
				System.out.println("i : " + i);
				for(int j=num; j<n; j++) {	//nScore에서 동일한 숫자의 개수를 sum에 누적
					System.out.println("j : "+j);
					if(nScore[num] != nScore[j]) {
						num = j;
//		뭔가 틀린 부분				if(j >= n-1) break out;
						System.out.println("num : "+num);
						break;
					}
					++sameScNum[i];
					System.out.println("sameScNum[i] : "+sameScNum[i]);
				}
			}
			
			System.out.println(Arrays.toString(sameScNum));
			
			

			/*1. 정렬된 배열의 처음과 끝부터 동일한 수를 기준으로 3개씩 나누기 111 2345 66 이런 식으로..
			 *2. 만약 나눈 배열의 요소 개수가 최소최대인원 범위 내에 들어오지 않을 경우 안쪽으로 한 칸씩 옮기기
			 *3. 계속 나눠도 범위 내에 들어오지 못할 경우 -1 출력
			 *4. 조건을 만족하는 배열의 최대최소길이의 차를 maxScore에 저장하고 배열을 나눌 때마다 업데이트하기
			 */
			
			//idxStart : 나누는 배열 중 첫번째
//			int score1 = 0;
//			int score2 = 0;
//			
//			idxStart.add(nScore[score1]);
//			for(int i=1; i<n; i++) {
//				if(idxStart.get(0) != nScore[i]) {
//					score1 = i;
//					break;
//				}
//				idxStart.add(nScore[i]);
//			}
//			if(!(min > idxStart.size())) {
//				
//				for(int i=) {}
//				
//			} else if (!(idxStart.size() > max)) {
//				
//			}
//			
//			//idxEnd : 나누는 배열 중 마지막
//			idxEnd.add(nScore[n-1]);
//			
//			for(int i=n-2; i>=score1; i--) {
//				
//				if(idxEnd.get(0) != nScore[i]) {
//					score2 = i;
//					break;
//				}
//				idxEnd.add(nScore[i]);
//			}
//			
//			//idxMiddle : 나누는 배열 중 중간
//			for(int i=score1; i<=score2; i++) {
//				idxMiddle.add(nScore[i]);
//			}
//			
//			
////			System.out.println(idxStart);
////			System.out.println(idxMiddle);
////			System.out.println(idxEnd);
//			
		}

	}
	
	

}
