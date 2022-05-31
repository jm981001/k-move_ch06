package ex18;

public class ShopService {
	private static  ShopService sigleton =new ShopService();
	
	private ShopService(){
		
	}
	
	static ShopService getInstance() {
		return sigleton;
	}
	
	
}
