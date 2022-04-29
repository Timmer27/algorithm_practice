package CodingTestLv1;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberMultiply {
	
	public static void main(String[] args) {
//		13 = 1 * 3 = 3
//		14 = 1 * 4 = 4
//		15 = 1 * 5 = 5
//
//		그러므로, 이 경우의 답은 3+4+5 = 12
		String[] str = new String [10];

		for(int i = 0; i<str.length; i++) {
			str[i] = ""+(i+20);
			
		}
		System.out.println(Arrays.toString(str));
		int result = 0;
		for(String list : str) {
			char[] tmp = list.toCharArray(); //toCharArray 잘쓰는듯?
			int mul = 1	;
//	연산이 2개 되고 다시 돌아가면서 전값을 가지므로다음 값에 곱해지는 것과 동일함
//	값을 곱한 후에 연산이 끝나면서 1로 돌아가기 때문에 다시 두번째 자리를 가진 값과 동일한 값을 가지고
// 	첫번째 자리로 곱해줄 수 있음
			for(char L : tmp) {
//				System.out.println(Character.getNumericValue(L));
				mul*=Character.getNumericValue(L);
//				System.out.println("곱셈값: "+mul);
			}
			result += mul;
//			System.out.println("순서: "+result);
		}
		System.out.println("\nresult: " + result);
		
//		두번째 스스로 풀어본거
//		String[] str = new String[100];
//		int result = 0;
//
//		for(int i = 0; i<str.length; i++) {
//			str[i] = "" + (i+10);
//			}
//		for(String list:str) {
//			char[] ch = list.toCharArray();
//			int mal = 1;
//			for(char items : ch) {
//				mal *= Character.getNumericValue(items);
//			}
//			result += mal;
//			System.out.println(result);
//		}
		
	}
}
