package programmers;

public class SumPlusMinus {
	public static void main(String[] args) {
		Solution11 s = new Solution11();
		
		int[] absolutes = {4,7,12};
		boolean[] signs = {true, false ,true};
		
		s.solution(absolutes, signs);
		
	}
}

class Solution11 {
    public int solution(int[] absolutes, boolean[] signs) {
    	
    	int sum = 0;
    	for(int i = 0; i<absolutes.length; i++) {
    		if(signs[i]) {
    			sum+=absolutes[i];
    		}
    		else {
    			sum+=(-absolutes[i]);
    		}
    	}
        return sum;
    }
}