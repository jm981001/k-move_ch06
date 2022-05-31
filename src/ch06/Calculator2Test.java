package ch06;

public class Calculator2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calculator2 calc2 = new Calculator2();
		//calc2.plus(11,22);
		
		int result = 0;
	    result = Calculator2.plus(11, 22);
	    System.out.println("합 : "+result);
	    System.out.println("차 : "+Calculator2.minus(11, 22));
		
	}

}
