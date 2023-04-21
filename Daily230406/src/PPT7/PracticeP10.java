package PPT7;

public class PracticeP10 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword_k36("�ѱ�abcd", 15));		//HanBlankForeword�Լ��� �����Ͽ� ��ȯ�� ���ڿ��� ����Ѵ�
		System.out.printf("HanBlankForeword[%s]\n", HanBlankForeword_k36("�ѱ��ѱ�aa", 15));	//HanBlankForeword�Լ��� �����Ͽ� ��ȯ�� ���ڿ��� ����Ѵ�
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword_k36("�ѱ�aa", 15));		//HanBlankBackword�Լ��� �����Ͽ� ��ȯ�� ���ڿ��� ����Ѵ�
		System.out.printf("HanBlankForeword[%s]\n", HanBlankBackword_k36("�ѱ��ѱ�aa", 15));	//HanBlankBackword�Լ��� �����Ͽ� ��ȯ�� ���ڿ��� ����Ѵ�
		System.out.printf("�ѱ��� [%d]��\n", HanCount_k36("�ѱ��ѱ�aa"));	//HanCount�Լ��� �����Ͽ� ��ȯ�� ���ڿ��� ����Ѵ�
	}

	private static int HanCount_k36(String string_k36) {	//���ڿ��� �޾� �������� ��ȯ�ϴ� �Լ�
		int count_k36 = 0;	//�ѱۼ��� �������� ������ ���� ���� �� 0���� �ʱ�ȭ
		for(int i_k36 = 0; i_k36 < string_k36.length(); i_k36++) {	//���ڿ��� 0������ ���������ڱ��� �Ѱ��� ���캻��
			byte[] s_k36 = String.valueOf(string_k36.charAt(i_k36)).getBytes();
			//���ڿ��� i��° ���ڸ� ���ڿ��� ��ȯ�Ͽ� byte������ �迭�� ��´�
		    if (s_k36.length == 2) {	//byte�迭�� ����, �� ������ ����Ʈ���� 2�� �� = �ѱ��� ��
		    	count_k36++;			//Ƚ���� ���ش�
		    }
		}
		return count_k36; //�ѱۼ��� ��ȯ�Ѵ�
	}

	private static String HanBlankForeword_k36(String string_k36, int i_k36) {		//���ڿ��� ������ �޾� �������� ��ȯ�ϴ� �Լ�
		String ret_k36 = string_k36;	//�Է¹��� ���ڿ��� ret�� �޴´�
		byte[] s_k36 = string_k36.getBytes();	//�ش� ���ڿ��� byte�� �ɰ��� byte�迭�� ��´�
		for(int j_k36 = 0; j_k36 < i_k36 - s_k36.length; j_k36++) {	//�Է¹��� ������ ���ڿ��� ����Ʈ���� �� Ƚ����ŭ
			ret_k36 = " " + ret_k36;	//���ڿ��� �տ� ���⸦ �߰����ش�
		}
		return ret_k36;	//���Ⱑ ���Ե� ���ڿ��� ��ȯ�Ѵ�
	}
	
	private static String HanBlankBackword_k36(String string_k36, int i_k36) {		//���ڿ��� ������ �޾� �������� ��ȯ�ϴ� �Լ�
		String ret_k36 =  string_k36;	//�Է¹��� ���ڿ��� ret�� �޴´�
		byte[] s_k36 = string_k36.getBytes();	//�ش� ���ڿ��� byte�� �ɰ��� byte�迭�� ��´�
		for(int j_k36 = 0; j_k36 < i_k36 - s_k36.length; j_k36++) {	//�Է¹��� ������ ���ڿ��� ����Ʈ���� �� Ƚ����ŭ
			ret_k36 = ret_k36 + " ";	//���ڿ��� �ڿ� ���⸦ �߰����ش�
		}
		return ret_k36;	//���Ⱑ ���Ե� ���ڿ��� ��ȯ�Ѵ�
	}
}
