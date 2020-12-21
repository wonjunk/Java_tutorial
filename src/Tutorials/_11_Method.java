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
	// method에 여러개의 인자를 전달받는 것도 가능하다.
	// method를 통해 코드량이 줄어들고 유지보수가 유리해진다.

}
