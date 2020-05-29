package 보충야학_java;

public class Java1 {
	public static void main(String[] args) {
		//식별자 - 클래스명, 변수명, 메서드명, 패키지명
		
		int a1 = 10;
		int a_1 = 10;
		int $1 = 10;
		int fatherAge = 50;
		int fatherage = 50;
		
		// int 1a = 10; 숫자로 시작할 수 없음.
		// int a# = 20; 특수문자로 시작할 수 없음.(예외 : $,_)
		// int father Age = 10; 공백을 허용하지 않음.
		// int break = 10; 예약어는 사용할 수 없음.
		
		//10진수 표현법
		byte b1 = 10;
		//8진수 표현법
		byte b2 = 012;
		//2진수 표현법
		byte b3 = 0b1010;
		//16진수 표현법
		short b4 = 0x12a2;
		
		long l1 = 2_200_000_000l;
		
		float f1 = 12.45f;
		
		double d1 = 12.45d; //d는 생략 가능.
		
		boolean isSuccess = false;
		
		//문자 표현법
		char c1 = 'a';  //문자와 문자열은 다르다 !!!!!!!!!!!
		
		//아스키코드 표현법 //코딩테스트에 나올 가능성이 있다. 
		char c2 = 97;  //97이 소문자a , 65는 대문자A, 
		
		//유니코드 표현법
		char c3 = '\uc131';
		
		
				
		//casting 했을 경우, circuit 발생한다. 그러니까 왠만하면...  int 씁시다 여러분 !!!! 
		byte e1 = (byte)129; //-128 ~ 127
		System.out.println(e1);
		
		//casting 했을 경우, cutting 발생. 이건 사용하는 사람도 있다...
		int e2 = (int)1234.56;
		System.out.println(e2);
		
		
		
		int e3 = 10;
		
		int e4 = e3++ ; //e4의 결과가 달라진다고.   e3에서 '++'가 앞에 있을 때, 뒤에 있을 때 값이 달라진다고.
		//대입 후 증가인지, 증가 후 대입인지 *******************
				
		int e5 = ++e3 ; //증가 후 대입.
		
		e3++ ;
		
//		++e3 ;
//		
//		//primitive 끼리의 비교는, 값 비교다!
//		10==10.0 (True)
//		
//		int e5 = 10;
//		double e6 = 10.0;
//		System.out.println(e5==e6);
//		
		
	}
}
