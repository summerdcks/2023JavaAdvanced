package PPT4;

public class PracticeSwitch {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		String jumin = "123456-1234567";	//String ���ڿ��� ������ �����ϸ� �� �ο�
		
		switch(jumin.charAt(7)) {	//���ڿ� jumin���� 7��° ���ڿ� ���� ���ǹ�
			case'1' :	//�ش� ���ڰ� 1�� ���
				System.out.printf("20������ �¾ ���ڻ��\n");	//�ش� ������ ����Ѵ�
																	//break�� �����Ƿ� switch���� ������� �ʰ� case2���� ����ȴ�
			case'2' :	//�ش� ���ڰ� 2�� ���
				System.out.printf("20������ �¾ ���ڻ��\n");	//�ش� ������ ����Ѵ�
				break;												//���ǹ��� ����ȴ�
			case'3' :
				System.out.printf("20������ �¾ ���ڻ��\n");
				break;
			case'4' :
				System.out.printf("20������ �¾ ���ڻ��\n");
				break;
			default :	//���� case�鿡 ��� �ش���� ���� ���
				System.out.printf("���\n");	//�ش繮���� ����Ѵ�
				break;							//���ǹ��� ����ȴ�
		}
	}
}
