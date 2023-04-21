package PPT4;

public class Practice11 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		double k36_fSin;	//실수형 변수 선언
		
		for(int k36_i = 0; k36_i < 360; k36_i++) {	//정수형 변수 i는 0도부터 360도 전까지 루프마다 1도씩 증가
			k36_fSin = Math.sin(k36_i * 3.141592 / 180);
			//1도는 Pi/360이므로 i도는 i*Pi/360, Math라이브러리의 sin함수를 이용하여 0부터 359도까지 sin값을 구할 수 있다
			System.out.printf("%d sin ==> %f\n", k36_i, k36_fSin);	//i도와 i도의 sin값을 출력
		}
		
		for(int k36_i = 0; k36_i < 360; k36_i++) {	//정수형 변수 i는 0도부터 360도 전까지 루프마다 1도씩 증가
			
			k36_fSin = Math.sin(k36_i * 3.141592 / 180);
			//1도는 Pi/360이므로 i도는 i*Pi/360, Math라이브러리의 sin함수를 이용하여 0부터 359도까지 sin값을 구할 수 있다
			int k36_iSpace = (int)((1.0 - k36_fSin) * 50);	
			/*0부터 360도까지 sin함수값의 범위는 -1~1이므로(90일때 1, 270일때 -1)
			1에서 해당값을 빼주면 2~0의 범위가 나온다 이를 50배하여 표현해본다*/
			for(int k36_j = 0; k36_j < k36_iSpace; k36_j++) System.out.printf(" ");	//위에서 iSpace에 할당한 값만큼 띄어쓰기
			System.out.printf("*[%f][%d]\n", k36_fSin, k36_iSpace);	//해당값을 출력해주고 줄바꿈한다
		}
	}
}
//360 : 1 = 2pi : x