
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("1228_input.txt");
		
		Scanner sc = new Scanner(file);
//		Scanner sc = new Scanner(System.in);
		
		
		for(int tc=0; tc<10; tc++) {	//테케 개수만큼 반복
			
			int oriLen = sc.nextInt();	//원본 암호문 길이
			List<String> original = new ArrayList<>();	//원본 암호문 배열 생성
			for(int i=0; i<oriLen; i++) {	//원본 암호문 입력받기
				original.add(sc.next()) ;
			}
			int orderLen = sc.nextInt();	//명령 개수 입력받기
			//----------------------------------------------

			for(int i=0; i<orderLen; i++) {	//명령문(I) 수만큼 반복
				sc.next();	//I는 흘려보내기
				int x = sc.nextInt();
				int y = sc.nextInt();

				for(int j=0; j<y; j++) {	//x자리 숫자 뒤부터 차례로 수정된 암호를 입력받는다
					//						String tmp = sc.next();
					original.add(x+j, sc.next());
				}
			}
			System.out.printf("#%s ", tc+1);
			for(int i=0; i<10; i++) {
				System.out.print(original.get(i) + " ");
			}///
			System.out.println();

		}

	}
	
}