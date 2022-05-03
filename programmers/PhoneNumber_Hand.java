package programmers;

public class PhoneNumber_Hand {
	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}; //2 5 => R 
		String hand = "right"; //"LLRLLRLLRL"
		s.solution(numbers, hand);
		
	}
}

class Solution7 {
    public String solution(int[] numbers, String hand) {
    	StringBuilder sb = new StringBuilder();

//    	각 번호의 최종 좌표를 구해서 절대값, 즉 위치 절대값을 구한다음에 더 큰 수에게 R L을 준다
//    	먼저 시작위치의 값을 초기화
    	int leftIndex = 10;
    	int rightIndex = 12;
    	
    	for(int i=0; i<numbers.length; i++) {
    		if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
    			sb.append("L");
    			leftIndex = numbers[i];
    		}	
    		else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
    			sb.append("R");
    			rightIndex = numbers[i];
    		}
			else {
				int leftN = coordinates(leftIndex, numbers[i]);
				int rightN = coordinates(rightIndex, numbers[i]);
				
				if(leftN > rightN) {
					sb.append("R");
					rightIndex = numbers[i];
				}
				else if(leftN < rightN) {
					sb.append("L");
					leftIndex = numbers[i];
				}
				else {
					if(hand.equals("right")) {
						sb.append("R");
						rightIndex = numbers[i];
					}
					else {
						sb.append("L");
						leftIndex = numbers[i];
					}
				}
			}
		}
    	return sb.toString();
	}
    
//  절대 좌표 구하는 메서드, 큰 절대좌표가 더 멀다는 뜻
    private static int coordinates(int index, int number) {
    	
		// 숫자 0의 경우 11로 치환
		index = (index == 0) ? 11 : index;	
		number = (number == 0) ? 11 : number;

		int x = (index - 1) / 3;
		int y = (index - 1) % 3;
		int numberX = number / 3;
		int numberY = 1;

		return Math.abs(x-numberX) + Math.abs(y-numberY);
    }
}