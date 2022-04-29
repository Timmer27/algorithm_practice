package programmers;

public class kakaonewID {
	public static void main(String[] args) {
//		1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//		2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//		3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//		4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//		5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//		6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//		     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//		7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		solution("...!@BaT#*..y.abcdefghijklm");
		solution("abcdefghijklmn.p");
	}
	
	
    public static String solution(String new_id) {
//	    대문자를 소문자로 변경
//	    정규식을 사용하여 해당 특수문자, 소문자, 숫자를 제외하고 출력
//		[]안에 ^를 써주면 not이라는 의미가 됨. \\써서 w즉 알파벳이 아닌 문자열과 -_.를 제외한 문자열을 공백으로 치환
		String result = new_id.toLowerCase().replaceAll("[^\\w\\-_.]", "");
		
//		문자열의 첫번째와 끝자리가 .이라면 제거.
//		^는 문자의 첫번째를 의미하고 |는 연산을 의미하며(필수) $는 끝을 의미
		result = result.replaceAll("\\.{2,}", ".").replaceAll("^[.]|[.]$", "");
		
//		제거한 후 0~15자리까지 출력
		if(result.length()>15) {
			result = result.substring(0, 15);
		}
//		결과값에서 마지막에 .이 있다면 제거
		result = result.replaceAll("[.]$", "");
		
//		만약 공백이라면 - 결과를 마치고 남는 값이 없다면 a를 대입 
		if(result.equals("")) {
			result = "aaa";
			return result;
		}

//		id가 2자리 이하라면 3자리가 될때까지 제일 뒷문자열을 더함
		if(result.length()<=2) {
            while (result.length() < 3) {
            	result += result.charAt(result.length()-1);
            }
		}
		System.err.println(result);
        return result;
    }
}


