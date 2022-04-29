package CodingTestLv1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Others {
	public static void main(String[] args) {
//		3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간값을 가지는 숫자를 출력하세요.
//		ex1) 2, 5, 3 => 3 ex2) 4, 6, 4 => 4
		
		StringBuilder sb = new StringBuilder();
		ArrayList<String> str3 = new ArrayList<>();
		
		String str = "1357911";
		String[] str2 = str.split("");
		
		for(String items : str2) {
			str3.add(items);
		}
		
		Collections.sort(str3);
		System.out.println(str3);
		System.out.println(str3.get(str3.size()/2));
		
//네이버 글자수세기 등 특정 글의 글자를 세는 프로그램은 일반적으로
//공백을 제외한 글자수만을 세는 기능도 가지고 있다.
//어떠한 문자열을 입력받았을 때 줄바꿈과 공백을 제외한 글자수만을 리턴하는 코드를 작성하시오.
		System.out.println("=====================다음문제=====================");
		String text = "공백을 제외한\r\n"
				+ "글자수만을 세는 코드 테스트";
		String ReplacedText = "";
		String ReplacedText2 = "";
		String ReplacedText3 = "";
		ReplacedText = text.replace(" ", "");
		ReplacedText2 = ReplacedText.replace("\r", "");
		ReplacedText3 = ReplacedText2.replace("\n", "");
		
		System.out.println(ReplacedText3);
		System.out.println(ReplacedText3.length());
		
//배열 [a, b, c, d]를 입력하면 각각의 배열을 곱한
//[b*c*d, a*c*d, a*b*d, a*b*c]를 출력하는 코드를 작성하시오.
//(단, 나눗셈 사용 금지)
//입출력되는 배열은 어떤 형식이든 상관없습니다.
		System.out.println("=====================다음문제=====================");
		
		int a = 3, b = 5, c = 9, d =12;
		for(int i = 0; i<4; i++) {
			int tmp = 0;
			tmp = a;
			a = b;
			b = c;
			c = d;
			d = tmp;
			System.out.printf("A는 %d B는 %d C는 %d D는 %d", a,b,c,d);
			System.out.printf("\n본인 빼고 3개 곱한 값: %d", a*b*c);
			System.out.println();
		}
		
//철이는 아스키코드에 대해 공부하고있었습니다.
//하지만 기억력이 좋지않아 순서를 잊어먹게되는탓에 프로그램을 하나 만들어두려합니다.
//문자를 입력받으면 그 문자에 해당하는 아스키코드를 출력하는 코드를 작성해주세요.
//		a는 아스키코드로 97입니다.
//		d는 아스키코드로 100입니다.
//		A는 아스키코드로 65입니다.
		System.out.println("=====================다음문제=====================");
		
		char ch = 'A';
		System.out.printf("해당 %c의 아스키 코드는 %d 입니다.\n",ch,(int)ch);
		
//키보드가 조그만하고 안좋은지라 문자열만 딱빼서 숫자만 반환하는 코드를 만들고싶어한다
//ex: xxx : 1627000000 > xxx : 1w627r00o00p00 만 (특수문자제외)
		System.out.println("=====================다음문제=====================");
		
		String strnum = "1w627r00o00p00";
		String strnum2 = "";
		
		for(int i = 0; i<strnum.length(); i++) {
			if('0'<= strnum.charAt(i) && strnum.charAt(i)<='9') {
				strnum2+=strnum.charAt(i);
			}
		}
		System.out.println(strnum2);
		
//		혹은 이 방법이 제일 간편함 > 단 3줄 OMG
		String strnum3 = "";
		strnum3 = strnum.replaceAll("[^0-9]", "");
		System.out.println(strnum3);
					
//홍길동은 사용자가 입력한 양의정수 각 자리수를 더해 출력하는 프로그램을 만들고 싶어한다.
//ex) 5923의 결과는 5+9+2+3인 19이다 ex) 200의 결과는 2+0+0인 2이다
//ex) 6719283의 결과는 6+7+1+9+2+8+3인 36이다.
		System.out.println("=====================다음문제=====================");

		int result = 0;
		String strr = "10000";
		for(int i = 0; i<strr.length(); i++) {
			result += (int)(strr.charAt(i) - '0');
		}
		System.out.println(result);
		
//퇴근시간까지 남은시간을 알려주는 계산기 (현우의퇴근시간은 17시30분)
//input: 현재시간
//output: 남은시간 : hh:mm:ss
		System.out.println("=====================다음문제=====================");
		
//		 LocalDate nowdate = LocalDate.now();
//		 System.out.println(nowdate);
//		 LocalTime nowtime = LocalTime.now();
//		 System.out.println(nowtime);
//		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
//		 System.out.println(nowtime.format(dtf));
		
		differtime df = new differtime();
		df.fhour = 10;
		df.fminutes = 50;
		
		df.finaltime();
	}
}

class differtime{
	LocalTime ct = LocalTime.now();
	
	int fhour;
	int fminutes;
	private int currenthour = ct.getHour();
	private int currentminutes = ct.getMinute();
	
	int rhour;
	int rminutes;
	
	void finaltime() {
		try {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		rminutes = fminutes - currentminutes;
		rhour = fhour - currenthour;
		LocalTime finaltime = LocalTime.of(rhour, rminutes);
		if(rhour == 0 && rminutes < 30) 
			System.out.println("곧 퇴근시간!");
		else
			System.out.println(finaltime.format(dtf));}
		catch (Exception e) {
			System.out.println("퇴근안해?");
		}
		finally {
			System.out.println("하루하루 열심히 살자");
		}
	}
}

