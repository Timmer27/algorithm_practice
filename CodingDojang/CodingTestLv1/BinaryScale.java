package CodingTestLv1;

public class BinaryScale {
	public static void main(String[] args) {
		
//2진법이란, 어떤 자연수를 0과 1로만 나타내는 것이다.
//예를 들어 73은 64(2^6)+8(2^3)+1(2^0)이기 때문에 1001001으로 표현한다.
//어떤 숫자를 입력받았을 때 그 숫자를 2진법으로 출력하는 프로그램을 작성하시오.
		
		StringBuilder sb = new StringBuilder();
		int num = 73;
		while(num>0) {
			sb.append(num % 2); //뒤에서부터 2의 남은 몫을 구하기 때문에
			num/=2; //남은 몫을 구하고 2로 나눠서 다음 몫을 구함
		}
		System.out.println(sb.reverse()); //마지막에 reverse 함수를 써줌
	}
}
