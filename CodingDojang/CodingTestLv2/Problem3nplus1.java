package CodingTestLv2;

import java.util.ArrayList;

//어떤 정수 n에서 시작해, n이 짝수면 2로 나누고, 홀수면 3을 곱한 다음 1을 더한다.
//이렇게 해서 새로 만들어진 숫자를 n으로 놓고, n=1 이 될때까지 같은 작업을 계속 반복한다.
//예를 들어, n=22이면 다음과 같은 수열이 만들어진다.
//22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
//
//n이라는 값이 입력되었을때 1이 나올때까지 만들어진 수의 개수(1을 포함)를 n의 사이클 길이라고 한다.
//위에 있는 수열을 예로 들면 22의 사이클 길이는 16이다.

//i와 j라는 두개의 수가 주어졌을때, i와 j사이의 모든 수(i, j포함)에 대해 최대 사이클 길이를 구하라.

public class Problem3nplus1 {
	public static void main(String[] args) {

//		한개의 숫자에 대해 사이클 구하기
		int input = 900;

		ArrayList<Integer> result = new ArrayList<>();
		result.add(input);
		while(input>1) {
			if(input%2==0) {
				result.add(input/2);
				input/=2;
			}
			else {
				result.add((input*3)+1);
				input = (input*3)+1;
			}
		}
		System.out.println(result);
		System.out.println("사이클 길이: " + result.size() + "개");
		
		cyclemax(1000, 900);
//		1000(112) : 900(55) = 57개 만큼 차이
	}
	static void cyclemax(int i, int j) {
		if(cyclecount(i)>cyclecount(j)) {
			System.out.println(i + "(" + cyclecount(i) + ") : " + j + "(" + cyclecount(j) + ")" + " = " + (cyclecount(i)-cyclecount(j)) +"개 만큼 차이");
		}
		else {
			System.out.println(j + "(" + cyclecount(j) + ") : " + i + "(" + cyclecount(i) + ")" + " = " + (cyclecount(j)-cyclecount(i)) +"개 만큼 차이");
		}
	}
	static int cyclecount(int i) {
		int count1 = 0;
		while(i>1) {
			if(i % 2 == 0) {
				count1++;
				i/=2;
			}
			else {
				count1++;
				i=(i*3)+1;
			}
		}
		return count1+1;
	}
}