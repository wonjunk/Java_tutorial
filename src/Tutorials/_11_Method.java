package Tutorials;

public class _11_Method {
	public static void numbering(int init ,int limit) { // define method
		int i= init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numbering(1,20); // call method

	}
	// method�� �������� ���ڸ� ���޹޴� �͵� �����ϴ�.
	// method�� ���� �ڵ差�� �پ��� ���������� ����������.

}
