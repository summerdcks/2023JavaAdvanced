package PPT4;

public class Practice2 {	//클래스 선언

	public static void main(String[] args) {	//메인함수 선언
		int kopo36_iI;	//iI 정수형 변수 선언
		double kopo36_iD;	//iD 실수형 double 변수 선언
		
		kopo36_iI = 10/3;	//정수형이므로 소수점아래를 버린 3값이 나옴
		
		kopo36_iD = 10/3.0;	//실수형이므로 3.333333
		
		if(kopo36_iI == kopo36_iD) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n", (double)kopo36_iI, kopo36_iD);	//정수인 3을 double형변환하면 3.000000
		
		if(kopo36_iD == 3.333333) System.out.printf("equal\n");
		else System.out.printf("Not equal[3.333333][%f]\n", kopo36_iD);		//iD에는 소수점아래 유효숫자가 더 길게 존재하므로 같지 않다
		
		kopo36_iD = (int)kopo36_iD;	//iD를 정수형 형변환하면 3
		if(kopo36_iI == kopo36_iD) System.out.printf("equal\n");	//같은 값이 나온다
		else System.out.printf("Not equal[%f][%f]\n", (double)kopo36_iI, kopo36_iD);
		
		System.out.printf("int로 인쇄[%d][%f]\n", kopo36_iI, kopo36_iD);	//정수 3과 실수 3.000000 출력
		System.out.printf("double로 인쇄[%f][%f]\n", (double)kopo36_iI, kopo36_iD);	//정수 3을 실수형변환하여 3.000000출력
		
		char kopo36_a = 'c';	//character형 변수 선언은 작은따옴표(String은 큰따옴표)
		
		if(kopo36_a == 'b') System.out.printf("a는 b이다\n");	//char형 변수 a를 비교연산자 ==을 이용하여 비교한다
		if(kopo36_a == 'c') System.out.printf("a는 c이다\n");
		if(kopo36_a == 'd') System.out.printf("a는 d이다\n");
		
		String kopo36_aa = "abcd";	//String을 변수로 취급하나 실제로는 클래스를 의미한다
		
		if(kopo36_aa.equals("abcd")) System.out.printf("aa는 abcd이다\n");	//String은 클래스이므로 equals함수를 사용하여 비교한다
		else System.out.printf("aa는 abcd가 아니다\n");
		
		boolean kopo36_bb = true;	//참과 거짓을 구분하는 boolean형 변수를 선언하며 true값으로 초기화한다
		
		if(!!kopo36_bb) System.out.printf("bb가 아니고 아니면 참이다\n");	//!(not)이 두번이면 true이므로 문장이 출력된다
		else System.out.printf("bb가 아니고 아니면 거짓이다\n");	
	}
}
