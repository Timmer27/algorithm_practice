package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class KNumber {
	public static void main(String[] args) {
		Solution12 s = new Solution12();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		s.solution(array, commands);
	}
}


class Solution12 {
    public int[] solution(int[] array, int[][] commands) {
//    	예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
//
//		array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//		1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//		2에서 나온 배열의 3번째 숫자는 5입니다.
    	
    	int[] arr = new int[commands.length];
    	
    	for(int i=0; i<commands.length; i++) {
    		int tmp = commands[i][1] - commands[i][0];
    		int[] new_array = new int[tmp+1];
    		
    		for(int j = commands[i][0], k = 0; j<=commands[i][1]; j++) {
    			new_array[k++] = array[j-1];
    		}
    		Arrays.sort(new_array);
    		
    		arr[i] = (new_array[commands[i][2]-1]);
    	}
        return arr;
    }
}