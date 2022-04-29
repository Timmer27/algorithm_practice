package CodingTestLv2;

//일단 어떤 수를 받아서 그 수를 뒤집은 다음 뒤집어진 수를 원래의 수에 더하는 과정을 뒤집어서 더하기라고 부르자.
//그 합이 회문(palindrome, 앞뒤 어느 쪽에서 읽어도 같은 말이 되는 어구.
//		예:eye, madam, 소주만병만주소)이 아니면 회문이 될 때까지 이 과정을 반복한다.
//
//예를 들어 처음에 195에서 시작해서 다음과 같이 네 번 뒤집어서 더하기를 반복하면 9339라는 회문이 만들어진다.
//
// 195      786       1473      5214
//+591     +687      +3741     +4125
//----     -----     -----     -----
// 786     1473       5214      9339


public class ReverseAndAdd {
	public static void main(String[] args) {
		String finalresult = "";
		String num = "265";
//		StringBuilder result = new StringBuilder();
		String result = "";
		int count = 0;
		
		int tmp = 0;
		while(true) {
			count++;
			tmp = Integer.valueOf(num);
			String tmp2 = "";
			for(int i = num.length()-1; i>=0; i--) {
				tmp2 += num.charAt(i) + "";
			}
			tmp+=Integer.valueOf(tmp2);
			num = tmp+"";
			
			result = num +"";
//			result.append(num);
//			StringBuilder resultreversed = new StringBuilder();
			String resultreversed = "";
			for(int i = result.length()-1; i>=0; i--) {
//				resultreversed.append(result.charAt(i));
				resultreversed += result.charAt(i);
				}
			if(resultreversed.equals(result)) {
				break;
			}
		}
		System.out.println("회문 값: " + result);
		System.out.println("시도한 횟수: " + count);
	}
}
