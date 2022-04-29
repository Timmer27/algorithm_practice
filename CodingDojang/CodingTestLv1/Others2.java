package CodingTestLv1;

import java.util.Scanner;

public class Others2 {
	public static void main(String[] args) {
//문자와 숫자가섞인 문자열을 입력받을때 구별하여출력해라
//input:"c910m6ia 1ho"
//output: str : cma ho, int : 91061
		
		String input = "c910m6ia 1ho";
		String inputint = "";
		String inputString = "";
		
		inputint = input.replaceAll("[^0-9]", "");
		System.out.println(inputint);
		inputString = input.replaceAll("[0-9]", "");
		
		System.out.println(inputString.replace(" ", ""));
//output: 91061. cmiaho

		System.out.println("=====================다음문제=====================");
		
//만약 숫자를 입력하였으면 그것이 정수인지, 소수인지 구별하는 프로그램을 짜보도록 하고,
//만약 문자를 입력하였으면 숫자가 아니므로 math error를 표시하게 하라.
//		Scanner scanner = new Scanner(System.in);
		System.out.println("입력");
		double input2 = 3.1;
		System.out.println(input2);
		try {
//			double input2 = scanner.nextDouble();
			int inputint2 = (int)input2;
			if(inputint2 - input2 == 0) {
				System.out.println("정수");
			}
			else {
				System.err.println("소수");
			}
		} catch (Exception e) {
			System.out.println("math error");
		}
		
		
		System.out.println("=====================다음문제=====================");
		
//		% 구현하기
		int[] alist = {6,432,4,635,421,122,143};
		for(int j = 0; j<alist.length; j++) {
			System.out.printf("본래값 =%3d ",alist[j]);
		}
		System.out.println();
		int dividen = 6;
		for(int j = 0; j<alist.length; j++) {
			for(;;) {
				alist[j]-=dividen;
				if(alist[j]<=dividen-1) {
					if(alist[j]<0) {
						alist[j]+=dividen;
						break;
						}
				}
			}
			System.out.printf("변환값 =%3d ",alist[j]);
		}
		
		
		
		
	}
	
}

