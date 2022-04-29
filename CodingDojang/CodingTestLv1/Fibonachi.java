package CodingTestLv1;
public class Fibonachi {
	public static void main(String[] args) {
//		예) 0, 1, 1, 2, 3, 5, 8, 13 21 34 55
//피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때
//이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.
		int count = 10;
		for(int i = 0; i<count; i++) {
			System.out.println(fibo(i));
		}
	}
	public static int fibo(int a) {
		if(a<2)
			return a;
		else
			return fibo(a-2) + fibo(a-1);
	}
}

