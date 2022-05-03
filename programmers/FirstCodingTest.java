package programmers;

import java.util.Arrays;

public class FirstCodingTest {
	public static void main(String[] args) {
	Solution s = new Solution();
	 int[][] i = {{ 1, 0, 0 }, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
	 s.solution(i,2);
//	 0번같은 경우 00 필요하고, 1번은 10,12  2번은 20, 21 3번 30,31  4번 40, 41, 5번 51,52
//	 = index = 4
//		System.err.println(" test : " + solution(i));
	}
//	인덱스를 구해서 인덱스 번호 숫자가 제일 높은 걸로 ㄱ, 기계의 숫자에 따라서 변동 생성할 수 있는 제일 장비개수를 구함
}

class Solution {
    public int solution(int[][] needs, int r) {
    	int[] score = new int[3];
    	
    	for(int i = 0; i<needs.length; i++) {
    		for(int j = 0; j<needs[i].length; j++) {
    			score[j] += needs[i][j];
    		}
    	}
    	int[] index = new int[r];
    	int max = score[0];
    	for(int i = 0; i<score.length; i++) {
    		if(score[i]>=max) {
    			index[0] = i;
    			max = score[1];
    		}
    		else {
    			if(score[i]>=max) {
    				index[1] = max;
    			}
    		}
    	}
    	int answer = 0;
    	for(int i = 0; i<needs.length; i++) {
			if(needs[i][index[0]] == 1 && needs[i][index[1]] == 1) {
				answer++;
    		}
    	}
        return answer+1;
    }
}


class Solution2 {
    public int solution(String[] scores) {
    	
//		지원자 F 2개 이상 받을 시 불합격
		int Fcount = 0;
		int Aanswer = 0;
		int answer = 0; 
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length(); j++) {
				if(String.valueOf(scores[i].charAt(j)).equals("F")) {
					Fcount++;
				}
				if(Fcount>=2) {
					continue;
				}
//				Fcount = 0;
			}
		}
//		위의 조건을 통과하고 A가 2개 이상일 시 합격
		if(Fcount<=2) {
			for(int i=0; i<scores.length; i++) {
				for(int j=0; j<scores[i].length(); j++) {
					if(String.valueOf(scores[i].charAt(j)).equals("A")) {
						System.err.println(scores[i].charAt(j));
						Aanswer++;
					}
				}
			}
			if(Aanswer>=2) {
				answer++;
			}
//			Aanswer = 0;
		}
		
//		위의 조건이 만족하지 않으면 각각 score의 평균 점수 3점 이상만 통과
//		if(Aanswer<=2)
		int scoreResult = 0;
		double scoreAvg = 0.0;
		for(int i=0; i<scores.length; i++) {
			char[] sorted = scores[i].toCharArray();
			Arrays.sort(sorted);
			String sortedScore = new String(sorted);
			
			for(int j=1; j<sortedScore.length()-1; j++) {
				String tmp = String.valueOf(sortedScore.charAt(j));
				
				if(tmp.equals("A")) {
					scoreResult+=5;
				}
				else if(tmp.equals("B")) {
					scoreResult+=4;
				}
				else if(tmp.equals("C")) {
					scoreResult+=3;
				}
				else if(tmp.equals("D")) {
					scoreResult+=2;
				}
				else if(tmp.equals("E")) {
					scoreResult+=1;
				}
			}
			scoreAvg = scoreResult/(Double)(sortedScore.length()-2.0);
			scoreResult=0;

			if(scoreAvg>=3) {
				answer++;
			}
		}		
		return answer;
    }
}
