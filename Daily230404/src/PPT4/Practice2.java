package PPT4;

public class Practice2 {	//Ŭ���� ����

	public static void main(String[] args) {	//�����Լ� ����
		int kopo36_iI;	//iI ������ ���� ����
		double kopo36_iD;	//iD �Ǽ��� double ���� ����
		
		kopo36_iI = 10/3;	//�������̹Ƿ� �Ҽ����Ʒ��� ���� 3���� ����
		
		kopo36_iD = 10/3.0;	//�Ǽ����̹Ƿ� 3.333333
		
		if(kopo36_iI == kopo36_iD) System.out.printf("equal\n");
		else System.out.printf("Not equal[%f][%f]\n", (double)kopo36_iI, kopo36_iD);	//������ 3�� double����ȯ�ϸ� 3.000000
		
		if(kopo36_iD == 3.333333) System.out.printf("equal\n");
		else System.out.printf("Not equal[3.333333][%f]\n", kopo36_iD);		//iD���� �Ҽ����Ʒ� ��ȿ���ڰ� �� ��� �����ϹǷ� ���� �ʴ�
		
		kopo36_iD = (int)kopo36_iD;	//iD�� ������ ����ȯ�ϸ� 3
		if(kopo36_iI == kopo36_iD) System.out.printf("equal\n");	//���� ���� ���´�
		else System.out.printf("Not equal[%f][%f]\n", (double)kopo36_iI, kopo36_iD);
		
		System.out.printf("int�� �μ�[%d][%f]\n", kopo36_iI, kopo36_iD);	//���� 3�� �Ǽ� 3.000000 ���
		System.out.printf("double�� �μ�[%f][%f]\n", (double)kopo36_iI, kopo36_iD);	//���� 3�� �Ǽ�����ȯ�Ͽ� 3.000000���
		
		char kopo36_a = 'c';	//character�� ���� ������ ��������ǥ(String�� ū����ǥ)
		
		if(kopo36_a == 'b') System.out.printf("a�� b�̴�\n");	//char�� ���� a�� �񱳿����� ==�� �̿��Ͽ� ���Ѵ�
		if(kopo36_a == 'c') System.out.printf("a�� c�̴�\n");
		if(kopo36_a == 'd') System.out.printf("a�� d�̴�\n");
		
		String kopo36_aa = "abcd";	//String�� ������ ����ϳ� �����δ� Ŭ������ �ǹ��Ѵ�
		
		if(kopo36_aa.equals("abcd")) System.out.printf("aa�� abcd�̴�\n");	//String�� Ŭ�����̹Ƿ� equals�Լ��� ����Ͽ� ���Ѵ�
		else System.out.printf("aa�� abcd�� �ƴϴ�\n");
		
		boolean kopo36_bb = true;	//���� ������ �����ϴ� boolean�� ������ �����ϸ� true������ �ʱ�ȭ�Ѵ�
		
		if(!!kopo36_bb) System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n");	//!(not)�� �ι��̸� true�̹Ƿ� ������ ��µȴ�
		else System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�\n");	
	}
}
