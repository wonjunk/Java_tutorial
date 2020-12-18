package Tutorials;

public class _6_Type_Conversion {

	public static void main(String[] args) {
		/* 암시적 형 변환(implicit conversion)은 표현범위가 좁은 데이터타입에서 넓은 타입으로의 변환만 허용된다.*/
		double a = 3.0F; // 3.0F라는 것을 java에서 float를 double로 자동 형변환 해준다. 
		                 // 암시적 형 변환에서 double -> float는 불가능하다.
		// byte < short ,char < int < long < float < double
		
		int b = 3;
		float c = 1.0F ;
		double d = b + c; // 3.0F + 1.0F = 4.0F => double로 변환 

		
		/* 명시적 형 변환(Explicit Conversion) 
		 *
		 */
		float e = (float)100.0; //100.0은 기본적으로 double이지만 float로 명시적으로 바꿔줄 수 있다.
		int f = (int)100.0F ; //100.0F는 기본적으로 float 지만 int로 명시적으로 바꿔줄 수 있다.
		// 명시적 형 변환에서 실수 -> 정수 변환시 소수점 아래의 수는 손실된다. ex) 100.6 -> 100
	}

}
