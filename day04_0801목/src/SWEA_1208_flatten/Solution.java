package SWEA_1208_flatten;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input1208.txt");
		Scanner sc = new Scanner(file);
		
		for(int i=0; i<10; i++) {	//테케 개수만큼 반복
			int dump = sc.nextInt();
			int[] oriArr = new int[100];	//크기 100만큼의 일차원배열 생성
			
			for(int j=0; j<oriArr.length; j++) {	//입력을 배열에 저장
				oriArr[j] = sc.nextInt();
			}
			
//			int[] cntArr = new int[cntArr.];
			
		}
		
	}
}