package PPT6;

public class p5 {

	static int iStatic_k36;	//Ŭ���� �� ���� ���� static

	public static void add_k36(int i_k36) {
		iStatic_k36++;
		i_k36++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", iStatic_k36);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", i_k36);
	}
	
	public static int add2_k36(int i_k36) {
		iStatic_k36++;
		i_k36++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", iStatic_k36);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", i_k36);
		return i_k36;
	}
	
	public static void main(String[] args) {
		
		int iMain_k36;
		
		iMain_k36 = 1;
		iStatic_k36 = 1;
		
		System.out.printf("***********************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", iStatic_k36);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", iMain_k36);
		System.out.printf("***********************************\n");
		
		add_k36(iMain_k36);
		
		System.out.printf("***********************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", iStatic_k36);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", iMain_k36);
		System.out.printf("***********************************\n");
		
		iMain_k36 = add2_k36(iMain_k36);
		
		System.out.printf("***********************************\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iStatic=[%d]\n", iStatic_k36);
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iMain=[%d]\n", iMain_k36);
		System.out.printf("***********************************\n");
	}

}
