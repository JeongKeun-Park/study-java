package k_bank;

// 입금 시 수수료 30%
public class Kookmin extends Bank{

	String bankName;
	
	public Kookmin() {;}

	public Kookmin(String memberName, int account, String phone, String password, int money, Shinhan[] shinhanUser,
			Kookmin[] kookminUser, Kakao[] kakaoUser, String bankName) {
		super(memberName, account, phone, password, money, shinhanUser, kookminUser, kakaoUser);
		this.bankName = bankName;
	}

	
	

}
