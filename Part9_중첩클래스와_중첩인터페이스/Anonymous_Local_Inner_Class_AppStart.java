package Part9Main;

public class Anonymous_Local_Inner_Class_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스는 상속을 통해서 자식타입에 의해 생성
		
		Book_Anonymous_Local_Inner_Class book = new Book_Anonymous_Local_Inner_Class() { 
			//Book_Anonymous_Local_Inner_Class를 상속하는 이름 없는 class를 선언
			//클래스 정의부
			
			public String author = "fofofof";
			
//			public String getTitle() {//오버라이딩 된 것이라고 보면 됨.
//				return title;
//			}
			
//			public void serTitle(String title) {
//				this.little=title;
//			}
			@Override
			public void showBook() {
				System.out.println(super.little);
				System.out.println(price);
				System.out.println(author);//오버라이딩 된 메소드에서는 사용이 가능하다.
			}
		};
		book.setLittle("aloha");
		book.setPrice(100000);
//		book.author="dpeldj";//사용불가
		book.showBook();
	}

}
