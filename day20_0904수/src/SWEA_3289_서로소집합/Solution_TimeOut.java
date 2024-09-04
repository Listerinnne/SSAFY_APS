package SWEA_3289_서로소집합;

import java.util.Scanner;

public class Solution_TimeOut {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {	//tc만큼 반복
			
			int V = sc.nextInt();			//정점의 개수
			int order = sc.nextInt();	//연산의 개수
			p = new int[V+1];	//배열 길이 -> 정점의 개수 + 1(1부터 시작) 
			
			for(int i=1; i<=V; i++) {	//정점의 대표배열 생성
				p[i] = i;
			}
			
			/* - cal이 1일 경우(집합에 포함되어 있는지 확인)
			 * 	findSet(a) == findSet(b)가 true인 경우(겹침) 0 출력
			 * 	false인 경우(안겹침) 1출력
			 * 
			 * - cal이 0일 경우(합집합)
			 * 	union(findSet(a), findSet(b))로 합침
			 * */
			
			String ans = "";	//결과를 누적할 변수
			for(int i=1; i<=order; i++) {
				int cal = sc.nextInt();	//연산 0 혹은 1
				int a = sc.nextInt();	//주어지는 정점 1
				int b = sc.nextInt();	//주어지는 정점 2
				
//				aF = findSet(a);
//				bF = findSet(b);
				
				if(cal == 1) {
					if(findSet(a) == findSet(b))	//대표가 동일한 경우(같은 집합에 속한 경우)
						ans += 1;
					else 			////대표가 상이한 경우(다른 집합에 속한 경우)
						ans += 0;
				}else{	//cal == 0
					union(a, b);	//대표가 상이할 경우 합침
				}
			}
			
			System.out.printf("#%d %s\n", tc, ans);
			
			
		}//tc만큼 반복 끝
		
	}
	
	static int[] p;	//대표를 저장할 배열
	
	static int findSet(int a) {	//a가 속한 집합의 대표 찾기
		
		if(a != p[a]) 	//a와 a가 속한 집합의 대표가 다를 경우
			p[a] = findSet(p[a]);	//3차수 이상일 경우 앞서 했던 연산을 반복할 필요 없음
		return p[a];
		
	}
	static void union(int a, int b) {	
		int aF = findSet(a);
		int bF = findSet(b);
		if(aF!= bF) {
			p[aF] = bF;	//a 대표자 요소에 b 대표자 값을 대입 -> a의 대표자는 b가 된다!
		}
	}
	

}