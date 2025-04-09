package k_bank;

//잔액검사 시, 재산 반토막
public class Shinhan extends Bank {

	String bankName;

	public Shinhan() {
		;
	}

	public Shinhan(String memberName, int account, String phone, String password, int money, Shinhan[] shinhanUser,
			Kookmin[] kookminUser, Kakao[] kakaoUser, String bankName) {
		super(memberName, account, phone, password, money, shinhanUser, kookminUser, kakaoUser);
		this.bankName = bankName;
	}

	

}
