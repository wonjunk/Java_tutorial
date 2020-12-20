package Tutorials;

public class _9_loop {

	public static void main(String[] args) {
		// while , for가 있다 .하지만 각각의 구문은 서로 대체 가능하기 때문에 상황과 취향에 따라서 선택해서 사용하면 된다.
		// while (true or false) {
		//  반복실행 영역
		// } ==> true면 실행 false이면 실행 x
		// 주의 : 조건이 항상 참이면 무한루프가 된다.
		int i =0;
		while (i <10) {
			System.out.println("Coding Everybody" + i);
			i++; // i에 1을 더한다.
		} // 조건이 true가 되는 i=9까지만 실행이 된다.
		
		// for  (초기화 ; 종료 조건 ; 반복실행) {
		//       반복실행 영역
		// } ==> 종료 조건이 될 떄 까지 실행
		// 초기값과 조건 그리고 반복할 때마다 초기값을 변경시켜주는 구문이라면 for이 더 적합하다.
		for  (int j = 0 ; j < 10 ; j++) {
			System.out.println("Coding Everyody"+ j);
		}
		
		// 반복문이 없다면 반복작업을 사람이 직접 카피앤 페이스트 해줘야한다.
		
		// 반복문의 제어 
		// break : 반복작업을 중간에 그만두고 싶을 때
		for (int k = 0 ; k < 10 ; k++) {
			if ( k == 0) {
				break;
			}
			System.out.println("Coding Everybody"+ k);  // 출력되지 않음
		}
		System.out.println("\n");
		
		// continue : 반복문이 현재 단계를 건너뜀
		for (int l = 0 ; l < 10 ; l++) {
			if ( l == 5) {
				continue;
			}
			System.out.println("Coding Everybody"+ l);  // l=5일 때가 출력되지 않음
		}

	}

}
