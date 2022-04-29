package CodingTestLv1;

public class Dividing {
	public static void main(String[] args) {

//1부터 10까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
	int result = 0;
	for(int i = 1;; i++) {
		for(int j = 1; j < 21; j++) {
			result += i % j;
		}
		if(result == 0) {
			System.out.println(i);
			break;
		}
		result = 0;
		}
	}
}

//232792560
