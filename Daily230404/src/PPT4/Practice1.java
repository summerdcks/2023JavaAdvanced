package PPT4;

public class Practice1 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		int kopo36_iA, kopo36_iB;	//ī��Ʈ�� ������ ���� ����
		
		kopo36_iA = 0;	//����1�� ī��Ʈ�� 0���� �ʱ�ȭ(0�ٺ��� ����)
		while(true) { 	//����1����
			
			kopo36_iB = 0;	//����2�� ī��Ʈ�� 0���� �ʱ�ȭ(�� �ٸ��� �� 0������ ����)
			while(true) {	//����2����
				System.out.printf("*");	//�ٹٲ� ���� ������
				
				if(kopo36_iA == kopo36_iB) break;	//iA�� iB�� ���� ������ ���� ��� �������� ����2�� ����������
				kopo36_iB++;	//����2�� ī��Ʈ�� 1�� �����Ѵ�
			}
			
			System.out.printf("\n");	//�ٹٲ�
			kopo36_iA++;	//����1�� ī��Ʈ�� 1�� �����Ѵ�
			if(kopo36_iA == 30) break;	//30���� ������ ����1�� ����������
		}
	}
}
