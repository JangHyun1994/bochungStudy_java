package 보충야학_java;

public class Java3 {
	public static void main(String[] args) {
		//1. 배열 선언과 생성
		
		int[] a = new int[4];
		
		//2. 할당
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		//3. 출력
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);    // 1억개 라면.............?????????????????? ;;;;;;
		
		int a1 = a[1];
		int a2 = a[2];
		int sum = a[1] + a[2];  //변수에 대하여, 이해할 것. 숙지할 것.
		
		System.out.println(sum);
		
		// **** for문을 이용해 출력.
		for(int i=0; i<a.length; i++) {
			System.out.println(i + "번째 : "+ a[i]);
		}
		
		// ***** enhanced for loop 문을 이용해 출력. 향상된 for문.
		
		for(int value : a) {
			System.out.println(value);
		}
		
		
		//1. 배열 선언, 생성, 할당 (한번에)
		String[] str = {"apple", "banana", "melon", "blueberry"};   //대괄호 앞에 뭐 붙어도 당황하지 말자.
		//객체를 ? 
		
		//2. 출력 for loop 이용.
		for(int i=0; i<str.length; i++) {
			String value = str[i];		
			System.out.println(value);
		}
		
		//3. enhanced for loop 이용.
		// 오른쪽엔 배열 변수, 왼쪽엔 value와 데이터 타입. *****
		for(String value : str) {
			System.out.println(value);
		}
		
		Customer[] cust = new Customer[2];
		
		cust[0] = new Customer("성영한");
		cust[1] = new Customer("손정의");
		
		//출력
		for(Customer value : cust) {
			System.out.println(value.name);
		}
		
		int[] array = new int[4];
		
		array[0] = 100;
		array[1] = 200;
		array[2] = 300;
		array[3] = 400;
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		//
	
		for(int v : array) {
			System.out.println(v);
		}
		
		
		
		//
		
		
		int[] test = new int[3];
		
		test[0] = 1000;
		test[1] = 2000;
		test[2] = 3000;
		
		for(int i=0; i<test.length; i++) {
			System.out.println(test[i]);
		}
		
		for(int i=0; i<test.length; i++) {
			System.out.print(test[i]+"\t");
		}
		
		System.out.println();
		
		//
		
		for(int janghyun : test) {
			System.out.println(janghyun);
		}
		
		
		//
		
		
		String[] subject = new String[3];
		//국어 영어 수학
	
		subject[0] = "국어";
		subject[1] = "영어";
		subject[2] = "수학";
		
		System.out.println();
		
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i]);
		}
		
		System.out.println();
		
		for(String e : subject) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
	}
}
