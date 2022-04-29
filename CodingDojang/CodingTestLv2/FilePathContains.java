package CodingTestLv2;

import java.io.File;

public class FilePathContains {
	
	static int count;
	
	//A라는 디렉토리 하위에 있는 텍스트 파일(*.txt) 중에서
	//LIFE IS TOO SHORT 라는 문자열을 포함하고 있는 파일들을 모두 찾을 수 있는 프로그램을 작성하시오.
	//단, 하위 디렉토리도 포함해서 검색해야 함.
	
//	path A는 아래로 가정
//	C:\workplace\java\previousfile\New22.1.8\TimPersonal
//	임의로 LIFE IS TOO SHORT.txt 파일을 3개 숨겨놓음
	
	public static void main(String[] args) {
		filecheck("C:\\workplace\\java\\previousfile\\New22.1.8\\TimPersonal");
		System.out.println("총 파일 개수: " + count);
		
	}
	
	static void filecheck(String pathA) {
		File f = new File(pathA);
		for(File flist : f.listFiles()) {
			 if(flist.isDirectory()) {
				 filecheck(flist.getAbsolutePath().toString());
//				 toString으로 매개변수에 들어갈 수 있도록 변환
			 }
			 else if(flist.isFile()) {
				 if(flist.getName().endsWith(".txt")) {
					 count++;
					 System.out.println("주소값: "+flist.getAbsolutePath());
					 System.out.println("파일 이름: " + flist.getName());
				}
			}
		}
	}
}