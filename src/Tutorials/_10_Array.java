package Tutorials;

public class _10_Array {

	public static void main(String[] args) {
		// �迭�� ������ �����͸� ��Ƽ� �����ϱ� ���ؼ� ����ϴ� ������ Ÿ���̴�.
		String[] classgroup = { "������", "������", "���̶�", "�̰���"}; // ���ڿ� �迭 ����
		System.out.println(classgroup[0]); // �迩�� ù��° ���Ұ� 0��
		System.out.println(classgroup[1]);
		System.out.println(classgroup[2]);
		System.out.println(classgroup[3]);
		
		String[] Newclassgroup = new String[4]; 
		Newclassgroup[0] = "������";
		System.out.println(Newclassgroup.length); // length�� ��� ����ֳİ� �ƴ� ��� ������ �� �ִ��� �̴�.
		Newclassgroup[1] = "������";
		System.out.println(Newclassgroup.length);
		Newclassgroup[2] = "�Ѿƶ�";
		System.out.println(Newclassgroup.length);
		Newclassgroup[3] = "�̰���";
		System.out.println(Newclassgroup.length);
		
		// �迭�� �ݺ������� ����
		String[] members =  {"������", "������", "���̶�"};
		for ( int i = 0; i < members.length; i ++) {
			String member = members[i];
			System.out.println(member + "�� ����� �޾ҽ��ϴ�.");
		}
		
		//for each : �迭�� ũ�⸦ �˾ƾ��ϴ� �� �������� ���ŷο��� ����.
		// e ��� ���� ����ؼ� �迭�� ��� ��� ������ �ݺ��ؼ� ����� �� �ִ�.
		String[] newmembers = {"������", "������", "���̶�"};
		for (String e : members) {
			System.out.println(e + "�� ����� �޾ҽ��ϴ�.");
		}

	}

}
