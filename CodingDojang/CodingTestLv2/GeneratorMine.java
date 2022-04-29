package CodingTestLv2;

import java.util.ArrayList;
import java.util.Arrays;

public class GeneratorMine {
	public static void main(String[] args) {
//어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
//예를 들어
//d(91) = 9 + 1 + 91 = 101
//이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
//어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다.
//그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다.
//예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.
//1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
		
		String[] str = new String[5000];
		ArrayList<String> str2 = new ArrayList<>();
		int result = 0;
		int resultfinal = 0;
		for(int i = 1; i<=5000; i++) {
			int count = 0;
			str[i-1] = i+"";
			for(int j = 1; j<=str[i-1].length(); j++) {
				count++;
				result += Integer.parseInt((String)(str[i-1].charAt(count-1)+"")); //length만큼 반복 고쳐야됨
				resultfinal = result + i;
			}
			str2.add(resultfinal + "");
			result = 0;
		}
		System.out.println("5000까지 제너레이터 합산 값 : " + str2);
		int selfnumberresult = 0;
		for(int i = 1; i<=5000; i++) {
			if(!str2.contains(str[i-1])) {
				selfnumberresult += i;
			}
		}
		System.out.println("셀프넘버 최종 합산 값: " + selfnumberresult);
		
		System.out.println((2530/10));
//		1227365
		
// 1~5000 까지
// generator 로 돌려서 각 값을 배열에 저장
// 그중 1~5000과 일치하지 않는 수를 골라낸다
// int 를 나눌 경우 소수점 이하는 계산에서 무시되므로 int를 사용
		
//        Integer a,b,c,d,result,sum=0;
//
//        boolean[] generated = new boolean[5000];
//
//        for(int generator=1; generator<5000;generator++){
//            a = generator/1000;
//            b = (generator/100)%10;
//            c = (generator/10)%10;
//            d = generator%10;
//
//            result = a+b+c+d+generator;
//
//            if((result>=1)&&(result<5000)){
//                generated[result] = true;
//            }
//        }
//
//        for(int i=1; i<5000; i++){
//            if(generated[i]==false){
//                sum = sum + i;
//            }
//        }
//
//        System.out.println("Self-Number의 합계는 : " + sum);
//
	}
}