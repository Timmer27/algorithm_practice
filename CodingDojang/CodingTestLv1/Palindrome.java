package CodingTestLv1;

import java.util.ArrayList;
import java.util.Collections;

//앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 부릅니다.
//두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
//세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?

public class Palindrome {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		ArrayList<String> str2 = new ArrayList<>();
		
		String str = "";
		for(int i = 100; i<1000; i++) {
			for(int j = 100; j<1000; j++) {
				sb.append((i*j) + "");
				str = (i*j) + "";
				if(str.substring(0, 3).equals(sb.reverse().substring(0,3))
						&& str.length() >= 6) {
					str2.add(str);
					}
				sb.setLength(0);
				}
			}
		Collections.sort(str2, Collections.reverseOrder());
		System.out.println(str2.get(0));
	}
}