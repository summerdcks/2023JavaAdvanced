package PPT7;

public class PracticeP24 {	// Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		int [] iArray_k36 = {1,7,5,3,2,1,3,4,9,12,1,212,33,11,21,11,2121,121,11,5,6,33};
		//������ �迭�� �����ϰ� ������ �Ҵ����ش�
		
		for(int i_k36 = 0; i_k36 < iArray_k36.length; i_k36++) {	//0���� �迭�Ǳ��� �������� ���ʴ�� ������ش�
			System.out.printf("iArray[%d]=%d\n", i_k36, iArray_k36[i_k36]); //�迭�� i��° ������ ������ش�
		}

		//MAXã��
		int iMax_k36 = iArray_k36[0];	//������ ������ �����ϸ� iArray�迭�� 0��° �������� �Ҵ����ش�
		int iMaxPt_k36 = 0;			//������ ������ �����ϸ� 0���� �ʱ�ȭ�Ѵ�, �ִ밪�� ���°���� ǥ�����ֱ� ���� ����
		for(int i_k36 = 0; i_k36 < iArray_k36.length; i_k36++) {	//0���� �迭�Ǳ��� �������� ������ ���� ���� �����ش�
			if(iMax_k36 < iArray_k36[i_k36]) {	//�迭�� i��° �������� �̹� �Ҵ�� ������ ũ��
				iMax_k36 = iArray_k36[i_k36];	//i��° �������� �Ҵ����ش�
				iMaxPt_k36 = i_k36;			//���° �������� i���� iMaxPt�� �Ҵ����ش�
			}
		}
		System.out.printf("MAX : iArray[%d] = %d\n", iMaxPt_k36, iMax_k36);
		//iArray�迭�� �ִ밪�� iMaxPt��° ���� iMax�� ������ش�
		
		//MINã��
		int iMin_k36 = iArray_k36[0];	//������ ������ �����ϸ� iArray�迭�� 0��° �������� �Ҵ����ش�
		int iMinPt_k36 = 0;			//������ ������ �����ϸ� 0���� �ʱ�ȭ�Ѵ�, �ִ밪�� ���°���� ǥ�����ֱ� ���� ����
		for(int i_k36 = 0; i_k36 < iArray_k36.length; i_k36++) {	//0���� �迭�Ǳ��� �������� ������ ���� ���� �����ش�
			if(iMin_k36 > iArray_k36[i_k36]) {	//�迭�� i��° �������� �̹� �Ҵ�� ������ ������
				iMin_k36 = iArray_k36[i_k36];	//i��° �������� �Ҵ����ش�
				iMinPt_k36 = i_k36;			//���° �������� i���� iMinPt�� �Ҵ����ش�
			}
		}
		System.out.printf("MIN : iArray[%d] = %d\n", iMinPt_k36, iMin_k36);
		//iArray�迭�� �ּҰ��� iMinPt��° ���� iMin�� ������ش�
	}
}
