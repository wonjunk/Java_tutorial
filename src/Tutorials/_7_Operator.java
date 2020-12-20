package Tutorials;

public class _7_Operator {

	public static void main(String[] args) {
		// ������ * / + - % ...
		// Boolean Operator - ���ǹ����� �ٽ����� ������ �Ѵ�.
		// Boolean : Data type�� ������ Ture�� False�� �ΰ��� ���� ���� Data Type
		
		
		// �� ������(���� ������) : ���� ����� Ture or False�� �����ִ� ������
		// == ������ True �ٸ��� False ���
		System.out.println(1==2); // False
		System.out.println(1==1); // True
		System.out.println("one"=="two"); //False
		System.out.println("one" == "one"); //True
		
		// != ������ False �ٸ��� True ���
		System.out.println(1 != 2); //True
		System.out.println(1 != 1); //False
		System.out.println("one"!="two"); //Ture
		System.out.println("one" != "one"); //False
		
		// >  ������ ���׺��� ũ�� True �ƴϸ� False ��� < �� �̰��� �ݴ�
		// >= ������ ���� �� ���� ����
		System.out.println(10 > 20); //False
		System.out.println(10 > 2 ); //True
		System.out.println(10>10); //False
		System.out.println(10>=10); //True
		
		//���ڿ��� ���� �� .equals�� ���
		String a = "hello world";
		String b = new String("hello world");
		System.out.println(a==b); // False
		System.out.println(a.equals(b)); // True
		
		//�� ������
		// && = and : ��� ���̸� �� �ƴҰ�� ����
		if (true && true) {
			System.out.println(1); // ���̹Ƿ� ���
		}
		if (false && true) {
			System.out.println(2); // �����̹Ƿ� ��� �ȵ�
		}
		if (true && false) {
			System.out.println(3); // �����̹Ƿ� ��� �ȵ�
		}
		if (false && false) {
			System.out.println(4); // �����̹Ƿ� ��� �ȵ�
		}
		
		// || = or : �� �� �ϳ��� ���̸� ��
		if (true || true) {
			System.out.println(1); // ���̹Ƿ� ���
		}
		if (false || true) {
			System.out.println(2); // ���̹Ƿ� ���
		}
		if (true || false) {
			System.out.println(3); // ���̹Ƿ� ���
		}
		if (false || false) {
			System.out.println(4); // �����̹Ƿ� ��� �ȵ�
		}
		
		// ! = not : Boolean ���� ������Ű�� ����
		if (!true) {
			System.out.println(1); // �����̹Ƿ� ��� �ȵ�
		}
		if(!false) {
			System.out.println(2); // ���̹Ƿ� ���
		}
	}

}
