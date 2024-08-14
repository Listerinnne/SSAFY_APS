package 트리_구현;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class 보물상자_비밀번호 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("5658_input.txt");
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	//테케 개수
		
		for(int tc=0; tc<t; tc++) {	//테케만큼 반복
			
			n = sc.nextInt();	//n개의 수가 주어짐
			int k = sc.nextInt();	//k번쨰로 큰 수
			
			nArr = sc.next().split("");	//입력받은 숫자를 저장할 배열
			key = new String[4];	//가능한 모든 경우의 암호를 저장할 배열
			System.out.println("f"+"g");
			
			
		}
		
		
	}
	static int n;
	static String[] nArr;
	static String[] key;
	static String[] rotate(String[] nArr) {	//문자열을 한 칸 돌리는 메서드
		String[] tmpArr = new String[n]; 
		String tmp = nArr[0];
		System.arraycopy(nArr, 1, tmpArr, 0, n-1);
		tmpArr[n-1] = tmp;
		return tmpArr;
	}
	
	static String returnKey(String nArr) {	//key에 n/4개씩 잘라 합치기
		String tmp = "";
		for(int i=0; i<4; i++) {
			for(int j=i+4; j<i+2*4; j++) {
				tmp = tmp+ nArr[j];
				//StringBuilder를 써보자
			}
		}
		return tmp;
	}

}
