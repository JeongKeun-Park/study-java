package k_bank;

public class Bank {
//	변수
//	예금주
	private String name;

//	계좌번호
	private String account;

//	핸드폰번호
	private String phone;

//	비밀번호
	private String password;

//	잔액(통장)
	private int money;

//	은행명
	private String bankName;

	public Bank() {
		;
	}

	public Bank(String name, String account, String phone, String password, int money, String bankName) {
		super();
		this.name = name;
		this.account = account;
		this.phone = phone;
		this.password = password;
		this.money = money;
		this.bankName = bankName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	// 계좌번호 중복검사
	public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
//					Bank클래스를 자료형으로 사용한다.
		for (int i = 0; i < arrBank.length; i++) {
//			arrBank의 첫번째 배열에서 어디 은행인지를 검사한다.
			for (int j = 0; j < arCount[i]; j++) {
//				입력받은 arCount의 배열중에서
				if (arrBank[i][j].account.equals(account)) {
//					arrBank[i][j]를 반복하며 입력받은 account와 같은 문자가 있는지 확인한다.
					return arrBank[i][j];
//					확인이 된다면 그 arrBank[i][j]의 주소값을 리턴해준다
				}
			}
		}

		return null;
//		없다면 null로 리턴
	}

//	핸드폰번호 중복검사
	public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
		for (int i = 0; i < arrBank.length; i++) {
			for (int j = 0; j < arCount[i]; j++) {
				if (arrBank[i][j].phone.equals(phone)) {
					return arrBank[i][j];
				}
			}
		}

		return null;
	}

//	로그인
	public static final Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
//		checkAccount 메소드를 불러와서 계좌번호를 검사한다. 그값을 user에 담아준다
//		checkAccount의 리턴값은 유저의 정보를 리턴해주기 떄문에 그 안에 password가 포함되어있다.
		if (user != null) {
			if (user.password.equals(password)) {
//				리턴받은 user값의 password가 입력받은것과 일치한다면
				return user;
//				user를 리턴해준다
			}
		}
		return null;
//		아닐경우 null
	}

//	입금
	public void deposit(int money) {
		this.money += money;
	}

//	출금
	public void withdraw(int money) {
		this.money -= money;
	}

//	잔액 조회
	public int showBalance() {
		return this.money;
	}
}
