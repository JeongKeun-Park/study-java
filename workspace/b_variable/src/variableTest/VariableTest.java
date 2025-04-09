package variableTest;

public class VariableTest {
	public static void main(String[] args) {
		int age = 10;
		float floatNumber = 10.1563F;
//		F를 붙이기 전에는 8byte F를 붙여줘야 4byte가 된다.
		double doubleNumber = 10.1563;
		char grade = 'A';
		String data = "ABC";
		
		age = 30;
		
		System.out.println(age);
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		System.out.println(grade);
		System.out.println(data);
	}
}
