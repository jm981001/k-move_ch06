package ch06;

public class Calculator2 {

	
	static double pi = 3.14159; //정적 필드
	
	static int plus(int x, int y) {//정적 매서드
		return x+y;
	}
	static int minus(int x, int y) { //정적 메서드
		return x-y;
	}
	
}
//static으로 하면 객체생성없이 바로 사용 가능하다