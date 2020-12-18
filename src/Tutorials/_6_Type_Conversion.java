package Tutorials;

public class _6_Type_Conversion {

	public static void main(String[] args) {
		/* �Ͻ��� �� ��ȯ(implicit conversion)�� ǥ�������� ���� ������Ÿ�Կ��� ���� Ÿ�������� ��ȯ�� ���ȴ�.*/
		double a = 3.0F; // 3.0F��� ���� java���� float�� double�� �ڵ� ����ȯ ���ش�. 
		                 // �Ͻ��� �� ��ȯ���� double -> float�� �Ұ����ϴ�.
		// byte < short ,char < int < long < float < double
		
		int b = 3;
		float c = 1.0F ;
		double d = b + c; // 3.0F + 1.0F = 4.0F => double�� ��ȯ 

		
		/* ����� �� ��ȯ(Explicit Conversion) 
		 *
		 */
		float e = (float)100.0; //100.0�� �⺻������ double������ float�� ��������� �ٲ��� �� �ִ�.
		int f = (int)100.0F ; //100.0F�� �⺻������ float ���� int�� ��������� �ٲ��� �� �ִ�.
		// ����� �� ��ȯ���� �Ǽ� -> ���� ��ȯ�� �Ҽ��� �Ʒ��� ���� �սǵȴ�. ex) 100.6 -> 100
	}

}
