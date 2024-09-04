package SWEA_1251_하나로_크루스칼;

import java.util.Arrays;
import java.util.Scanner;
//오버플로우 발생
class Edge implements Comparable<Edge>{	//간선 정보를 모아둘 클래스
	
	int node1;	//정점 1의 인덱스
	int node2;	//정점 2의 인덱스
	int e; 		//가중치(환경부담금)
	Edge(){}
	Edge(int node1, int node2, int e){
		this.node1 = node1;
		this.node2 = node2;
		this.e = e;
	}
//	@Override
//	public String toString() {
//		return "Edge [node1=" + node1 + ", node2=" + node2 + ", e=" + e + "]";
//	}
	@Override
	public int compareTo(Edge e) {	//정렬을 위한 compareTo
		return this.e - e.e;
	}
	
}
class Node{	//정점의 정보
	
	int x, y;	//섬의 x, y좌표
	
}

public class Solution {
	static int[] p;	//대표를 저장할 배열
	
	//대표를 찾는 메서드
	static int findSet(int a) {	
		if(a != p[a]) 
			p[a] = findSet(p[a]);
		return p[a];
	}
	
	//두 집합을 합치는 메서드
	static void union(int a, int b) {
			p[a] = b;	//b를 대표로 하여 집합을 합친다
	}
	
	// 두 섬 사이의 거리를 구하는 메서드
	static double length(Node node1, Node node2) {	
		if(node1.x == node2.x) 
			return Math.abs(node1.y - node2.y);
		else if(node1.y == node2.y) 
			return Math.abs(node1.x - node2.x);
		else {
			int col = Math.abs(node1.y - node2.y);
			int row = Math.abs(node1.x - node2.x);
			
			return Math.sqrt(Math.pow(col, 2) + Math.pow(row, 2));
		}
	}
	
	//가중치(환경부담금)를 계산하는 메서드
	static int calCost(double cost, double length) {	
		return (int)(cost * Math.pow(length, 2));
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {			//테케 수만큼 반복
			
			int n = sc.nextInt();				//섬의 개수
			p = new int[n];						//대표를 저장할 배열
			Node[] node = new Node[n];			//섬의 x,y좌표를 저장할 객체 배열
			Edge[] edge = new Edge[n*(n-1)/2];	//간선의 정보를 저장할 객체 배열 무방향이기 때문에 중복제거를 위해 /2 필수
			
			for(int i=0; i<n; i++) {			//객체 생성 및 x좌표 입력받기
				node[i] = new Node();
				p[i] = i;						//각 node의 인덱스를 대표로 저장
				node[i].x = sc.nextInt();
			}
			for(int i=0; i<n; i++) {			//y좌표 입력받기
				node[i].y = sc.nextInt();
			}
			
			double cost = sc.nextDouble();		//환경부담세율
			
			
			//------------------------
			
			/*1. 모든 간선에 대한 환경부담금을 구해 edge.e에 대입
			 * 2. 환경부담금(가중치)을 기준으로 정렬
			 * 3. 서로소 집합을 활용하여 답을 구한다 */
			
			
			int idx = 0;	//edge의 인덱스
			for(int i=0; i<n; i++) {			
				for(int j=i+1; j<n; j++) {
					int result = calCost(cost, length(node[i], node[j]));	//모든 간선의 환경부담금 구하기
					edge[idx++] = new Edge(i, j, result);		//간선정보 저장
				}
			}
			
			for(int i=0; i<edge.length; i++) {
//				System.out.println(edge[i].toString());
			}
			Arrays.sort(edge);	//환경부담금을 기준으로 정렬
			
			int pick = 0; 		//뽑은 간선의 수	
			int min = 0; 		//최소 환경부담금을 업데이트할 변수
					
			for(int i=0; i<edge.length; i++) {
				int f1 = findSet(edge[i].node1);	//두 인덱스를 사용하는 노드의 대표를 구함
				int f2 = findSet(edge[i].node2);
				
				if(f1 != f2) {
					union(f1, f2);
					min += edge[i].e;
					pick++;
				}
				if(pick == n-1) break;					//뽑을 간선의 수를 다 채우면 종료
				
			}
			
			System.out.printf("#%d %d\n",tc,min);
			
		}//테케 수만큼 반복 끝
	}
}







//4
//2
//0 0
//0 100
//1.0
//4
//0 0 400 400
//0 100 0 100
//1.0
//6
//0 0 400 400 1000 2000
//0 100 0 100 600 2000
//0.3
//9
//567 5 45674 24 797 29 0 0 0
//345352 5464 145346 54764 5875 0 3453 4545 123
//0.0005









