package CodingTestLv2;
//모든 짝수번째 숫자를 * 로 치환하시오.(홀수번째 숫자,또는 짝수번째 문자를 치환하면 안됩니다.)
//Example: a1b2cde3~g45hi6 → a*b*cde*~g4*hi6

public class EvenNChange {
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		String ex = "a1b2cde3~g45hi6";
		for(int i = 0; i<ex.length(); i++) {
			if(i%2 !=0 && ('0'<= ex.charAt(i) && ex.charAt(i) <= '9')) {
//				매 2번째 문자 그리고 그 문자가 숫자일 경우 *을 대신 삽입
				result.append('*');
			}
			else {
				result.append(ex.charAt(i));
//				조건에 부합하지 않을경우 본래의 문자 삽입
			}
		}
		System.out.println(result);
	}
}
