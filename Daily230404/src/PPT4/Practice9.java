package PPT4;

public class Practice9 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		int k36_iNumVal = 1001034567;	//1001034567�� ������ ������ ����
		String k36_sNumVal = String.valueOf(k36_iNumVal);	//���ڿ��� ����ȯ�Ͽ� String������ �Ҵ���
		String k36_sNumVoice = ""; 	//String�� ���� ����, �� ���ڿ�
		System.out.printf("==> %s [%d�ڸ�]\n", k36_sNumVal, k36_sNumVal.length());
		//���ڿ��� %s��, ���ڿ��� �ڸ����� �������� %d�� ���
		
		int k36_i, k36_j;	//������ ���� ����
		
		String [] k36_units = {"��","��","��","��","��","��","��","ĥ","��","��"};	//���ڿ� �迭 ����, ������ �ѱ�ǥ�� 10���� ������ �Ҵ���
		String [] k36_unitX = {"","��","��","õ","��","��","��","õ","��","��"};	//���ڿ� �迭 ����, ���ڴ����� �ѱ�ǥ�� 10���� ������ �Ҵ���
		
		k36_i = 0;	//i�� 0, ����Ƚ���� ī��Ʈ�ϴ� ����
		k36_j = k36_sNumVal.length() - 1;	//j�� ���ڿ��� ���̿��� -1�� ��, �迭unitX�� �������������� ���ʴ�� �о���δ�
		
		while(true) {
			if(k36_i >= k36_sNumVal.length()) break;	//������ Ƚ���� ���ڿ��� ���̼��� ��ġ�ϸ� ������ �����
			
			System.out.printf("%s[%s]", k36_sNumVal.substring(k36_i, k36_i+1), k36_units[Integer.parseInt(k36_sNumVal.substring(k36_i, k36_i+1))]);
										//substring���� ���ڿ��� i��° ���ڸ� �Ѱ��� �̾ƿͼ� ���(����)
									//Integer.parseInt�Լ��� ���ڿ����� �̾ƿ� i��° ���ڸ� ������ ���ڷ� ��ȯ�Ͽ� units�迭���� �ش�Ǵ� ����(�ѱ۴���) ���
			
			if(k36_sNumVal.substring(k36_i, k36_i+1).equals("0")) {	
				//substring�Լ��� �̾ƿ� sNumVal���ڿ��� i��° ���ڰ� 0�� ��
				
					if(k36_unitX[k36_j].equals("��") || k36_unitX[k36_j].equals("��")) {	//unitX�迭�� j��° ������ ���̰ų� ���϶�
						
						k36_sNumVoice = k36_sNumVoice + "" + k36_unitX[k36_j];		//�ش��ڸ��� 0�̸� ������ �ٿ��ش�
					
					} else {
						//��, ���ڸ� �ܿ��� �ش��ڸ��� 0�̾ �������� ������ �ʴ´�
					}
			} else {
				k36_sNumVoice = k36_sNumVoice + k36_units[Integer.parseInt(k36_sNumVal.substring(k36_i, k36_i+1))] + k36_unitX[k36_j];
				//substring�Լ��� �̾ƿ� sNumVal���ڿ��� i��° ���ڰ� 0�� �� �̿ܿ��� �ش���ڰ��� �������� ��� �ٿ��ش�				
			}
			k36_i++; 	//i�� 0���� �����Ͽ� �������� 1�� �����ϸ� ������ Ƚ���� ī��Ʈ�Ѵ�
			k36_j--;	//j�� ���ڿ��� ���̿��� -1�� ������ �������� 1�� �����Ѵ�, unitX���� �о���� ������ ������ ���ڸ��� ����

		}
		System.out.printf("\n %s[%s]\n", k36_sNumVal, k36_sNumVoice);
	}
}