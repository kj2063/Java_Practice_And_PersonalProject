package CH6_Ȯ�ι���;

public class ShopService {
	
	private static ShopService a = new ShopService();
	
	private ShopService() {} 
	
	static ShopService getInstance() {
		return a;
		
	}	
}
