package CodingTestLv1;
import java.util.ArrayList;
public class NumberCounting {
//	예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자
//	10 = 1, 0
//	11 = 1, 1
//	12 = 1, 2
//	13 = 1, 3
//	14 = 1, 4
//	15 = 1, 5
//	그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개
	public static void main(String[] args) {
		
		String[] str = {"10","11","12","13","14","15","99","57"};
		ArrayList<Character> chararr = new ArrayList<>();
		int i0=0, i1=0, i2=0, i3=0, i4=0, i5=0, i6=0, i7=0, i8=0, i9=0; 
		
		for(int i = 0; i<str.length; i++) {
			for(int j = 0; j<str[i].length(); j++) {
				chararr.add(str[i].charAt(j));
			}
		}
		for(int i =0; i<chararr.size(); i++) {
			switch (chararr.get(i) - '0') {
			case 0: {i0++; break;}
			case 1: {i1++; break;}
			case 2: {i2++; break;}
			case 3: {i3++; break;}
			case 4: {i4++; break;}
			case 5: {i5++; break;}
			case 6: {i6++; break;}
			case 7: {i7++; break;}
			case 8: {i8++; break;}
			case 9: {i9++; break;}
			}
		}
		System.out.println("0= " + i0 +" 1= "+i1 + " 2= "+i2 + " 3= "+i3 + " 4= "+i4);
		System.out.println("5= "+i5 + " 6= "+i6 + " 7= "+i7 + " 8= "+i8 + " 9= "+i9);
	}
}
