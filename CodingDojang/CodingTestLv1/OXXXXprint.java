package CodingTestLv1;

public class OXXXXprint{
public static void main(String[] args) {
//	OOOOOX
//	OOOOXX
//	OOOXXX
//	OXXXXX
//	XXXXXX
	
	int i, j, k;
	int number = 6;
	int f = number -1;
	for(i = 0; i<number; i++) {
		for(j = 0; j<number-(i+1); j++) {
			System.out.print("O");
			}
		for(k = 0; k<number - j; k++){
			System.out.print("X");
			}
		System.out.println();
		}
	}
}
