package k_bank;

//출금 시 수수료 30%
public class Kakao extends Bank{

	String bankName;
	
	public Kakao() {;}

	public Kakao(String memberName, int account, String phone, String password, int money, Shinhan[] shinhanUser,
			Kookmin[] kookminUser, Kakao[] kakaoUser, String bankName) {
		super(memberName, account, phone, password, money, shinhanUser, kookminUser, kakaoUser);
		this.bankName = bankName;
	}

	
	
}
