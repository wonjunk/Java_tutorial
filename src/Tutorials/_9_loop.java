package Tutorials;

public class _9_loop {

	public static void main(String[] args) {
		// while , for�� �ִ� .������ ������ ������ ���� ��ü �����ϱ� ������ ��Ȳ�� ���⿡ ���� �����ؼ� ����ϸ� �ȴ�.
		// while (true or false) {
		//  �ݺ����� ����
		// } ==> true�� ���� false�̸� ���� x
		// ���� : ������ �׻� ���̸� ���ѷ����� �ȴ�.
		int i =0;
		while (i <10) {
			System.out.println("Coding Everybody" + i);
			i++; // i�� 1�� ���Ѵ�.
		} // ������ true�� �Ǵ� i=9������ ������ �ȴ�.
		
		// for  (�ʱ�ȭ ; ���� ���� ; �ݺ�����) {
		//       �ݺ����� ����
		// } ==> ���� ������ �� �� ���� ����
		// �ʱⰪ�� ���� �׸��� �ݺ��� ������ �ʱⰪ�� ��������ִ� �����̶�� for�� �� �����ϴ�.
		for  (int j = 0 ; j < 10 ; j++) {
			System.out.println("Coding Everyody"+ j);
		}
		
		// �ݺ����� ���ٸ� �ݺ��۾��� ����� ���� ī�Ǿ� ���̽�Ʈ ������Ѵ�.
		
		// �ݺ����� ���� 
		// break : �ݺ��۾��� �߰��� �׸��ΰ� ���� ��
		for (int k = 0 ; k < 10 ; k++) {
			if ( k == 0) {
				break;
			}
			System.out.println("Coding Everybody"+ k);  // ��µ��� ����
		}
		System.out.println("\n");
		
		// continue : �ݺ����� ���� �ܰ踦 �ǳʶ�
		for (int l = 0 ; l < 10 ; l++) {
			if ( l == 5) {
				continue;
			}
			System.out.println("Coding Everybody"+ l);  // l=5�� ���� ��µ��� ����
		}

	}

}
