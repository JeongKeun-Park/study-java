package castingTest;

public class CastingTest03 {
	public static void main(String[] args) {
		int result = 4;

		System.out.println("" + 3);
		System.out.println("1" + 3 + 8);
//		문자열이 들어간 순간부터 그 안에있는 값들은 전부 문자열로 변환된다.
//		따라서 3+8이 연산이 아닌 연결이 되기때문에 위 출력 내용물은 138이다.
		System.out.println("1" + (3 + 8));
//		문자열이 들어갔을때 문자열을 연결이아닌 연산으로 변경시키기 위해서는 소괄호로 감싸주어야한다.
		System.out.println("1 + 3 = " + result);
	}
}
