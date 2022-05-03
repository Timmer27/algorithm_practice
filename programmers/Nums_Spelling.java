package programmers;

public class Nums_Spelling {
	public static void main(String[] args) {
		Solution5 s1 = new Solution5();
		String s = "one4seveneight";
//		String s = "123";
		s1.solution(s); //1478
//		0	zero
//		1	one
//		2	two
//		3	three
//		4	four
//		5	five
//		6	six
//		7	seven
//		8	eight
//		9	nine
	}
}

class Solution5 {
    public int solution(String s) {
    	
//    	만약 숫자밖에 없다면 그 자체를 return
    	if(s.length() == 0) {
    		return Integer.valueOf(s);
    	}
    	
    	String[] spell_list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	
    	for(int i = 0; i<spell_list.length; i++) {
    		if(s.contains(spell_list[i])) {
    			s = s.replaceAll(spell_list[i], i+"");
    		}
    	}
    	int answer = Integer.valueOf(s);
        return answer;
    }
}
