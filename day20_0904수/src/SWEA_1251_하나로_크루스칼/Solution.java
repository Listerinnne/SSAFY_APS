package SWEA_1251_하나로_크루스칼;

import java.util.Scanner;

class Edge{	//간선 정보를 모아둘 클래스
	
	Node node1;	//정점 1
	Node node2;	//정점 2
	int e; 		//가중치(환경부담금)
	
}
class Node{	//정점의 정보
	
	int x, y;	//섬의 x, y좌표, 
	
}

public class Solution {
	
	static double length(Node node1, Node node2) {	// 두 섬 사이의 거리를 구하는 메서드
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
	
	static int calCost(double cost, double length) {	//가중치(환경부담금)를 계산하는 메서드
		return (int)(cost * Math.pow(length, 2));
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {			//테케 수만큼 반복
			
			int n = sc.nextInt();				//섬의 개수
			Node[] node = new Node[n];			//섬의 x,y좌표를 저장할 객체 배열
			Edge[] edge = new Edge[n*(n-1)];	//간선의 정보를 저장할 객체 배열
			
			for(int i=0; i<n; i++) {			//객체 생성 및 x좌표 입력받기
				node[i] = new Node();
				node[i].x = sc.nextInt();
			}
			for(int i=0; i<n; i++) {			//y좌표 입력받기
				node[i].y = sc.nextInt();
			}
			
			double cost = sc.nextDouble();		//환경부담세율
			
			int min = 0; 						//최소 환경부담금을 업데이트할 변수
			
			//------------------------
			
			/*1. 모든 간선에 대한 환경부담금을 구해 Edge.e에 대입
			 * 2. 간선을 기준으로 정렬
			 * 3. 서로소 집합을 활용하여 답을 구한다 */
			
			for(int i=0; i<n; i++) {			//모든 간선의 환경부담금 구하기
				for(int j=i+1; j<n; j++) {
					calCost(cost, length(node[i], node[j]));	//엣지에 대입해야되는데 간ㅅ선정보 어케저장함>???
					
				}
			}
			
		}//테케 수만큼 반복 끝
	}
}

















