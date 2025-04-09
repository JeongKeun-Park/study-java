package k_bank;

// 입금 시 수수료 30%
public class Kookmin extends Bank{
	@Override
	public void deposit(int money) {
//		입금하는 메소드를 불러와서 money의 값을 입력받는다
		money *= 0.7;
//		입력받은 money값에 0.7을 곱해서 수수료 30%를 제한다
		super.deposit(money);
//		제한 money값을 다시 입금하는 메소드에 넣어준다.
	}
}
