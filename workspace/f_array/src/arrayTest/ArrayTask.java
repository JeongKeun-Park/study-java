package arrayTest;

import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		브론즈
//		1~10까지 배열에 담고 출력

//		int[] arNumber = new int[10];
//		
//		for(int i = 0 ; i < arNumber.length ; i ++) {
//			arNumber[i] = i+1 ;
//		}
//		
//		for(int i = 0 ; i < arNumber.length ; i ++) {
//			System.out.println(arNumber[i]); 
//		}
//		
//		10~1까지 중 짝수만 배열에 담고 출력

//		int[] arNumber = new int[5];
//		
//		for (int i = 0 ; i < arNumber.length ; i++) {
//			arNumber[i] = 10 - (i * 2) ;
//		}
//		
//		for (int i = 0 ; i < arNumber.length ; i++) {
//			System.out.println(arNumber[i]);
//		}

//		1~100까지 배열에 담은 후 홀수만 출력

//		int[] arNumber = new int[100];
//
//		for (int i = 0; i < arNumber.length; i++) {
//			arNumber[i] = i+1;
////			System.out.println(arNumber[i]);
//		}
//		
//		for (int i = 0; i < arNumber.length; i++) {
//			if(i%2==1) {
//				System.out.println(arNumber[i-1]);
//			}
//		}

//		실버
//		1 ~ 100까지 배열에 담은 후 짝수의 합 출력

//		int[] arNumber = new int[100];
//		
//		for (int i = 0; i < arNumber.length; i++) {
//			arNumber[i] = i + 1;
////			System.out.println(arNumber[i]);
//		}
//		
//		int evenTotal = 0;
//		
//		for (int i = 0; i < arNumber.length; i++) {
//			if(i%2==0) {
//				evenTotal += arNumber[i];
//			}
//		}
//		
//		System.out.println(evenTotal);

//		A~F까지 배열에 담고 출력
//		A = 65

//		int[] arWord = new int[6];
//		
//		for (int i = 0; i < arWord.length; i++) {
//			arWord[i] = i+65;
//		}
//		
//		for (int i = 0; i < arWord.length; i++) {
//			System.out.println((char)arWord[i]);
//		}

//		A~F까지 중 D제외하고 배열에 담은 후 출력

//		int[] arWordNotD = new int[5];
//		
//		for (int i = 0; i < arWordNotD.length; i++) {
//			arWordNotD[i] = i < 3 ?  i+65 :  i+66;			
//		}
//		
//		for(int i = 0; i<arWordNotD.length; i++) {
//			System.out.println((char)arWordNotD[i]);
//		}

//		골드

//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값을 출력

//		int[] arUserNumber = new int[5];
//
//		for (int i = 0; i < arUserNumber.length; i++) {
//			System.out.println(i + 1 + " 번 째 정수를 입력하세요.");
//			arUserNumber[i] = sc.nextInt();
//		}
//		5개정수 입력받고 배열에 담는다
//		for (int i = 0; i < arUserNumber.length; i++) {
//			System.out.println(arUserNumber[i]);
//		}
//		출력해서 배열에 잘 들어갔는지 확인

//		int greatThan = arUserNumber[0];
//		int lessThan = arUserNumber[0];
////		최대값과 최소값 담을 변수 생성
//
//		for (int i = 0; i < arUserNumber.length; i++) {
//			if (lessThan > arUserNumber[i]) {
//				lessThan = arUserNumber[i];
//			} else if (greatThan < arUserNumber[i]) {
//				greatThan = arUserNumber[i];
//			}
//		}
//
//		System.out.println(greatThan);
//		System.out.println(lessThan);

//		다이아
//		사용자가 칸 수를 입력하고, 그 칸수만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다(소수점 2째자리)

		System.out.print("칸 수를 입력하세요 : ");
		int[] arUserNumber = new int[sc.nextInt()];
//		System.out.println(arUserNumber.length);
		
		for (int i = 0; i < arUserNumber.length; i++) {
			System.out.print(i + 1 + "번 째 정수를 입력하세요 : ");
			arUserNumber[i] = sc.nextInt();
		}
		
		double total = 0;
		for (int i = 0 ; i < arUserNumber.length; i++) {
			total += arUserNumber[i];
		}
		
		double average = total/arUserNumber.length;
//		System.out.println(total/arUserNumber.length); 
		
		
		System.out.printf("평균 점수는 : "+ "%.2f" +"점 입니다.", average);
		
	}
}

