package CodingTestLv1;

import java.util.Random;
import java.util.Scanner;

public class baskinrobbinsGame {
	public static void main(String[] args) {
		
//게임의 참여자들은 차례를 정해 1부터 31까지의 수를 순차적으로 부른다.
//한번에 1~3개까지 수를 연달아 부를 수 있으며, 마지막 31을 부른 사람이 진다.

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int com = 2;
		System.out.println("컴퓨터의 숫자: " + com);
		int lose = 0 + com;
//		4 - n;
		while(lose!=30) {
			System.out.println("나의 숫자 입력:");
			int mynum = scanner.nextInt();
			if((0<mynum && mynum>3)) {
				System.out.println("1부터 3까지만 입력해주세요");
				break;
			}
			else {
			lose+=mynum;
			System.out.println("컴퓨터 숫자 입력:");
			int comnum = 4 - mynum;
			System.out.println(comnum);
			lose+=comnum;
			System.out.println("현재 숫자: " + lose);
			if(lose == 30) {
				System.out.println("다음숫자는 " + (lose+1) + "이므로 졌습니다");
				System.out.println();
			}
			}
		}
	}
}

