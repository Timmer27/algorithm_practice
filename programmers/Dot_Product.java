package programmers;

public class Dot_Product {
	public static void main(String[] args) {
		Solution10 s = new Solution10();
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		s.solution(a, b);
	}
}

class Solution10 {
    public int solution(int[] a, int[] b) {
    	
    	int sum = 0;
    	for(int i = 0; i<a.length; i++) {
    		sum += a[i] * b[i];
    	}
        return sum;
    }
}