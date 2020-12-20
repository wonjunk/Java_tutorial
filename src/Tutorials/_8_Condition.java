package Tutorials;

public class _8_Condition {

	public static void main(String[] args) {
		// 조건문이란 조건에따라 컴퓨터의 역할을 설정해주는 것
		// if(true or false) { if절 
		//                     then 절
		// }
		// True가 오면 if 뒤의 영역이 실행 false가 오면 실행됮 ㅣ않음
		if(true) {
			System.out.println("result : true"); // true 이므로 출력됨
		}
		if(false) {
			System.out.println("result : false"); // false 이므로 출력 안됨
		}

		
		// else, else if : if 만으로는 조금 더 복잡한 상황을 처리하는데 사용
		// if(true or false) { if절 
		//                     then 절
		// } => True일 경우 실행 
		// if(true or false) { if절 
		//                     then 절
		// } => True일 경우 실행  
		// else {
		// } => false 일 경우 실행
		if(false) {
			System.out.println("result : true"); // if 가 true면 출력
		}
		else if (false) {
			System.out.println("result : true"); // else if 가 true면 출력
		}
		else {
			System.out.println("result : false"); // 모두 false면 출력
		}
		
		// swtich : case를 나누어 볼때 사용 - if문으로 대체될 수 있기 때문에 잘 사용하지 않음 하지만 보기에는 편하다.
		System.out.println("switch(1)");
		switch(1) {
		case 1 : // 괄호 안의 값이 1이면 여기부터 실행
			System.out.println("one");
		case 2 : // 괄호 안의 값이 2이면 여기부터 실행
			System.out.println("two");
		case 3 : // 괄호 안의 값이 3이면 여기부터 실행
			System.out.println("three");
		}
		//break를 이용해서 하나만 실행되도록 한다.
		System.out.println("switch(2)");
		switch(2) {
		case 1 : // 괄호 안의 값이 1이면 실행
			System.out.println("one");
			break ;
		case 2 : // 괄호 안의 값이 2이면 실행
			System.out.println("two");
			break ;
		case 3 : // 괄호 안의 값이 3이면 실행
			System.out.println("three");
			break ;
		default :
			System.out.println("default"); // 모든 경우가 아닐경우 실행
		}
		

	}

}
