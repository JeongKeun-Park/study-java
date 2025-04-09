package k_bank;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Shinhan shinhan = new Shinhan();
		
		Kookmin kookmin = new Kookmin();
		
		Kakao kakao = new Kakao();
		
		Bank bankTotal = new Bank();
		Bank[][] arrBank = new Bank[3][100];
		
		
		Scanner sc = new Scanner(System.in);
//		2차원 배열(3행 100열)
		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";

		System.out.println(message);
		System.out.print("은행 선택 : ");
		int choiceBank = sc.nextInt();
//		choiceBank = 1 , Shinhan
//		choiceBank = 2 , Kookmin
//		choiceBank = 3 , Kakao
		
		System.out.println(menu);
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
//			계좌개설
			System.out.println("계좌개설");
			shinhan.account = shinhan.accountOpen("박정근", 0, "010-74478469", "dev123", 1000);
			System.out.println("==========================");
			System.out.println();
		}else if (choice == 2) {
//			입금하기
			System.out.println("입금하기");
		}else if (choice == 3) {
//			출금하기
			System.out.println("출금하기");
		}else if (choice == 4 ) {
//			잔액조회
			System.out.println("잔액조회");
		}else if (choice == 5) {
//			계좌번호 찾기
			System.out.println("계좌번호 찾기");
		}else if (choice == 6) {
//			은행 선택 메뉴로 돌아가기
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}
}
