package CodingTestLv2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

//A사무실에는 특정일자의 출퇴근 시간이 기록된 거대한 로그파일이 있다고 한다.
//파일의 형식은 다음과 같다. (한 라인에서 앞부분은 출근시간(HH:MM:SS), 뒷부분은 퇴근시간이다)
//특정시간을 입력(예:11:05:20)으로 주었을 때 그 시간에 총 몇 명이 사무실에 있었는지 알려주는 함수를 작성하시오.

//09:12:23 11:14:35
//10:34:01 13:23:40
//10:34:31 11:20:10

// 임시 가정 path = C:\Users\gram\Desktop\새 폴더
// 임시 가정 로그 파일 이름 = shift.log
public class ShiftPeople {
	static ArrayList<String> strarr = new ArrayList<>();
	static ArrayList<Character> strarr2 = new ArrayList<>();
	public static void main(String[] args) {
		try {
			fileread("C:\\Users\\gram\\Desktop\\새 폴더", "shift.log");
		}
		
		catch (Exception e) {
			System.out.print("파일 읽기 실패 = ");
		}
		System.out.println(strarr);
		
	}
	static void fileread(String path, String filename) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(path + "\\" + filename),1024);
		String str;
		while((str = br.readLine()) != null) {
			strarr.add(str);
		}

		br.close();
	}
	
	static void filechange(ArrayList<String> str) {
		str.get(0).split(",");
	}
}
