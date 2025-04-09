package methodTest;

import java.util.Arrays;
import java.util.Scanner;

public class MethodPractice {
//	세 정수의 곱셈

	int multiply(int[] arData) {
		int result = 1;
		for (int i = 0; i < arData.length; i++) {
			result *= arData[i];
		}
		return result;
	}// 끝

//	정수 2개를 입력받고 각각 차수도 입력받는다
//	각각의 차수만큼의 값을 구해주는 메소드

	int[] square(int[] numbers, int[] degrees) {
		int resultNumber1 = 1;
		int resultNumber2 = 1;

		for (int i = 0; i < degrees[0]; i++) {
			resultNumber1 *= numbers[0];
		}

		for (int i = 0; i < degrees[1]; i++) {
			resultNumber2 *= numbers[1];
		}
		return new int[] { resultNumber1, resultNumber2 };
	}

//	//   두 정수의 덧셈과 뺄셈을 배열에 담아 출력
	int[] plusMinus(int[] number) {
		int plus = number[0] + number[1];
		int minus = number[0] - number[1];
		return new int[] { plus, minus };
	}
//		리턴값을 변수에 담아서 뺴는게 더 깔끔하다.

//	이름과 나이를 n번 출력

	void info(String name, int age, int number) {
		for (int i = 0; i < number; i++) {
			System.out.println("이름 : " + name + "\n나이 : " + age);
		}
	}

//  배열칸수를 n개만큼 입력받아 출력
	void userArray(int number) {
		Scanner sc = new Scanner(System.in);
		int[] arDatas = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.print(i + 1 + "번째 배열의 정수: ");
			arDatas[i] = sc.nextInt();
		}
		System.out.println("입력된 배열 : " + Arrays.toString(arDatas));
	}

//  하나의 배열에 두 요소를 입력받아 낮은 정수 부터 높은정수까지 출력
	void arNumbers(int number1, int number2) {
		int[] arNumbers = null;

		if (number1 > number2) {
			arNumbers = new int[(number1 - number2) + 1];
			for (int i = 0; i < arNumbers.length; i++) {
				arNumbers[i] = number2++;
				System.out.println(i + 1 + "번 째 정수 :" + arNumbers[i]);
			}
		} else {
			arNumbers = new int[Math.abs(number2 - number1) + 1];
			for (int i = 0; i < arNumbers.length; i++) {
				arNumbers[i] = number1++;
				System.out.println(i + 1 + "번 째 정수 :" + arNumbers[i]);
			}
		}
	}

//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] numbers(int[] numbers) {
		int[] result = new int[2];
		int max = result[0];
		int min = result[1];
		max = numbers[0];
		min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			} else {
				min = numbers[i];
			}
		}
		return new int[] {max, min};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodPractice m = new MethodPractice();
		int result = 0;
		int[] arResult = null;

		result = m.multiply(new int[] { 3, 4, 6, 8 });
		System.out.println(result);

		arResult = m.square(new int[] { 3, 5 }, new int[] { 3, 4 });
		System.out.println("첫 번쨰 : " + arResult[0] + ", " + "두 번째 : " + arResult[1]);

		arResult = m.plusMinus(new int[] { 6, 4 });
		System.out.println("덧셈 : " + arResult[0] + ", " + "뺄셈 : " + arResult[1]);

		m.info("박정근", 32, 5);

//		System.out.println("배열의 갯수를 입력하세요 : ");
//		int number = sc.nextInt();
//		m.userArray(number);

//		System.out.print("첫 번째 정수 :");
//		int number1 = sc.nextInt();
//		System.out.print("두 번째 정수 :");
//		int number2 = sc.nextInt();
//		m.arNumbers(number1, number2);

		arResult = m.numbers(new int[] { 9, 2, 6, 8, 4 });
		System.out.println("최대값 : " + arResult[0] + "\n최소값 : " + arResult[1]);

	}
}
