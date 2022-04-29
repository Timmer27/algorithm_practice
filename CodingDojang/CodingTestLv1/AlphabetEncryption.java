package CodingTestLv1;

import java.util.Scanner;

public class AlphabetEncryption {
	public static void main(String[] args) {
//시저 암호는, 고대 로마의 황제 줄리어스 시저가 만들어 낸 암호인데
//예를 들어 알파벳 A를 입력했을 때, 그 알파벳의 n개 뒤에 오는(여기서는 예를 들 때 3으로 지정하였다)알파벳이 출력되는 것이다
//예를 들어 바꾸려는 단어가 'CAT"고, n을 5로 지정하였을 때 "HFY"가 되는 것이다.
//어떠한 암호를 만들 문장과 n을 입력했을 때 암호를 만들어 출력하는 프로그램을 작성해라.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("대문자 3개 입력");
		String input = scanner.nextLine();
		
		if(65<=input.charAt(0) && input.charAt(0)<96) {
			String str = ""; //빈 String 값
			for(int i = 0; i<input.length(); i++) {
				str += ( (char)(input.charAt(i) + 5) + "");
				//인트값 더하고 char로 형변환 후 ""공백더해서 String화
			}
			System.out.println(str);
		}
		else {
			System.out.println("대문자만 입력");
			return;
		}
	}
}


//		하나씩 char 뽑아서
//		인트 값을 각각더하고
//		다시 형변환 시켜서 빈 STR에 대입

//char ch = 'A'; // 65 =! 32
//char ch2 = 'a'; // 97
//System.out.println((char)(ch2 - 32)); = A