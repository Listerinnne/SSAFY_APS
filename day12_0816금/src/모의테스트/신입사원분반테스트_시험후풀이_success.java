package 모의테스트;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 신입사원분반테스트_시험후풀이_success {
 
    public static void main(String[] args) throws FileNotFoundException  {
    	File file = new File("input_im.txt");
        Scanner sc = new Scanner(file);
//        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         
        for(int tc=0; tc<t; tc++) {
            int n = sc.nextInt();
            int min = sc.nextInt();
            int max = sc.nextInt();
            int[] nScore = new int[n];  //입력받은 점수들을 저장할 배열
            for(int i=0; i<n; i++) {
                nScore[i] = sc.nextInt();
            }
            //-------------------------------
 
            int minDiff = 1000; //학생 수 차이의 최소값 -> 최대 인원수로 초기화 
            boolean isTrue = false;     //모든 분반의 인원수가 1번이라도 조건에 부합할 경우 true로 바뀜
             
            //완전탐색
            //점수의 범위 : 0~100
            for(int i=0; i<100; i++) {   //score1(i) = 1~99
                for(int j=i; j<101; j++) {   //score2(j) = i~100
                     
                    int high = 0;   //우수 분반 인원수 카운트
                    int mid = 0;    //보통 분반 인원수 카운트
                    int low = 0;    //부진 분반 인원수 카운트
                     
                    for(int score : nScore) {   //모든 인원의 점수 반환 
                         
                        if(score >= j) high++;           //score2보다 클 경우 우수
                        else if(score >= i) mid++;   //score1보다 클 경우 보통
                        else low++;                     //score1보다도 작을 경우 부진
                             
                    }
                     
                     
                    if(min <= high && high <= max &&      //모든 분반의 인원수가 min과 max 사이를 만족할 경우
                            min <= mid && mid <= max &&
                            min <= low && low <= max ) {
                         
                        isTrue = true;
                         
                        int maxPersonnel = Math.max(high, Math.max(mid, low));  //최대인원을 가진 반 구하기
                        int minPersonnel = Math.min(high, Math.min(mid, low));  //최소인원을 가진 반 구하기
                         
                        minDiff = Math.min(minDiff, maxPersonnel - minPersonnel);   //인원수 차이의 최솟값 구하기
                         
                         
                    }
                     
                     
                }
            }
            //결과 출력
            if(isTrue) System.out.printf("#%d %d\n",tc+1, minDiff);
            else System.out.printf("#%d -1\n", tc+1);
             
             
        }
         
    }
 
}