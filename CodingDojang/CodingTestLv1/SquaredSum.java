package CodingTestLv1;

public class SquaredSum {
	public static void main(String[] args) {
//		1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다
//		(제곱의 합). 1^2 + 2^2 + ... + 10^2 = 385 1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다
//		(합의 제곱). (1 + 2 + ... + 10)^2 = 55^2 = 3025 따라서 1부터 10까지 자연수에 대해
//		합의 제곱과 제곱의 합 의 차이는 3025 - 385 = 2640 이 됩니다.
//		그러면 1부터 100까지 자연수에 대해 합의 제곱과 제곱의 합의 차이는 얼마입니까?
		
		long squaretotal = 0;
		int sum = 0;
		int sum2 = 0;
		int sumtotal = 0;
		for(int i = 1; i<= 100; i++) {
			squaretotal += Math.pow(i, 2);
			sum += i;
		}
		sumtotal += Math.pow(sum, 2);
		System.out.println("제곱의 합: " + squaretotal);
		System.out.println("합의 제곱: " + sumtotal);
		System.out.println("두 값의 차: " + Math.abs(squaretotal - sumtotal));
		
        for(int i=1;i<=100;i++){
            sum2+=(i*i);
        }
        System.out.println(sum2);
	}
}

