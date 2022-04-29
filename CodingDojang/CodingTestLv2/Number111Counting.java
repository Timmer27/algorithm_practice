package CodingTestLv2;

import java.util.Scanner;

//2나 5로 나눌 수 없는 0 이상 10,000 이하의 정수 n이 주어졌는데,
//n의 배수 중에는 10진수로 표기했을 때 모든 자리 숫자가 1인 것이 있다.
//그러한 n의 배수 중에서 가장 작은 것은 몇 자리 수일까?
// 말인 즉슨 3의 37배수는 111이므로 자리수가 3자리

//input
//3
//7
//9901

//output
//3
//6
//12

// 10으로 나누면 한자리가 없어지고(23 -> 2) %10 하면 앞자리가 출력(23 -> 3)
// 이 값을 조건으로 넣어서 1이 연속되는 자리수를 구하기
// 2 || 5로 못나눈다고 하는 조건을 조건문으로 넣기
public class Number111Counting {
	public static void main(String[] args) {
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(input==0) {
		try {
			System.out.println("2와 5의 배수를 제외한 숫자를 입력하세요");
			input = scanner.nextInt();
			if(input%2 == 0 || input%5 == 0) {
				throw new notvalidNumberException();
			}
			else if(input>10000) {
				throw new Exception();
			}
		}
//		======== 오류 처리 구문 ========
//		그냥 2와 5의 배수가 아니거나 10,000이 넘으면 Exception으로 반복문 재반복
		catch (notvalidNumberException e) {
			System.out.println("2와 5의 배수를 입력하지마세요.");
			input = 0;
			continue;
			}
		catch (Exception e) {
			System.out.println("10,000이상의 수를 입력하지마세요.");
			input = 0;
			continue;
			}
		} 
//		======== 오류 처리 구문 ========
		
//		======== 실제 코드 작성 구문 ========
		for(int i = 1 ;; i++) {
			StringBuilder tmp = new StringBuilder();
			tmp.append(i*input);
//			받은 input의 값을 배수로 구한 후에 String값으로 변환
			int count = 0;
			for(int j = 0; j<tmp.length(); j++) {
//				String값의 문자열 길이만큼 charAt으로 1이 맞는지 하나씩 비교
				if(tmp.charAt(j) =='1') {
					count++;
//					맞으면 count에 누적합
					}
				}
			if(count == tmp.length()) {
//				구한 count값이 배수의 길이와 동일하면 전부다 1이라는 의미이므로 아래에 그 결과값 도출
				System.out.println("값: " + tmp);
				System.out.println("값의 자리수: " + tmp.length());
				break;
			}
		}
//		======== 실제 코드 작성 구문 ========
	}
}
class notvalidNumberException extends RuntimeException{
	}

