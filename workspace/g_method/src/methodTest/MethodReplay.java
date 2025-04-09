package methodTest;

public class MethodReplay {
	// 1 ~ 10까지 println()으로 출력하는 메소드

	void printSum10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

	// "홍길동"을 n번 println()으로 출력하는 메소드
	
	void printHong(int number) {
		for(int i = 0 ; i < number ; i ++) {
			System.out.println("홍길동");
		}
	}

	// 이름을 n번 println()으로 출력하는 메소드
	
	void printMyName (String name, int number) {
		for(int i = 0 ; i < number ; i++) {
			System.out.println(name);
		}
	}

	// 세 정수의 뺄셈 메소드
	int subtract(int[] numbers) {
		int result = 0;
		numbers[0] *= -1;
		for (int i = 0 ; i<numbers.length; i++) {
			result -= numbers[i];
		}
		return result;
	}

	// 정수 1개를 입력받고, 차수도 입력받는다.
	// 해당 차수만큼의 값을 구해주는 메소드 선언
	int square(int number, int square) {
		int result = 1;
		for(int i = 0 ; i < square ; i ++) {
			result *= number;
		}
		return result;
	}

	// 두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
	// 반드시 리턴한다.
	int[] divide(int number1, int number2) {
		int[] result = null;

		if(number2 !=0) {
			result = new int[] {number1/number2, number1%number2};
		}
		return result;
	}

	// 두 정수의 덧셈과 뺄셈을 구해주는 메소드
	int[] addSubtract(int number1, int number2) {
		int[] result = null;
		
		result = new int[] {number1+number2, number1-number2};
		
		return result;
	}

	// 1 ~ n까지의 합을 구해주는 메소드
	int sum(int number) {
		int result = 0 ;
		for (int i = 0 ; i < number ; i ++) {
			result += i+1;
		}
		return result;
	}

	// 홀수는 짝수로, 짝수는 홀수로 리턴
	void change (int number) {
//		return ++number;
		int result = number % 2 == 0 ?number+1 : number + 1 ;
		String message = number % 2 == 0 ? "홀수로 변경" : "짝수로 변경" ;
		System.out.println(message + "\n" + result);
	}

	// 5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	
	int[] maxAndMin(int[] numbers) {
		int[] result = new int[2];
		int max = result[0];
		int min = result[1];
		max = numbers[0];
		min = numbers[0];
		
		for(int i = 0 ; i < numbers.length;i++) {
			if(result[0]<numbers[i]) {
				result[0] = numbers[i];
			}else {
				result[1] = numbers[i];
			}
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		MethodReplay m = new MethodReplay();
		int result = 0;
		int[] arResult = null;
		
		m.printSum10();
		
		m.printHong(4);
		
		m.printMyName("박정근", 4);
		
		result = m.subtract(new int[] {7,3,2});
		System.out.println(result);
		
		result = m.square(3, 4);
		System.out.println(result);
		
		arResult = m.divide(3, 4);
		System.out.println("몫 : " + arResult[0] + " 나머지 : " + arResult[1]);
		
		arResult = m.addSubtract(5, 2);
		System.out.println("덧셈 : " + arResult[0] + " 뺄셈 : " + arResult[1]);
		
		result = m.sum(10);
		System.out.println(result);
		
		m.change(12);
//		String message = result % 2 == 0 ? "홀수로 변경 되었습니다." : "짝수로 변경 되었습니다.";
//		System.out.println(message + "\n변환 값 : " + result);
		
		arResult = m.maxAndMin(new int[] {3,5,6,8,2});
		System.out.println("최대값 : " + arResult[0] + "\n최소값 : " + arResult[1]);
	}
}
