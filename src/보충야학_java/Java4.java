package 보충야학_java;

public class Java4 {
	String name;
	double height;
	
	public void print() {
		System.out.println(name+","+height);
	}
	
	public static void main(String[] args) {
		Java4 j1 = new Java4();  // 객체 생성 방법 : new + CLASS   
		j1.name = "a1";
		j1.height = 170.2;
		j1.print();
		int reusult1 = j1.plus(100, 200, )
	}
	
	
	public static void main(String[] args) {
		Java4 j1 = new Java4();   //클래스를 생성하고 할당하고 호출해보고 ... 연습. .. ... ... ... 
		j1.name = "a1";  // 변수에 할당
		j1.height = 170.2;
		
		System.out.println(j1.name); //주로 instance변수만 쓴다. 
	
		
		Java4 j2 = new Java4();
		j2.name ="a2";
		j2.height = 180.3;
		
		Java4 j3 = new Java4();
		j3.name = "a3";
		j3.height = 150.4;
		
		
		
		
		
	}
	
}
