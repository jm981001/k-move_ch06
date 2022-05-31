package ch06;

public class Car {
	//필드
	String company = "현대자동차";//현대자동차는 고정 다른건 바꿀수 있
	String model;
	String color;
	int maxSpeed;
	
	//생성자 오버로딩
	Car (){//클래스 이름이랑 같아햐함//디폴트(기본)생성자
	}
	Car(String model){
		//this.model=model;
		//this.color="은색";
		//this.maxSpeed = 250;
		this(model,"은색",250);//this는 생성자에서 다른 생성자를 호출하는 메서드//코드 중복을 줄여줌
				
	}
	Car(String model,String color){
		//this.model =model;
		//this.color =color;
		//this.maxSpeed =250;
		this(model,color,250);
	}
	Car(String model,String color, int maxSpeed){
			this.model =model;
			this.color =color;
			this.maxSpeed =maxSpeed;
	
	}	
}