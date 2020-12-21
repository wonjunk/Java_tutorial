package Tutorials;

public class _10_Array {

	public static void main(String[] args) {
		// 배열은 연관된 데이터를 모아서 관리하기 위해서 사용하는 데이터 타입이다.
		String[] classgroup = { "최진혁", "최유빈", "한이람", "이고잉"}; // 문자열 배열 정의
		System.out.println(classgroup[0]); // 배여은 첫번째 원소가 0번
		System.out.println(classgroup[1]);
		System.out.println(classgroup[2]);
		System.out.println(classgroup[3]);
		
		String[] Newclassgroup = new String[4]; 
		Newclassgroup[0] = "최진혁";
		System.out.println(Newclassgroup.length); // length는 몇개가 들어있냐가 아닌 몇개를 수용할 수 있느냐 이다.
		Newclassgroup[1] = "최유빈";
		System.out.println(Newclassgroup.length);
		Newclassgroup[2] = "한아람";
		System.out.println(Newclassgroup.length);
		Newclassgroup[3] = "이고잉";
		System.out.println(Newclassgroup.length);
		
		// 배열과 반복문과의 결합
		String[] members =  {"최진혁", "최유빈", "한이람"};
		for ( int i = 0; i < members.length; i ++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
		
		//for each : 배열의 크기를 알아야하는 등 여러가지 번거로움이 없다.
		// e 라는 값을 사용해서 배열에 담긴 모든 값들을 반복해서 사용할 수 있다.
		String[] newmembers = {"최진혁", "최유빈", "한이람"};
		for (String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}

	}

}
