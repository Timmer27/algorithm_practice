package CodingTestLv1;

public class VersionComparison {
	public static void main(String[] args) {
		String i = "1.1.2", j = "1.1.12222222";
		System.out.println(diff(i,j));
	}
		
	public static String diff(String str, String str2) {
		String Replacedstr = str.replace(".", "");
		String Replacedstr2 = str2.replace(".", "");
		if(Replacedstr.length() > Replacedstr2.length()) {
			int num = Replacedstr.length() - Replacedstr2.length();
			long str_2 = Integer.parseInt(Replacedstr2) * (int)(Math.pow(10, num));
			long str_1 = Integer.parseInt(Replacedstr);
			System.out.println(str_2);
			return (str_1 > str_2 ? str + " > " + str2 : str + " < " + str2);
		}
		else {
			int num = Replacedstr2.length() - Replacedstr.length();
			long str_2 = Integer.parseInt(Replacedstr2);
			long str_1 = Integer.parseInt(Replacedstr)  * (int)(Math.pow(10, num));
			return (str_1 > str_2 ? str + " > " + str2 : str + " < " + str2);
		}
	}
}
	
//		int diff = 0;
//		if(str.length() > str2.length()) {
//			diff = str.length() - str2.length();
//			int b = Integer.parseInt(str2) * (int)(Math.pow(10, diff));
//			int a = Integer.parseInt(str);
//			System.out.println(a > b ? i + " > " + j : i + " < " + j);
//			diff = 0;
//		}
//		else
//			diff = str2.length() - str.length();
//			int b = Integer.parseInt(str2);
//			System.out.println(b);
//			int a = Integer.parseInt(str) * (int)(Math.pow(10, diff));
//			System.out.println(a > b ? i + " > " + j : i + " < " + j);
//			diff = 0;
//	}
//}
	
//A씨는 두개의 버전을 비교하는 프로그램을 작성해야 한다.
//버전은 다음처럼 "." 으로 구분된 문자열이다.
//두 개의 버전을 비교하는 프로그램을 작성하시오.
//다음은 버전 비교의 예이다.
//
//0.0.2 > 0.0.1
//1.0.10 > 1.0.3
