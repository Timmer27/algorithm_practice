package CodingTestLv2;

//1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오.
//(단 점들의 배열은 모두 정렬되어있다고 가정한다.)
//예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다.

public class ShortDistance {
	public static void main(String[] args) {
		
		int[] s={1, 13, 17, 18, 22, 25};
		System.out.println(findmin(s));
	}
//	==================== 정리 ==================== 
//	최초의 배열 뺀 값을 변수(prevtmp)에 저장하고 새로운 값(tmp)을 받아서 계속 연산하여 prevtmp랑 비교
//	만약 새 값(tmp)이 저장변수(prevtmp)보다 작다면 값을 대입하여 result 값에 저장
//	만약 더 작은값이 있다면 prevtmp값에 값을 새로 저장함으로써 그 작은값으로 연산을 함
//	연산 값이 prevtmp 보다 크다면 연산을 하지 않으므로(else가 없음) result값을 보존하여 출력
	static String findmin(int[] arr) {
	int tmp = 0; //1
	int prevtmp = 0; //9
	String result = null;

	for(int i = 0; i<arr.length-1; i++) {
		tmp = arr[i+1] - arr[i]; //9
			if(result != null) {
				if(tmp < prevtmp) { //9<2
//				이 때 if를 두번 넣는 이유는 tmp가 prevtmp보다 작을 경우 아래를 출력하여 result 값을 보존하고
//				작지 않을 경우 else문을 의도적으로 없애서 result 값 overriding이 되는 것을 방지
					prevtmp = tmp;
//					작을 경우 prevtmp 값을 tmp값으로 덮어씌워서 더욱 작은 값만 prevtmp으로 대체하고
//					구하는 새로운 값(tmp)이랑 작은값을 대조하도록 프로그래밍
					result = "(" + arr[i] + "," + arr[i+1] + ")";
				}
			}
			else {
//				처음에 할당해줄 prevtmp 값이 필요하므로 result 값을 null로 주어서 아래 else문을 먼저 실행
				prevtmp = tmp;
				System.out.println(prevtmp);
				result = "(" + arr[i] + "," + arr[i+1] + ")";
			}
		}
	return result;
	}
}