package ch06;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1= new Car();
		
		car1.model = "모델1";
		car1.color= "흰색";
		car1.maxSpeed=200;
		System.out.println("car1.company : "+car1.company);
		System.out.println("car1.model : "+car1.model);
		System.out.println("car1.color : "+car1.color);
		System.out.println("car1.maxSpeed : "+car1.maxSpeed);
		System.out.println();
		
		Car car2= new Car("모델2");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		System.out.println("car2.color : "+car2.color);
		System.out.println("car2.maxSpeed : "+car2.maxSpeed);
		System.out.println();
		
		Car car3= new Car("모델3","빨간색");
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println("car3.maxSpeed : "+car3.maxSpeed);
		System.out.println();
		
		Car car4= new Car("모델4","검정색", 300);
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		System.out.println();
		
		

	}

}
