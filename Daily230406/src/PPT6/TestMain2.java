package PPT6;

public class TestMain2 {

	public static void main(String[] args) {
		Calc1 cc_k36 = new Calc1();
		
		System.out.printf("2°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", cc_k36.sum_k36(1,2));
		System.out.printf("3°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", cc_k36.sum_k36(1,2,3));
		System.out.printf("4°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", cc_k36.sum_k36(1,2,3,4));
		System.out.printf("´õºíÇü µ¡¼ÀÀÌ È£ÃâµÊ [%f]\n", cc_k36.sum_k36(1.3,2.4));

	}
}
