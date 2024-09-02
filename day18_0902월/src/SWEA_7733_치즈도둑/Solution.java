package SWEA_7733_치즈도둑;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

//dfs
public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("7733_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			
			int n = sc.nextInt();
			int[][] nArr = new int[n][n];
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					nArr[i][j] = sc.nextInt();
				}
			}			
//			System.out.println(Arrays.deepToString(nArr));
			//---------------------------------------
			
			while() {}
			
		}

	}

}