package PPT7;

public class OneRec {	//클래스 선언

	//클래스 내에서만 사용할 private 변수 선언
	private int student_id; 
	private String name_k36;
	private int kor_k36;
	private int eng_k36; 
	private int mat_k36;

	public OneRec(String name_k36, int kor_k36, int eng_k36, int mat_k36) {
		//1개의 문자열과 3개의 정수값을 받는 생성자 OneRec
		//입력값을 this로 호출한 현 클래스 내의 각각의 변수에 부여해준다
		this.name_k36 = name_k36;
		this.kor_k36 = kor_k36;
		this.eng_k36 = eng_k36;
		this.mat_k36 = mat_k36;
	}
	
	public OneRec(int student_id, String name_k36, int kor_k36, int eng_k36, int mat_k36) {
		//1개의 문자열과 4개의 정수값을 받는 생성자 OneRec
		//입력값을 this로 호출한 현 클래스 내의 각각의 변수에 부여해준다
		this.student_id = student_id;
		this.name_k36 = name_k36;
		this.kor_k36 = kor_k36;
		this.eng_k36 = eng_k36;
		this.mat_k36 = mat_k36;
	}
	
	//클래스 내의 private변수를 public으로 리턴해줄 함수 생성
	public int student_id() {return this.student_id;};
	public String name_k36() {return this.name_k36	;};
	public int kor_k36() {return this.kor_k36;};
	public int eng_k36() {return this.eng_k36;};
	public int mat_k36() {return this.mat_k36;};
	public int sum_k36() {return this.kor_k36 + this.eng_k36 + this.mat_k36;};
	public double ave_k36() {return this.sum_k36() / 3.0;};	
}
