package ch06;

public class Calculator1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 calc = new Calculator1();
		calc.powerOn(); //객체 외부에서 메서드 호출이 이루어짐 //콘손창에 전월을 켭니다 출력
	
		
		int result = calc.plus(12,34);//메서드 호출
		System.out.println("두 수의 합: "+result);
		
		result = calc.plus(12,34,22);//메서드 호출 위에 리서트는 메모리 공간을 할당받아야해서 인트 붙혔지만 여긴 안해도됨 중복 안됨
		System.out.println("세 수의 합: "+result);
		
		int[] values = {1,2,3,4,5};
		result = calc.sum1(values);
		System.out.println("배열의 총합: "+result);
		
		result = calc.sum2(1, 2, 3, 4, 5);
		System.out.println("1~5까지 합: "+result);
		
		result = calc.sum2(1, 2, 3, 4, 5, 6, 7);
		System.out.println("1~7까지 합: "+result);
		
		int x= 100, y=30;
		//double result2= calc.divide(x, y);
		
		System.out.println("두 수의 나눔 : "+ calc.divide(x, y));
		
		System.out.println("두 수의 평균 : "+ calc.avg(11, 4));
		
		calc.powerOFF();
	}

}
