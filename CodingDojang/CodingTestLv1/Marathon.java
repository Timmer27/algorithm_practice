package CodingTestLv1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Marathon {
	public static void main(String[] args) {
//항상 일정한 속도로 달리는 기계가 있다고 합시다. 이 기계의 100m 달리기 기록을 입력받으면 마라톤에서의 기록을 구하시면 됩니다.
//마라톤 경기에서 달리는 거리는 42.195km입니다.
		int speedsec = 30;
		int meter = 100;
		int distance = (int)(42.195*1000);
		int totaltime = (distance / meter) * speedsec;
		
		System.out.println(distance);
		System.out.println(totaltime + "초");
		int hour = 0;
		int minutes = 0;
		int second = 0;
		
		while(totaltime!=0) {
			hour = totaltime / 3600;
			totaltime -= 3600*hour;
			minutes = totaltime/ 60;
			totaltime -= 60*minutes;
			second = totaltime;
			totaltime -=second;
		}
		LocalTime lt = LocalTime.of(hour, minutes, second);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		System.out.println(lt.format(df));
	}
}

