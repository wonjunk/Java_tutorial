package Tutorials;

public class _7_Operator {

	public static void main(String[] args) {
		// 연산자 * / + - % ...
		// Boolean Operator - 조건문에서 핵심적인 역할을 한다.
		// Boolean : Data type의 종류로 Ture와 False의 두가지 값만 갖는 Data Type
		
		
		// 비교 연산자(관계 연산자) : 비교한 결과를 Ture or False로 돌려주는 연산자
		// == 같으면 True 다르면 False 출력
		System.out.println(1==2); // False
		System.out.println(1==1); // True
		System.out.println("one"=="two"); //False
		System.out.println("one" == "one"); //True
		
		// != 같으면 False 다르면 True 출력
		System.out.println(1 != 2); //True
		System.out.println(1 != 1); //False
		System.out.println("one"!="two"); //Ture
		System.out.println("one" != "one"); //False
		
		// >  좌항이 우항보다 크면 True 아니면 False 출력 < 는 이것의 반대
		// >= 위에서 같은 것 까지 포함
		System.out.println(10 > 20); //False
		System.out.println(10 > 2 ); //True
		System.out.println(10>10); //False
		System.out.println(10>=10); //True
		
		//문자열을 비교할 땐 .equals를 사용
		String a = "hello world";
		String b = new String("hello world");
		System.out.println(a==b); // False
		System.out.println(a.equals(b)); // True
		
		//논리 연산자
		// && = and : 모두 참이면 참 아닐경우 거짓
		if (true && true) {
			System.out.println(1); // 참이므로 출력
		}
		if (false && true) {
			System.out.println(2); // 거짓이므로 출력 안됨
		}
		if (true && false) {
			System.out.println(3); // 거짓이므로 출력 안됨
		}
		if (false && false) {
			System.out.println(4); // 거짓이므로 출력 안됨
		}
		
		// || = or : 둘 중 하나만 참이면 참
		if (true || true) {
			System.out.println(1); // 참이므로 출력
		}
		if (false || true) {
			System.out.println(2); // 참이므로 출력
		}
		if (true || false) {
			System.out.println(3); // 참이므로 출력
		}
		if (false || false) {
			System.out.println(4); // 거짓이므로 출력 안됨
		}
		
		// ! = not : Boolean 값을 반전시키는 역할
		if (!true) {
			System.out.println(1); // 거짓이므로 출력 안됨
		}
		if(!false) {
			System.out.println(2); // 참이므로 출력
		}
	}

}
