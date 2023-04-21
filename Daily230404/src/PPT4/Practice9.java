package PPT4;

public class Practice9 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int k36_iNumVal = 1001034567;	//1001034567을 정수형 변수로 선언
		String k36_sNumVal = String.valueOf(k36_iNumVal);	//문자열로 형변환하여 String변수에 할당함
		String k36_sNumVoice = ""; 	//String형 변수 선언, 빈 문자열
		System.out.printf("==> %s [%d자리]\n", k36_sNumVal, k36_sNumVal.length());
		//문자열을 %s로, 문자열의 자릿수를 정수형인 %d로 출력
		
		int k36_i, k36_j;	//정수형 변수 선언
		
		String [] k36_units = {"영","일","이","삼","사","오","육","칠","팔","구"};	//문자열 배열 선언, 숫자의 한글표시 10개를 값으로 할당함
		String [] k36_unitX = {"","십","백","천","만","십","백","천","억","십"};	//문자열 배열 선언, 숫자단위의 한글표시 10개를 값으로 할당함
		
		k36_i = 0;	//i는 0, 루프횟수를 카운트하는 변수
		k36_j = k36_sNumVal.length() - 1;	//j는 문자열의 길이에서 -1한 값, 배열unitX의 마지막변수부터 차례대로 읽어들인다
		
		while(true) {
			if(k36_i >= k36_sNumVal.length()) break;	//루프의 횟수가 문자열의 길이수와 일치하면 루프를 벗어난다
			
			System.out.printf("%s[%s]", k36_sNumVal.substring(k36_i, k36_i+1), k36_units[Integer.parseInt(k36_sNumVal.substring(k36_i, k36_i+1))]);
										//substring으로 문자열의 i번째 문자를 한개씩 뽑아와서 출력(숫자)
									//Integer.parseInt함수로 문자열에서 뽑아온 i번째 문자를 정수형 숫자로 변환하여 units배열에서 해당되는 변수(한글단위) 출력
			
			if(k36_sNumVal.substring(k36_i, k36_i+1).equals("0")) {	
				//substring함수로 뽑아온 sNumVal문자열의 i번째 문자가 0일 때
				
					if(k36_unitX[k36_j].equals("만") || k36_unitX[k36_j].equals("억")) {	//unitX배열의 j번째 변수가 만이거나 억일때
						
						k36_sNumVoice = k36_sNumVoice + "" + k36_unitX[k36_j];		//해당자리가 0이면 단위만 붙여준다
					
					} else {
						//억, 만자리 외에는 해당자리가 0이어도 단위값을 붙이지 않는다
					}
			} else {
				k36_sNumVoice = k36_sNumVoice + k36_units[Integer.parseInt(k36_sNumVal.substring(k36_i, k36_i+1))] + k36_unitX[k36_j];
				//substring함수로 뽑아온 sNumVal문자열의 i번째 문자가 0일 때 이외에는 해당숫자값과 단위값을 모두 붙여준다				
			}
			k36_i++; 	//i는 0부터 시작하여 루프마다 1씩 증가하며 루프의 횟수를 카운트한다
			k36_j--;	//j는 문자열의 길이에서 -1한 값으로 루프마다 1씩 감소한다, unitX에서 읽어들일 변수를 앞으로 한자리씩 당긴다

		}
		System.out.printf("\n %s[%s]\n", k36_sNumVal, k36_sNumVoice);
	}
}