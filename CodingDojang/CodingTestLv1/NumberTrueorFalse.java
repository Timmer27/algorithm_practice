package CodingTestLv1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumberTrueorFalse{
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자 0-9까지 입력");
	String[] input = scanner.nextLine().split("");
//	String[]으로 scanner를 리스트값으로 변환, 입력값을 split으로 떨어트려서 String array로 변환

	ArrayList<String> strarr = new ArrayList<>(Arrays.asList(input));
//	Arrays.asList를 활용해 ()값에 넣어서 arraylist 값을 미리 선언
    Collections.sort(strarr); //collections을 선언할때는 s를 붙이고 sort는 배열을 오름차순 정렬
    System.out.println(strarr);
    int sum = 0;
    for(int i = 0; i<strarr.size()-1; i++) {
    	if(strarr.get(i).equals(strarr.get(i+1))){
//    		오름차순으로 정렬했기때문에 중복된 값은 바로 다음칸 앞에 간다.
//    		그걸 이용해서 겹치면 sum의 값을 추가하여 0 이상 값이면 중복값이라 판단하여 false 출력
    		sum++;
    		break; //겹쳐버리면 더 이상 출력할 의미가 없으므로 break, 안겹치면 true이므로 else 생략
    	}
    }
    System.out.println(sum>0 ? false : true);

	}
}

//public class Z_TestforRename2 {
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("0-9입력");
//		String [] input = scanner.nextLine().split(""); //split 함수로 사이에 간격을 둠
//		int sum = 0; 
//		Arrays.sort(input); //문자열을 오름차순으로 정렬
//			for(int i = 1; i<input.length; i++) {
//				if(input[i-1].equals(input[i])){ //정렬한 전의 값과 다음 값이 같으면 false
//					System.out.println(false);
//					System.exit(i);
//					}
//				else {
//					continue;
//			}
//		}
//			System.out.println(true);
//	}
//}