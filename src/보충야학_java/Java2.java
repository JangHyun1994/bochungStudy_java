package 보충야학_java;

public class Java2 {
	public static void main(String[] args) {
		String season = null;
		int month = 0;
		if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
		}else if(month == 3 || month == 4 || month == 5) {
			season = "봄";
		}else if(month == 6 || month == 7 || month == 8) {
			season = "여름";
		}else if(month == 9 || month == 10 || month == 11) {
			season = "가을"; 
		}else {
			season = "없는 계절";
		}
		
		System.out.println(month+"월은 "+season +"입니다.");  //println 은 개행(내려쓰기)가 되는데 : 다 처리하고 한줄 내려라.
		System.out.printf("%d 월은 %s 입니다. %n", month, season);
		
		// %d : 정수형, %s : String 문자열, %f : 실수형, %n : 개행(한줄 내려쓰기), '\n'도 개행.
		// printf는 개행이 안 된다. print format. %n은 printf랑 만날 떄만 사용 가능. 막 갖다 쓰면 안 됨. 
		
		
		//month : 이 수식에 올 수 있는 자료형 - char, byte, short, int, String. 이것 뿐. 제한적.
		switch(month) {
		case 12 : // 수행문을 입력하지 않아도 된다. switch.
		case 1 : //
		case 2 : season="겨울"; break; 
		case 3 : //season="봄"; break;
		case 4 : //season="봄"; break;
		case 5 : season="봄"; break;
		case 6 : //season="여름"; break;
		case 7 : //season="여름"; break;
		case 8 : season="여름"; break;
		case 9 : //season="가을"; break;
		case 10 : //season="가을"; break;
		case 11 : season="가을"; break;
		default : season="없는 계절";
		}
	
		System.out.printf("%d 월은 %s 입니다.%n", month, season);
	
		//Switch 는 읽을 줄만 알면 된다. '수식'에 들어가는 자료형 기억하고.
		
		
		
		//1부터 10까지 합 구하자.
//		int sum = 0; //초기값이 반드시 for문 안에 들어갈 필요는 없다. 바깥으로 빼도 된다.
//		for(int i=1; i<=100; i++) {
//			if(i%2==0) { //짝수의 합~ / 홀수의 합 ~
//			sum += i;
//			
//		}
//		System.out.printf("1부터 100까지의 합은 %d 입니다.%n", sum);
//		
		//처음 할 때는 다 해봐야 해....~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~빠샷~~~~~~~~~~~~~~~~
		
		//구구단 짜보자 !
		
		
		
		for(int i=2; i<=9;i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d %n", i,j, i*j);
			}
		}
		
		// i=2, j=1 => 2*1 = 2
		//	  , j=2 => 2*2 = 4
		
		int i = 1;
		int sum = 0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.%n", sum);
		
		
		i = 2;
		while(i<=9) {
			int j = 1; //j가 다시 초기화 되는거야. 그래서 안에 있어야 하는거고. 구구단 지속.
			while(j<=9) {
				System.out.printf("%d * %d = %d %n", i, j, i*j);
				j++;
			}
			i++;
			
		}
		
		
	
		
	}

}










