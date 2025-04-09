package printTest;

public class Printest {
	public static void main(String[] args) {
		
//		주석(CTRL + /)
//		1. 소스코드에 설명글을 작성할 때
//		2. 지금 당장 사용하지 않는 코드를 번역하고 싶지 않을때
		
//		제어 문자
//		반드시 따옴표 안에서 작성한다.
//		\n : new line, 줄바꿈, 개행문자
//		\t : tab, 위 아래 줄 간격 맞춰 띄기
//		\" : 쌍 따옴표 표현
//		\' : 작은 따옴표 표현
//		\\ : 역슬래시 표현
//		System.out.print("\"한동석\"\n");
//		System.out.print("\\20살\\\n");
//		
//		System.out.println("\\n을 사용하면 줄바꿈 할 수 있습니다.");
//		System.out.println("줄바꿈 되었습니다.");
		
		String name = "한동석";
		int age = 20;
//		키 150.45를 변수에 담기
		double height = 150.45;
		
//		서식 문자
//		반드시 따옴표 안에 작성한다.
		
//		%d : decimal, 10진수 정수
//		%o : octal, 8진수 정수
//		%x : hexadecimal, 16진수 정수
//		%f : float, 실수
//		%c : character, 문자
//		%s : String, 문자열
		
		System.out.printf("이름 : %s\n", name);
//		서식문자는 printf만 사용 가능하다.
		
//		나이, 키, 출력하기
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.2f", height);
	}
}