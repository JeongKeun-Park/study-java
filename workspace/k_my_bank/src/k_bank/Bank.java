package k_bank;

import java.util.Random;

public class Bank {
//	변수
//	예금주
//	계좌번호
//	핸드폰번호
//	비밀번호
//	잔액(통장)
	
	

	String memberName;
	int account;
	String Phone;
	String password;
	int money;
	Shinhan[] shinhanUser;
	Kookmin[] kookminUser;
	Kakao[] kakaoUser;

	public Bank() {
		;
	}

	public Bank(String memberName, int account, String phone, String password, int money, Shinhan[] shinhanUser,
			Kookmin[] kookminUser, Kakao[] kakaoUser) {
		super();
		this.memberName = memberName;
		this.account = account;
		Phone = phone;
		this.password = password;
		this.money = money;
		this.shinhanUser = shinhanUser;
		this.kookminUser = kookminUser;
		this.kakaoUser = kakaoUser;
	}

//	메소드
//	계좌 개설
	public int accountOpen(String memberName, int account, String Phone, String password, int money) {
		Random random = new Random();
		int accountOpen = random.nextInt(1000000);
		System.out.print(accountOpen);
		System.out.println();
		return accountOpen;
	}

//	계좌번호 중복검사
	public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, int account) {
		return null;
	}

//	핸드폰번호 중복검사
	public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
		return null;
	}

//	로그인
	public static final Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		return null;
	}

//	입금
	public void deposit(int money) {

	}

//	출금
	public void withdraw(int money) {

	}

//	잔액 조회
	public int showBalance() {
		return 0;
	}
}
