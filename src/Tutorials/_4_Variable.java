package Tutorials;

public class _4_Variable {

	public static void main(String[] args) {
		/* 변수의 효용 : 변수가 없다면 바꿔야 할 값을 일일이 찾아서 고쳐야한다. 
		   따라서 유지보수가 쉬워지고 중복이 제거되면서 가독성이 높아진다. 
		   
		   변수의 데이터 타입이 달라진다면 프로그램이 실행되지 않는다 ex. int에 1.2가 들어간다. */
		
		int a ; // 변수 선언 - int : 정수
		a = 1;  // a에 1을 대입
		System.out.println(a+1); //2
		a = 2;
		System.out.println(a+1); //3 
		
		double b; // 변수 선언 - double : 실수
		b = 1.1; // b에 1.1을 대입
		System.out.println(b+1.1); // 2.2
		
		String c; // 변수 선언 - string : 문자
		c = "coding";
		System.out.println(c);
		
		String d = "funny" ; // 변수 선언과 변수의 값 할당을 한번에 할 수 있다.
		System.out.println(d);
		
		
		String e,f; // 변수를 한번에 선언할 수도 있다.
		e = "coding";
		f = "everybody";
		System.out.println(e+f); 
		
	}

}
