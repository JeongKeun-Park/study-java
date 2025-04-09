package lambdaTask;

import java.util.Scanner;

public class MyMath {
   public static Calc operate(String oper) {
      // oper가 +면 두 정수의 덧셈으로 구현하여 리턴
      // oper가 -면 두 정수의 뺄셈으로 구현하여 리턴
      return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
      String example = "예)9+7-5";
      String expression = null;
      String[] opers = null;
      String[] temp = null;
      int number1 = 0, number2 = 0;

      System.out.println(message);
      System.out.println(example);
      expression = sc.next();

//      사용자가 입력한 expression에서 +와 -를 추출한다.
      OperCheck operCheck = (e) -> {
         String result = "";
         // 하나씩 문자 검사해서 + 또는 -면 계속 연결
         for (int i = 0; i < e.length(); i++) {
            char c = e.charAt(i);
            if (c == '+' || c == '-') {
               result += c;
            }
         }
         return result.split("");
      };

      opers = operCheck.getOpers(expression);
      temp = expression.split("\\+|\\-");
      number1 = Integer.parseInt(temp[0].equals("") ? opers[0] + temp[1] : temp[0]);
      for (int i = 0; i < opers.length; i++) {
         if(i == 0 && number1 < 0) {continue;}
         number2 = Integer.parseInt(temp[i + 1]);
         number1 = MyMath.operate(opers[i]).calc(number1, number2);
      }
      
      System.out.println(number1);
   }
}

















