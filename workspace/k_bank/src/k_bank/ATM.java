package k_bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
//		2차원 배열(3행 100열)
		Bank[][] arrBank = new Bank[3][100];
//		각 은행의 회원수를 정한다
//		arrBank[i][j] i = 은행을 확인하기 위한 배열, j = 회원의 max수치
		int[] arCount = new int[3];
//		arCount의 칸수를 3칸으로 지정
		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		Bank user = null, temp = null;
		int bankNumber = 0, choice = 0;
		String account = "";
		String name = null;
		String password = null;
		String phone = null;
		String[] phoneNumbers = null;
		int money = 0;

		String[] arName = { "신한은행", "국민은행", "카카오뱅크" };
		String accountMessage = "계좌번호: ";
		String nameMessage = "예금주: ";
		String passwordMessage = "비밀번호(4자리): ";
		String phoneMessage = "핸드폰번호(- 포함): ";
		String depositMessage = "입금액: ";
		String withdrawMessage = "출금액: ";
		String errorMessage = "다시 시도해주세요.";
		String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";

		while (true) { // 초기화면을 계속해서 보여주어야 하기 떄문에 while문으로 시작
			System.out.println(message);
			bankNumber = sc.nextInt();
//			은행 리스트를 출력해주고 그중 원하는 은행을 입력받는다

			if (bankNumber == 4) {
				break;
//				나가기를 입력받으면 break
			}

			while (true) { // 은행을 선택했다면 하위 메뉴를 계속 보여주기 위해 while문을 쓴다.
				System.out.println(menu);
				choice = sc.nextInt();
//				메뉴 리스트를 출력해주고 회원이 원하는 목록을 입력받는다
				if (choice == 6) {
					break;
//					6번을 선택한다면 은행메뉴로 돌아가도록 break
				}

				switch (choice) {
				// 계좌 개설
				case 1: // 1번을 선택했을때
					account = ""; // 계좌번호의 자리를 공백으로 먼저 생성해놓는다
//					위에서 먼저 생성해 놓았지만 초기화 되지 않도록 스위치문 안에서 한번 더 선언한다.
					Bank[] arBank = { new Shinhan(), new Kookmin(), new Kakao() };
//					Bank의 첫번째 배열을 지정한다.
					user = arBank[bankNumber - 1];
//					유저가 선택한 번호-1 의 방이 유저가 원하는 은행

					while (true) {
						for (int i = 0; i < 6; i++) { // 비밀번호 6자리를 위해 for문 6번을 돌린다
							account += r.nextInt(10); // 0~9까지의 랜덤한 숫자를 위해 account에 하나씩 쌓아준다.
						}
						if (Bank.checkAccount(arrBank, arCount, account) == null) {
//							계좌 중복검사를 실행해보고 그 값이 null이라는 뜻은 중복이라는 뜻이기 떄문에
							break;
//							break로 if문을 탈출한다.
						}
					}

					account = bankNumber + account;
//					계좌번호에 회원이 선택했던 bankNumber를 붙여줘서 계좌번호로도 은행을 알 수 있도록한다.

					user.setAccount(account);
					user.setBankName(arName[bankNumber - 1]);
//					Bank의 account와 bankName이 private 제어자가 달려있기 때문에
//					setter를 불러와서 생성된 account와 bankName을 담아준다.

					System.out.println(nameMessage);
					name = sc.next();
//					예금주의 이름을 입력받고

					while (true) {
						System.out.println(phoneMessage);
						phone = sc.next();
//						핸드폰 번호를 입력받는다.
						phoneNumbers = phone.split("-");
//						핸드폰 번호를 입력 받았을때 "-"도 같이 입력 받았기에 검사에 편의성을 위해
//						split메소드로 "-"를 제거해준다
						if (phoneNumbers.length == 3) {
//							phoneNumbers의 타입은 String[]이고 "-"를 제거 했기 떄문에
//							총 3칸의 배열에 담긴다. 그렇기 떄문에 phonNumber의 길이가 3칸일때
//							if문을 실행할 수 있도록 한다.
							if (phoneNumbers[0].length() == 3) {
//								첫번째 phoneNumber의 길이가 3일때
								if (phoneNumbers[1].length() == 3 || phoneNumbers[1].length() == 4) {
//								두번째 phoneNumber의 길이가 3이거나 4일때
									if (phoneNumbers[2].length() == 4) {
//								세번째 phoneNumber의 길이가 4일때
										phone = phone.replaceAll("-", "");
//										replaceAll로 공백을 -로 다시 바꿔준다
										temp = Bank.checkPhone(arrBank, arCount, phone);
//										Bank temp 에 핸드폰 중복검사의 값을 넣어준다
										if (temp == null) {
//											null이라는 뜻은 중복이라는 의미이기 때문에 break
											break;
										}
									}
								}
							}
						}

						System.out.println(errorMessage);
//						break로 탈출 후 오류 메세지를 출력한다.

					}
					user.setPhone(phone);
//					정상적으로 되었다면 입력받은 phone값을 유저의 Phone에 넣어준다

					while (true) {
						System.out.println(passwordMessage);
						password = sc.next();
//						비밀번호를 입력받는다. 비밀번호의 자리는 4자리로 설정
						if (password.length() == 4) {
//							비밀번호가 4자리가 맞는지 length로 검사
							break;
//							맞다면 break
						}

						System.out.println(errorMessage);
//						아니라면 오류메세지를 출력한다
					}

					user.setPassword(password);
//					검사가 끝나고나면 user의 비밀번호를 입력받은 password로 설정해준다.

					arrBank[bankNumber - 1][arCount[bankNumber - 1]] = user;
//					유저를 arrBank의 배열에 맞게 담아준다.
//					arCount가 무엇을 의미하는지 이해가 잘 안감
					
					arCount[bankNumber - 1]++;
					
					for(int i = 0 ; i < arrBank[bankNumber-1].length; i++) {
						
						System.out.println(arrBank[bankNumber-1][i]);
					}
					System.out.println(arName[bankNumber - 1] + " 가입을 진심으로 환영합니다!");
					System.out.println(name + "님의 소중한 계좌번호: " + account);
					break;

//				입금하기
				case 2:
					System.out.println(accountMessage);
					account = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);
					
					System.out.println(user.getAccount().charAt(0));

					if (user != null) {
						// 계좌를 개설한 은행인지 검사
						if (bankNumber != user.getAccount().charAt(0) - 48) {
//							account의 첫째자리 문자열을 추출하여 계좌번호의 첫번째 자리를 확인한다.
//							첫번재자리는 어떤은행인지를 나타내기 때문에 1,2,3 중 하나가 나오게 된다.
//							이는 문자 '1','2','3' 이란 값으로 추출되기떄문에 48을 빼주어 정수로 변환한다.
							System.out.println(user.getBankName() + "에서만 입금 서비스를 이용하실 수 있습니다.");
//							유저를 검사하면서 그 안의 은행이름도 같이 있기 때문에 각 은행에서만 입금 할 수 있다는 말이 출력된다.
							break;
						}

//						아래와 같은 검사는 사실상 불가능하다.
//						if (bankType instanceof Shinhan) {
//							depositCheck = user instanceof Shinhan;
//							
//						} else if (bankType instanceof Kookmin) {
//							depositCheck = user instanceof Kookmin;
//							
//						} else if (bankType instanceof Kakao) {
//							depositCheck = user instanceof Kakao;
//							
//						}
//
//						if(!depositCheck) {
//							if(user instanceof Shinhan) {
//								bankName = "신한은행";
//								
//							}else if(user instanceof Kookmin) {
//								bankName = "국민은행";
//								
//							}else if(user instanceof Kakao) {
//								bankName = "카카오뱅크";
//								
//							}
//							
//							System.out.println(bankName + "에서만 입금 서비스를 이용하실 수 있습니다.");
//							break;
//						}

						System.out.println(depositMessage);
						money = sc.nextInt();

						user.deposit(money);
//						user가 Bank 클래스 타입이기 때문에 국민은행이면 입금 수수료가 빠지는 메소드로 바뀐다.
//						Kookmin클래스가 Bank클래스로 up casting 되면서 메소드가 재정의된 메소드로 변환한다.
						break;
					}
					System.out.println(errorMessage);
					
					break;

//				출금하기
				case 3:
					System.out.println(accountMessage);
					account = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);
//					Login 메소드는 회원의 정보를 담고있기 떄문에 입력한 account와 password에 맞는 회원 정보를 확인하고 리턴해준다.

					if (user != null) {
						System.out.println(withdrawMessage);
						money = sc.nextInt();

						if (money * (user instanceof Kakao ? 1.3 : 1) <= user.getMoney()) {
//							유저의 클래스중에 Kakao 클래스가 속해있다면 출금하는 돈의 1.3배, false값이라면 원래 입력한 돈의 값
							user.withdraw(money);
							break;
						}
					}
					
					System.out.println(errorMessage);
					break;
//				잔액조회
				case 4:
					System.out.println(accountMessage);
					account = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);

					if (user != null) {
						System.out.println(user.showBalance());
						break;
					}

					System.out.println(errorMessage);
					break;

//				계좌번호 찾기
				case 5:
					account = "";
					System.out.println(phoneMessage);
					phone = sc.next();
					phone = phone.replaceAll("-", "");
//					핸드폰번호를 - 를 포함해서 입력받고 -를 ""으로 바꿔준다.
					
					System.out.println(passwordMessage);
					password = sc.next();
					
					user = Bank.checkPhone(arrBank, arCount, phone);
					if(user != null) {
						if(user.getPassword().equals(password)) {
							if (bankNumber != user.getAccount().charAt(0) - 48) {
								System.out.println(user.getBankName() + "에서 계좌를 찾으실 수 있습니다.");
								break;
							} // 해당 은행에서 계좌를 찾을 수 있도록 하는 if문
//							위의 값이 fals라면 밑의 while문으로 들어간다.
							while (true) {
								for (int i = 0; i < 6; i++) {
									account += r.nextInt(10);
								}
								if (Bank.checkAccount(arrBank, arCount, account) == null) {
									break;
								}
							}

							account = bankNumber + account;

							user.setAccount(account);
							System.out.println(name + "님의 소중한 계좌번호: " + account);
						}
					}
					
					break;

				default:
					System.out.println(errorMessage);
				}
			}
		}
	}
}












