import java.util.Scanner;

class Solution_5356 {
	//교수님 저이거 클래스이름 Main으로 해서 틀렸어요 참작해주세요...ㅜㅜ

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=0; t<tc; t++ ) {	//테케 수만큼 반복
			
			int max = 0;
			String[] strArr = new String[5];
			
			for(int i=0; i<strArr.length; i++) {
				strArr[i] = sc.next();
				max = (max > strArr[i].length()) ? max : strArr[i].length() ;	//max값 설정
			}
			
			char[][] charArr = new char[5][max];
			
			for(int i=0; i<charArr.length; i++) {
				for(int j=0; j<strArr[i].length(); j++) {
					
					charArr[i][j] = strArr[i].charAt(j);
				}
			}
			System.out.printf("#%d ", t+1);
				for(int j=0; j<max; j++) {
					for(int i=0; i<charArr.length; i++) {
					if(charArr[i][j] != '\u0000') 
						System.out.print(charArr[i][j]);
				}
			}
				System.out.println();
		}
	}
}

//1
//qqqqqqqqqqqqqqq
//wwwwwwwwwwwwwww왜,,왜지? 왠데 아오 진심 개,빡쳐 :)
//eeeeeeeeeeeeeee
//rrrrrrrrrrrrrrr
//ttttttttttttttt