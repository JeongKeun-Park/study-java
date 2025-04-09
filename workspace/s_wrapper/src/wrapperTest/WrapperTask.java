package wrapperTest;

public class WrapperTask {
   public static void main(String[] args) {
//      1, 3.56, 'A', false, "ABC"
//      위 5개의 값을 하나의 배열에 모두 담고 출력한다.
	   int data = 1;
	   double data2 = 3.56;
	   char data3 = 'A';
	   boolean data4 = false;
	   String data_S = "ABC";
	   
	   Integer data_I = data;
	   Double data_D = data2;
	   Character data_C = data3;
	   Boolean data_B = data4;
	   
	   
	   Object[] list = {data_I, data_D, data_C, data_B, data_S};
	   
	   for(Object data1: list) {
		   System.out.println(data1);		   
	   }
   }
}