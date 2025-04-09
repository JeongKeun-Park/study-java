package methodTest;

public class MethodTask {

//    1 ~ 10까지 println()으로 출력하는 메소드
   void print1To10() {
      for (int i = 0; i < 10; i++) {
         System.out.println(i + 1);
      }
   }

//    "홍길동"을 n번 println()으로 출력하는 메소드
   void printHong(int n) {
      for (int i = 0; i < n; i++) {
         System.out.println("홍길동");
      }
   }

//    이름을 n번 println()으로 출력하는 메소드
   void printName(int n, String name) {
      for (int i = 0; i < n; i++) {
         System.out.println(name);
      }

   }

//   세 정수의 뺄셈 메소드
//   			 자료형	배열명
   int substract(int[] arData) {
      int result = 0;
      arData[0] *= -1;
//      result -= arData[i] 에서 0번방이 음수로 나오기 때문에
//      0번방의 값을 양수로 바꾸기 위해서 -1을 곱한다.
      for (int i = 0; i < arData.length; i++) {
//    	  i의 반복횟수를 arData.length만큼 제한
         result -= arData[i];
      }
      return result;
//      result의 자료형이 int이기 떄문에 메소드의 자료형도 int
   }

//   정수 1개를 입력받고, 차수도 입력받는다.
//   해당 차수만큼의 값을 구해주는 메소드 선언
   
   int square(int number, int degree) {
      int result = 1;
//      초기값이 0이면 곱해도 0이기떄문에 1로 설정
      for (int i = 0; i < degree; i++) {
         result *= number;
      }
      return result;
   }

//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//   반드시 리턴한다.
   int[] divide(int number1, int number2) {
      // 배열도 하나의 자료형으로 보자!
      // int[], double[], String[]... 모든게 자료형이다.

      int[] result = null;

      if (number2 != 0) {
//    	  0이면 나눌수 없기 때문에 조건식이 0이 아닐때로 설정
         result = new int[] { number1 / number2, number1 % number2 };
//         배열 선언과 동시에 값을 넣어준다
//         값의 갯수만큼 자동으로 방 생성
      }

      // 리턴값은 단 1개이다.
      // 여러 개를 리턴한다면 꼭 묶어서 보내자
      return result;
//      null이나 result = new int[] { number1 / number2, number1 % number2 }를 리턴한다.
   }

   // 두 정수의 덧셈과 뺄셈을 구해주는 메소드
   int[] getResult(int number1, int number2) {
      return new int[] { number1 + number2, number1 - number2 };
//      배열명에 넣지 않아도 바로 선언이 왜 되는거지?
   }

   // 1 ~ n까지의 합을 구해주는 메소드
   int getTotal(int end) {
      int total = 0;
      for (int i = 0; i < end; i++) {
         total += i + 1;
      }
      return total;
   }
   
   // 홀수는 짝수로, 짝수는 홀수로 리턴
   int change(int number) {
      return ++number;
   }
   
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
   int[] getMaxAndMin(int[] arData) {
// 자료형   			  자료형  배열명
//		매개변수의 자료형에 배열을 사용하지 않고 int를 사용하여 5개의 정수를 받지 않는 이유
//	  	배열을 쓰지 않고 각각 값을 받게되면 for문을 사용할 수 없기때문에? 
      int[] result = new int[2];
//      최대값과 최소값을 배열에 담기위해 새로운 배열을 생성한다.
      
      result[0] = arData[0];
//      최대값
      result[1] = arData[0];
//      최소값
      
      for (int i = 0; i < arData.length; i++) {
//    	  입력받은 배열의 길이만큼 반복
         if(result[0] < arData[i]) {
            result[0] = arData[i];
         }
         if(result[1] > arData[i]) {
            result[1] = arData[i];
         }
      }
      
      return result;
   }

//   ★ 고수만 하기
//   위에서 해결한 문제를 아래의 방법으로 해결한다.
//   리턴 타입은 void로 설정하고, 사용하는 부분에서 메소드 내부의 결과값을 사용할 수 있도록 구현
//   void increase(int[] data) {
//	   data[0] = 20;
//   }
////   값은 공유하지 않지만 주소값은 공유한다.
   
   void getMaxAndMin(int[] arData, int[] result) {
	      result[0] = arData[0];
	      result[1] = arData[0];

	      for (int i = 0; i < arData.length; i++) {
	         if (result[0] < arData[i]) {
	            result[0] = arData[i];
	         }
	         if (result[1] > arData[i]) {
	            result[1] = arData[i];
	         }
	      }
	   }


   public static void main(String[] args) {
      MethodTask m = new MethodTask();
      int[] arData = {1, 3, 6, 2, 7};
      int[] arResults = new int[2];
      
//      int[] data = {10};
//      m.increase(data);
//      System.out.println(data[0]);
      
      int result = 0;
      int[] arResult = null;
      String message = null;

      m.print1To10();
      m.printHong(10);
      m.printName(10, "한동석");

      result = m.substract(new int[] { 1, 3, 5 });
      System.out.println(result);

      result = m.square(2, 10);
      System.out.println("==============");
      System.out.println(result);
      System.out.println("==============");

      arResult = m.divide(10, 3);

      if (arResult == null) { 
    	  // 0을 입력했을경우 메소드의 if문을 실행하지 않고 null로 리턴값이 나온다.
         System.out.println("0으로 나눌 수 없습니다.");
      } else {
         System.out.println("몫: " + arResult[0] + ", 나머지: " + arResult[1]);
      }

      arResult = m.getResult(10, 4);
      System.out.println(arResult[0] + ", " + arResult[1]);

      message = m.change(10) % 2 == 0 ? "짝수로 변경되었습니다." : "홀수로 변경되었습니다.";
      System.out.println(message);
      
      arResult = m.getMaxAndMin(new int[] { 1, 3, 5, 9, 10 });
      
      System.out.println("최대값: " + arResult[0] + ", 최소값: " + arResult[1]);
      
   }
}


















