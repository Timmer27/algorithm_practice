
package CodingTestLv1;

import java.util.ArrayList;

public class fibonacciEvenNumberSum {
	public static void main(String[] args) {

//피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
		fibo f = new fibo();
		f.pibonumber(1, 2);
	}
}
//최종 출력
//4613732

class fibo{
	ArrayList<Integer> iarr = new ArrayList<>();
	int total = 0;
	
	void pibonumber(int a, int b) { //시작 숫자를 정해줌
		iarr.add(a);
		iarr.add(b);
		for(int i = 1 ;; i++) {
			iarr.add(iarr.get(i-1)+iarr.get(i));
			if(iarr.get(i-1)+iarr.get(i) > 4000000) {
				break;
			}
		}
		iarr.remove(iarr.size()-1); //뒤는 400만이 넘으므로 제거
		
		for(int i = 1 ;i<iarr.size(); i++) {
			if(iarr.get(i) % 2 == 0) {
				total += iarr.get(i);
			}
			System.out.println(total);
		}
	}
}