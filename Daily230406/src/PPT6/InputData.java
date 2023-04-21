package PPT6;

public class InputData {	//Ŭ���� ����
	int iPerson_k36;	//������ ���� ����
	String [] name_k36;	//���ڿ��� �迭 ����
	int [] kor_k36;	//������ �迭 ����
	int [] eng_k36;	//������ �迭 ����
	int [] mat_k36;	//������ �迭 ����
	int [] sum_k36;	//������ �迭 ����
	double [] ave_k36;	//�Ǽ��� �迭 ����
	
	
	public InputData(int iPerson_k36) {	//InputDataŬ������ �����ڿ��� ReportSheet���� �Էµ� �������� �޾ƿ´�
		this.iPerson_k36 = iPerson_k36;	//�ش簪�� InputDataŬ������ iPerson������ �Ҵ��Ѵ�
		name_k36 = new String[iPerson_k36];	//iPersonũ���� ���ڿ��� �迭�� �����ȴ�
		kor_k36 = new int[iPerson_k36];	//iPersonũ���� ������ �迭�� �����ȴ�
		eng_k36 = new int[iPerson_k36];	//iPersonũ���� ������ �迭�� �����ȴ�
		mat_k36 = new int[iPerson_k36];	//iPersonũ���� ������ �迭�� �����ȴ�
		sum_k36 = new int[iPerson_k36];	//iPersonũ���� ������ �迭�� �����ȴ�
		ave_k36 = new double[iPerson_k36];	//iPersonũ���� �Ǽ��� �迭�� �����ȴ�
	}


	public void SetData(int i_k36, String name_k36, int kor_k36, int eng_k36, int mat_k36) {
		//��ȯ���� ���� void�� SetData�Լ����� �Ѱ��� ���ڿ��� 5���� ������ �޴´�
		this.name_k36[i_k36] = name_k36;	//�ش� ���ڿ��� InputDataŬ������ ���ڿ��� name�迭�� i��° ������ ����ȴ�
		this.kor_k36[i_k36] = kor_k36;		//�ش� �������� InputDataŬ������ ������ kor�迭�� i��° ������ ����ȴ�
		this.eng_k36[i_k36] = eng_k36;		//�ش� �������� InputDataŬ������ ������ eng�迭�� i��° ������ ����ȴ�
		this.mat_k36[i_k36] = mat_k36;		//�ش� �������� InputDataŬ������ ������ mat�迭�� i��° ������ ����ȴ�
		this.sum_k36[i_k36] = kor_k36 + eng_k36 + mat_k36;	//�� ������ ���� ���� InputDataŬ������ ������ sum�迭�� i��° ������ ����ȴ�
		this.ave_k36[i_k36] = sum_k36[i_k36] / 3.;	//InputDataŬ������ ������ sum�迭�� i��° ������ 3.0���� ���� ����
													//InputDataŬ������ �Ǽ��� ave�迭�� �����Ѵ�
	}
	
}
