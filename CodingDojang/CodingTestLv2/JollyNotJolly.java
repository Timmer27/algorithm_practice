
//n개의 정수(n>0)로 이루어진 수열에 대해 서로 인접해 있는 두 수의 차가 1에서 n-1까지의 값을 모두 가지면
//그 수열을 유쾌한 점퍼(jolly jumper)라고 부른다. 예를 들어 다음과 같은 수열에서
//
//1 4 2 3
//
//앞 뒤에 있는 숫자 차의 절대 값이 각각 3,2,1이므로 이 수열은 유쾌한 점퍼가 된다.
//어떤 수열이 유쾌한 점퍼인지 판단할 수 있는 프로그램을 작성하라.

//4 1 4 2 3
//5 1 4 2 -1 6
//※ 주의: 각 줄의 맨 앞의 숫자는 수열의 갯수이다. 첫번째 입력인 4 1 4 2 3 의 맨 앞의 4는 뒤에 4개의 숫자가 온다는 것을 의미함
//
//Sample Output
//
//Jolly
//Not jolly

package CodingTestLv2;

import java.util.Arrays;

public class JollyNotJolly {
	public static void main(String[] args) {
//		int[] a = {5,1,4,2,-1,6};
		int[] a = {4,1,4,2,3};
		Jollymethod(a);

	}
	static void Jollymethod(int[] a) {
		int count = 0;
		int[] alist = new int[a[0]-1];
		int[] blist = new int[a[0]-1];
		
		for(int i = 2; i<=a[0]; i++) {
			alist[i-2] = Math.abs(a[i-1] - a[i]);
		}
		Arrays.sort(alist);
		for(int i = 0; i<a[0]-1; i++) {
			blist[i] = i+1;
			if(blist[i]==alist[i]) {
				count+=0;
			}
			else {
				count++;
			}
		}
		if(count!=0) {
			System.out.println("not Jolly");
		}
		else {
			System.out.println("Jolly");
		}
	}
}
