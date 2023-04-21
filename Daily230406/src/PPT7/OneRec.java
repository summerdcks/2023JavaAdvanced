package PPT7;

public class OneRec {	//Ŭ���� ����

	//Ŭ���� �������� ����� private ���� ����
	private int student_id; 
	private String name_k36;
	private int kor_k36;
	private int eng_k36; 
	private int mat_k36;

	public OneRec(String name_k36, int kor_k36, int eng_k36, int mat_k36) {
		//1���� ���ڿ��� 3���� �������� �޴� ������ OneRec
		//�Է°��� this�� ȣ���� �� Ŭ���� ���� ������ ������ �ο����ش�
		this.name_k36 = name_k36;
		this.kor_k36 = kor_k36;
		this.eng_k36 = eng_k36;
		this.mat_k36 = mat_k36;
	}
	
	public OneRec(int student_id, String name_k36, int kor_k36, int eng_k36, int mat_k36) {
		//1���� ���ڿ��� 4���� �������� �޴� ������ OneRec
		//�Է°��� this�� ȣ���� �� Ŭ���� ���� ������ ������ �ο����ش�
		this.student_id = student_id;
		this.name_k36 = name_k36;
		this.kor_k36 = kor_k36;
		this.eng_k36 = eng_k36;
		this.mat_k36 = mat_k36;
	}
	
	//Ŭ���� ���� private������ public���� �������� �Լ� ����
	public int student_id() {return this.student_id;};
	public String name_k36() {return this.name_k36	;};
	public int kor_k36() {return this.kor_k36;};
	public int eng_k36() {return this.eng_k36;};
	public int mat_k36() {return this.mat_k36;};
	public int sum_k36() {return this.kor_k36 + this.eng_k36 + this.mat_k36;};
	public double ave_k36() {return this.sum_k36() / 3.0;};	
}
