package k_bank;

//출금 시 수수료 30%
public class Kakao extends Bank{
	@Override
	public void withdraw(int money) {
		money *= 1.3;
		super.withdraw(money);
	}
}
