package PPT4;

public class PracticeForAndWhile {	//Ŭ���� ����

		public static void main(String[] args) { //�����Լ� ����
		for(int kopo36_i = 1; kopo36_i <= 5; kopo36_i++) {	//������ ���� 1���� 5���� 1�� �����ϴ� for��
			System.out.println(kopo36_i);	//1���� 5���� ���ʴ�� ���
		}
		
		System.out.println();
		
		int kopo36_j = 0;	//������������ �����ϸ� 0���� �ʱ�ȭ�Ѵ�
		do {				//do~while���� ó���� ������ 1�� ����ȴ�
			kopo36_j++;		//�������� 1�� ����
			System.out.println(kopo36_j);	//1���� 5���� ���ʴ�� ���
		} while(kopo36_j <= 5);	//j�� 5�� �Ǹ� ������ ����ȴ�
		
		System.out.println();
				
		int kopo36_h = 1;	//������������ �����ϸ� 1�� �ʱ�ȭ�Ѵ�
		while(kopo36_h <= 5) {	//h�� 5�� �Ǵ� �������� ������ ���ư���
			System.out.println(kopo36_h);	//1���� 5���� ���ʴ�� ��µȴ�
			kopo36_h++;	//h�� 1���� �����Ͽ� 5�� �Ǵ� �������� �������� 1�� �����Ѵ�
		}
	}
}
