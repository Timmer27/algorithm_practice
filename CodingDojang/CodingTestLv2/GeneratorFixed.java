package CodingTestLv2;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneratorFixed {
	public static void main(String[] args) {
//어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
//예를 들어
//d(91) = 9 + 1 + 91 = 101
//이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
//어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다.
//그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다.
//예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
//1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
		int a, b, c, d, result;
		int total = 0;
		
		boolean[] isCheck = new boolean[5000];
		for(int i = 1; i<5000; i++) { //아래랑 길이좀 맞추자 종호야, 맨날 exception ㅅㅂ
			a = i/1000;
			b = (i/100)%10;
			c = (i/10)%10;
			d = i%10;
			result = (a+b+c+d+i);
			
			if(0<result && result <5000) { // 그지같은 out of bound
				isCheck[result] = true;
			}
		}
		for(int i =0 ; i<5000; i++) {
			if(isCheck[i] == false) {
				total += i;
			}
		}
		System.out.println(total);
	}
}
//		1227365
