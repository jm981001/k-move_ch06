package ch06;

public class Calculator1 {
	//기본생성자
	Calculator1(){}
	//메소드
	void powerOn() {
	     System.out.println("전원을 켭니다.");
	}
	
	//메서드 오버로딩
	int plus(int x, int y) {//두개라면 얘가 실행
		int result = x+y;
		return result;
	}
	int plus(int x, int y, int z) {//3개라면 얘가 실행 즉 다형성을 지원
		int result = x+y+z;
		return result;
	}
	//매개변수 수를 모를 경우 1
	int sum1(int[] values) {
		int sum =0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	//매개변수 수를 모를경우2
	int sum2(int ...values) { 
		int sum =0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	
	double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	double avg (int x, int y) {
		double sum= plus (x,y); //클래스 내부에서 메서드 호출 (12실행)
		double result = sum/2;
		return result;
		
	}
	
	void powerOFF() {
		System.out.println("전원을 끕니다.");
	}
}
