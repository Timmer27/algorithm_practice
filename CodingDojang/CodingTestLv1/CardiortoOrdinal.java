package CodingTestLv1;

public class CardiortoOrdinal {
	public static void main(String[] args) {
//		1, 21, 31, 41, ... → 1st, 21st, 31st, 41st, ...
//		2, 22, 32, 42, ... → 2nd, 22nd, 32nd, 42nd, ...
//		3, 23, 33, 43, ... → 3rd, 23rd, 33rd, 43rd, ...
//		11, 12, 13, 111, 112, 113, ...  → 11th, 12th, 13th, 111th, 112th, 113th,  ...
//		4, 5, 6, 11, 12, 13, 101, 111, 112, ... → 4th, 5th, 6th, 11th, 12th, 13th, 101th, 111th, 112th, ...
		
		int[] s = {1,3,2,21, 31, 11, 12, 13, 111, 112, 113,114};
		for(int i = 0; i<s.length; i++){
			if(s[i] %10 == 1 && s[i]%100 != 11) {
				System.out.println(s[i] + "st");
			}
			else if(s[i] %10 == 2 && s[i]%100 != 12) {
				System.out.println(s[i] + "nd");
			}
			else if(s[i] %10 == 3 && s[i]%100 != 13) {
				System.out.println(s[i] + "rd");
			}
			else {
				System.out.println(s[i] + "th");
			}
		}	
	}
}

