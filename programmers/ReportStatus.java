package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReportStatus {
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k = 2; //정지 기준이 되는 횟수
		s.solution(id_list, report, k); //	[2,1,1,0]
		
		
	}
}

class Solution4 {
    public int[] solution(String[] id_list, String[] report, int k) {
    	Map<String, Integer> reportMap = new HashMap<>();
    	
//		만약 같은 유저에게 신고받았다면 목록을 1로 하여 count를 1로 취급
    	Set<String> set = new HashSet<>(Arrays.asList(report));
    	report = set.toArray(new String[0]);
    	
    	
//    	총 신고받은 횟수 구하기
    	for(int i = 0; i<id_list.length; i++) {
    		int count = 0;
    		
    		for(int j = 0; j<report.length; j++) {
    			String[] tmp = report[j].split(" ");

    			if(tmp[1].equals(id_list[i])) {
    				count++;
    			}
    		}
    		reportMap.put(id_list[i],count);
    	}
    	
//    	신고 기준을 넘친 유저 목록을 구하기
    	ArrayList<String> reportedUser = new ArrayList<String>();
    	for(String keys : reportMap.keySet()) {
    		int value = reportMap.get(keys);
    		if(value >= k) {
    			reportedUser.add(keys);
    		}
    	}
	
//    	정지되는 유저를 신고한 다른 유저 리스트 구한 후에 결과 메일의 개수 출력
    	int[] answer = new int[id_list.length];
		for(int i = 0; i<id_list.length; i++) {
			int count = 0;
			for(int j = 0; j<report.length; j++) {
				for(String user : reportedUser) {
					String[] tmp = report[j].split(" ");
//					report한 유저와 신고한 유저가 같다면 +를 하고 그 id에 숫자를 저장
					if(id_list[i].equals(tmp[0]) && tmp[1].equals(user)) {
						count++;
					}
				}
			}
			answer[i] = count;
		}
		System.err.println(Arrays.toString(answer));
        return answer;
    }
}