package abstractTest;

public abstract class Electronics {
	
//	무조건 재정의(구현) 해야한다
	public abstract void on();
	public abstract void off();
	
//	골라서 재정의 해도된다.
	public void printProduct() {
		System.out.println("전자제품");
	}
	
//	재정의 할 수 없다.
	public final void sos() {
		System.out.println("긴급 전화");
	}
}
