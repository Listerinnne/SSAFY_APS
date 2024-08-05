package SWEA_8931_제로;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
	
		File file = new File("8931_input.txt");
		Scanner sc = new Scanner(file);
		int t = sc.nextInt();	//테케 개수
		
		for(int i=0; i<t; i++) {	//테케 개수만큼 반복
			Stack<Integer> stack = new Stack<>();
			int k = sc.nextInt();
			
			for(int j=0; j<k; j++) {
				int num = sc.nextInt();
				if(num == 0) stack.pop();
				else stack.add(num);
			}
			
			int sum = 0;
			int size = stack.size();
			for(int d=0; d<size; d++) {
				int pop = stack.pop();
				sum = sum +pop;
			}
			
			System.out.printf("#%d %d\n", i+1, sum);
			
		}
		
	}
}