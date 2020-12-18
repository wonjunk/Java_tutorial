package Tutorials;

public class _5_Datatype {

	public static void main(String[] args) {
		/* 정수와 실수에 int와 double 말고도 더 다양한 data type이 있다. 
		 * 정수) byte : 1byte ( -128 ~ 127 ) 
		 *       short : 2byte (-32768 ~ 32767 )
		 *       int : 4byte ( -2147483648 ~ 2147483647)
		 *       long : 8byte ( -9223372036854775808 ~ 9223372036854775807 )
		 * 실수) float : 4byte (+_(1.40129846432481707e-45 ~ 3.40282346638528860e+38))
		 *       double : 8byte (+_(4.94065645841e-324d ~ 1.79769313486231570e+308d)) */ 
		
		byte a;
		short b;
		a = 127; // 문제 없음 - 128을 넣으면 에러가 남
		b = 128; // short은 128보다 큰 숫자도 담을 수 있음
		// 데이터의 크기에 맞는 데이터 타입을 쓰는게 효율적 하지만 일반적으로 int를 써도 무방
		
		long c;
		long d;
		c = 221821231213L; // 기본적으로 큰 숫자가 int기 때문에 long을 쓰려면 L을 붙여주어야 한다. 
		                   // 하지만 short이나 byte는 그냥 쓸 수 있다.
		d = 1; 
		// c와 d는 다른 숫자더라도 데이터 타입이 같기 때문에 사용하는 메모리는 동일하다. 
		
		float e = 2.2F; // float 형을 쓰기 위해선 F를 붙여주어야 한다. (실수의 기본데이터형은 double이기 때문)
		double f = 2.2; 
		
	}

}
