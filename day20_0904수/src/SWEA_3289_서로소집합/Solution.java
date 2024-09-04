package SWEA_3289_서로소집합;

import java.util.Scanner;

public class Solution {

	static int[] p;
	static void makeSet(int x) {
		p[x] = x;
	}
	static int findSet(int x) {
		if(x != p[x]) {
			p[x] = findSet(p[x]);
		}
		return p[x];
	}
	static void union(int x, int y) {
		p[y] = x;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			int V = sc.nextInt();
			int E = sc.nextInt();
			
			p = new int[V+1];
			
			
			
		}
		
	}

}
