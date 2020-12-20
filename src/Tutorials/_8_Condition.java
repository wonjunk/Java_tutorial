package Tutorials;

public class _8_Condition {

	public static void main(String[] args) {
		// ���ǹ��̶� ���ǿ����� ��ǻ���� ������ �������ִ� ��
		// if(true or false) { if�� 
		//                     then ��
		// }
		// True�� ���� if ���� ������ ���� false�� ���� ������ �Ӿ���
		if(true) {
			System.out.println("result : true"); // true �̹Ƿ� ��µ�
		}
		if(false) {
			System.out.println("result : false"); // false �̹Ƿ� ��� �ȵ�
		}

		
		// else, else if : if �����δ� ���� �� ������ ��Ȳ�� ó���ϴµ� ���
		// if(true or false) { if�� 
		//                     then ��
		// } => True�� ��� ���� 
		// if(true or false) { if�� 
		//                     then ��
		// } => True�� ��� ����  
		// else {
		// } => false �� ��� ����
		if(false) {
			System.out.println("result : true"); // if �� true�� ���
		}
		else if (false) {
			System.out.println("result : true"); // else if �� true�� ���
		}
		else {
			System.out.println("result : false"); // ��� false�� ���
		}
		
		// swtich : case�� ������ ���� ��� - if������ ��ü�� �� �ֱ� ������ �� ������� ���� ������ ���⿡�� ���ϴ�.
		System.out.println("switch(1)");
		switch(1) {
		case 1 : // ��ȣ ���� ���� 1�̸� ������� ����
			System.out.println("one");
		case 2 : // ��ȣ ���� ���� 2�̸� ������� ����
			System.out.println("two");
		case 3 : // ��ȣ ���� ���� 3�̸� ������� ����
			System.out.println("three");
		}
		//break�� �̿��ؼ� �ϳ��� ����ǵ��� �Ѵ�.
		System.out.println("switch(2)");
		switch(2) {
		case 1 : // ��ȣ ���� ���� 1�̸� ����
			System.out.println("one");
			break ;
		case 2 : // ��ȣ ���� ���� 2�̸� ����
			System.out.println("two");
			break ;
		case 3 : // ��ȣ ���� ���� 3�̸� ����
			System.out.println("three");
			break ;
		default :
			System.out.println("default"); // ��� ��찡 �ƴҰ�� ����
		}
		

	}

}
