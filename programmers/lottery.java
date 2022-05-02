package programmers;

public class lottery {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		s.solution(lottos, win_nums); //[3, 5] - 최고 순위, 최저 순위
	}
}

class Solution3 {
    public int[] solution(int[] lottos, int[] win_nums) {
    	
//    	최저 순위 구하기
// 		1등 번호와 일치하는 숫자 개수를 구하면 최저 순위가 나온다.   	
    	int min_num = 0;
    	int zero_num = 0;
    	for(int i = 0; i<lottos.length; i++) {
    		for(int j = 0; j<win_nums.length; j++) {
    			if(lottos[i] == win_nums[j]) {
    				min_num++;
    			}
    		}
//			나중의 0을 1등 번호와 맞출 것이므로 최저 순위 일치 개수와 더하면 최고 순위가 나온다.
    		if(lottos[i] == 0) {
    			zero_num++;
    		}
    	}
    	int max_num = min_num + zero_num;
    	int[] nums = {max_num, min_num};
		
//		순위	당첨 내용
//		1	6개 번호가 모두 일치
//		2	5개 번호가 일치
//		3	4개 번호가 일치
//		4	3개 번호가 일치
//		5	2개 번호가 일치
    	
//    	위의 당첨 순위를 기준으로 값을 return한다.
        int[] answer = new int[2];
        
        for(int i = 0; i<nums.length; i++) {
        	if(nums[i] == 6) {answer[i] = 1;}
        	else if(nums[i] == 5) {answer[i] = 2;}
        	else if(nums[i] == 4) {answer[i] = 3;}
        	else if(nums[i] == 3) {answer[i] = 4;}
        	else if(nums[i] == 2) {answer[i] = 5;}
        	else {answer[i] = 6;}
        }
        return answer;
    }
}