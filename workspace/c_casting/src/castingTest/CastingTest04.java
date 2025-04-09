package castingTest;

public class CastingTest04 {
	public static void main(String[] args) {
		
		System.out.println(Integer.parseInt("10") + 4);
//							클래스    메소드
		
//		결과가 6.0이 나오도록 형변환한다.
		
		String transform = "3.5";
		double number2 = 2.5;
		double number1 = Double.parseDouble(transform);
		double result = number1+ number2;
		
		System.out.println(result);
	}
}
