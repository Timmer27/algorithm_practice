package CodingTestLv2;

public class Number8Counting {
	
//1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
//8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
//(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)

	public static void main(String[] args) {
		counting('8');
		for(int i = 1; i <=10000; i++) {
			counting2(i);
		}
		System.out.println(count);
		
		System.out.println(808%10);
	}
	
	public static void counting(char ch){
		int count = 0;
		for(int i = 1; i <=10000; i++) {
			String[] str = new String[i];
			str[i-1] = (i + "");
			for(int j = 0; j<str[i-1].length(); j++) {
				if(str[i-1].charAt(j) == ch) {
					count++;
				}
				}
			}
		System.out.println(count);
	}
	static int count = 0;
//	static으로 count를 선언하지 않을 경우 count값이 counting2의 결과값이 초기화가 되어
//	원하는 값을 누적합 시킬 수 없다
	public static void counting2(int num) {
		if(num % 10 == 8) {
			count++;
		}
//		다시 메서드로 돌아가서 숫자가 10보다 작아질때까지 10으로 나눔
//		그 과정에서 %10을 하면 1자리수가 출력이되고 다시 10보다 클 경우에는 1자리수가 없어진
//		다음 2자리 수가 1자리 수가 되어서 8이 아닌지 맞는지 비교가 되는 코드
//		else if를 사용하지 않는 이유는 num의 결과가 8이 맞더라도 아래의 결과가 실행되어야 하기 때문에 일반 if를 씀
		if(num>10) {
			counting2(num/10);
		}
	}
	
}
