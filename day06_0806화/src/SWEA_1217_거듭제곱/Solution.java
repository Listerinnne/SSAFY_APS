package SWEA_1217_거듭제곱;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("1217_input.txt");
		Scanner sc = new Scanner(file);

		for(int t=0; t<10; t++) {	//테케 개수만큼 반복
			int tc = sc.nextInt();
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.printf("#%d %d\n",tc,square(num1, num2));
			
			
		}
	}
	
	static int square(int num1, int num2) {
		if(num2 == 1)
			return num1;
		return num1*square(num1, num2-1);
	}
	
}