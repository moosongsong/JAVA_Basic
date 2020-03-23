package Part_6_Question;

class ShopService{
	
	private static ShopService service = null;
	
	private ShopService (){
		;
	}

	public static ShopService getInstance() {
		// TODO Auto-generated method stub
		if(service==null) {
			service = new ShopService();
		}
		return service;
	}	
}

public class Q6_18 {
	
	public static void main(String [] argv) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
		}
	}
}
