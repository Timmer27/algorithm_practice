
package CodingTestLv1;

import java.util.ArrayList;

public class Abstract_ArithmeticInsert {
//문자열 내에서 홀수가 연속되면 두 수 사이에 - 를 추가, 짝수가 연속되면 * 를 추가
//(예, 454 => 454, 4546793 => 454*67-9-3)
//입력 - 화면에서 숫자로 된 문자열을 입력받는다.
   public static void main(String[] args) {
	   
//	   ??????????????????????????????????????
	   ArrayList<String> strlist= new ArrayList<>();
	   String input = "46813";
	   String[] str = input.split("");
	   String str2 = "";
	   
	   
	   for(int i = 0; i<input.length();i++) {
		   strlist.add(str[i]);
		   System.out.println(strlist);
	   }
	   for(int i = 0; i<strlist.size() - 1 ;i++) {
		  if(Integer.parseInt(strlist.get(i)) % 2 == 0 && Integer.parseInt(strlist.get(i+1)) % 2 == 0) {
			  System.out.println(true);
		  	strlist.add(i+1, "*");
		  System.out.println(strlist);
		  }
		  else if(Integer.parseInt(strlist.get(i)) % 2 == 1 && Integer.parseInt(strlist.get(i+1)) % 1 == 0) {
			  System.out.println(true);
			  strlist.add(i+1, "-");
			  System.out.println(strlist);
	   }
	   }
   }
}
	   
      
	   
	   
	   
//ArrayList<String> num = new ArrayList<String>();
//String input = "466879";
//String[] array = input.split("");
//
//for(int l = 0; l<array.length; l++) {
//	num.add(l,array[l]);
//	System.out.println(num);
//      for(int k = 0; k<num.size()-1; k++) {
//         if(num.get(k).contentEquals("-") || num.get(k).contentEquals("?")) {
//        	 System.out.println(num);
//             continue;
//         }
//         else if(Integer.parseInt(num.get(k))%2 == 0 && Integer.parseInt(num.get(k+1))%2 == 0) {
//            num.add(k+1,"?");
//         }
//         else if(Integer.parseInt(num.get(k))%2==1 && Integer.parseInt(num.get(k+1))%2 == 1) {
//            num.add(k+1,"-");
//         }
//      }
//      for(String j : num) {
//         System.out.print(j);
//      }
