package programmers;

public class unknownNumberSum {
	public static void main(String[] args) {
		Solution9 s = new Solution9();
		int[] numbers = {1,2,3,4,6,7,8,0}; //14
//		int[] numbers = {5,8,4,0,6,7,9}; //6
		s.solution(numbers);
	}
}

class Solution9 {
    public int solution(int[] numbers) {
    	int sum = 0;
    	int nums = 0;
    	
//    	원래 나와야 하는 총 합계
    	for(int i = 0; i<10; i++) {
    		sum+=i;
    	}
    	
//    	주어진 숫자의 합계
    	for(int i : numbers){
    		nums += i;
    	}
//		주어진 값을 빼서 값을 도출    	
        return sum-nums;
    }
}
