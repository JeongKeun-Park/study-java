package k_bank;

//잔액검사 시, 재산 반토막
public class Shinhan extends Bank{
	@Override
	public int showBalance() {
		setMoney(getMoney() / 2);
//		private 제어자로 되어있기 때문에 setter와 getter로 불러온다.
		return super.showBalance();
	}
}
