package CodingTestLv1;
public class Time3toSeconds {
	public static void main(String[] args) {
		int minutes = 0;
		for(int i = 1; i <= 24; i++) { //24시간 카운트
			if(i == 3 || i == 13 || i == 23) //3이 들어간 숫자는 60분으로 치환
				minutes += 60;
			
			else //3이 들어간 시간을 제외하고 나머지 시간을 분으로 치환
				for(int j = 0; j < 6; j++) { // 60분을 6번 반복
					if(j == 3) { //60분 중 3이 들어간 시간을 미리 10분으로 치환
						minutes += 10;
					}
					else
						minutes += 1; //60분간 3이 6개 반복되므로 나머지 6분 추가
				}
			System.out.println(minutes);
		}
	}
}

//출력문: 
//29700



//
//    int minute3 = 0; //3이 나오는 분이 몇분인지 카운트 
//
//    for(int h = 0; h < 24; h++){//시간루프 
//        if(h == 3 || h == 13 || h == 23){//시간부터 3이 있다면
//            minute3+=60;
//            continue;//1시간 추가 후 다음시간
//        } else
//			for(int m_10 = 0; m_10 < 6; m_10++){//시간에 3이 없다면 - 10분단위 루프
//            if(m_10 == 3){//30분이라면
//                minute3+= 10;
//                continue;//10분 추가 후 다음 10분
//            } else minute3++;//30분 아니면 1분 추가
//            }
//        }
//
//        System.out.println(minute3*60);
//    }
//}
//	