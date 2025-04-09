package controlStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		브론즈
//		1~100까지 출력

		// for(int i = 0 ; i < 100 ; i++) {
//			System.out.println(i+1);
//		}

//		100~1까지 출력

//		for(int i = 0 ; i < 100 ; i++) {
//			System.out.println(100-i);
//		}

//		1~100까지 중 짝수만 출력

//		for (int i = 0; i < 100; i++) {
//			int even = i + 1;
//			boolean check = even % 2 == 0;
//			if (check) {
//				System.out.println(i + 1);
//			}
//		}

//		실버
//		1~10까지 합 출력

//		int total = 0;
//		for (int i = 0 ; i<10 ; i++) {
//			total += i+1;
//		}
//		System.out.println(total);

//		1~n까지 합 출력(n은 입력받기)

//		int number = sc.nextInt();
//		int total = 0;
		
//
//		for (int i = 0; i < number; i++) {
//			total += i + 1;
//		}
//		System.out.println(total);

//		골드
//		A~F까지 출력
//		A~F = 65~70
//		(char)로 형변환

//		for(int i = 0; i<6; i++) {
//			int english= i+65;
//			System.out.println((char)english);
//		}

//		A~F까지 중 C 제외하고 출력(continue 사용하지 않기)
//		0 1 2 3 4 5
//		      2를 제외시키기 위한 조건식이 필요

//		for (int i = 0; i < 6; i++) {
//			int english = i + 65;
//			boolean check = i == 2;
//			if (!check) {
//				System.out.println((char) english);
//			}
//		}

//		다이아
//		0 1 2 0 1 2 0 1 2 출력
//		9번 반복
//		0 1 2 3 4 5 6 7 8 
//		i % 3 의 나머지 값이 출력되게 해야한다

//		for (int i = 0 ; i < 9 ; i ++) {
//			int result = i % 3;
//			System.out.println(result);
//		}

//		aBcDeF ... Z 출력
//		A = 65, a = 97
//		소문자값은 i%2 ==0, 대문자는 i%2==1
//		대문자값에는 i+65, 소문자값에는 i+97
//		반복횟수는 26번

//		for (int i = 0; i < 26; i++) {
//			int largeChar = i + 65;
//			int smallChar = i + 97;
		
//			boolean check = i % 2 == 0;
//			System.out.println((char)(check ? smallChar : largeChar));
//		}

//      for문 1번만써서 1단 ~ 9단까지
//		i+1 = 1 , 9이상일때 i+1 =2, 18이상일때 i+1 = 3 
//		9번 반복
//		0 1 2 3 4 5 6 7 8 = 1 
//		9 10 11 12 13 14 15 16 17 = 2 
//		18 19 20 21 22 23 24 25 26 = 3
		

	}
}
