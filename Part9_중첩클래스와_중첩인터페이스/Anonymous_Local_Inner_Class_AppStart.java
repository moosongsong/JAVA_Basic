package Part9Main;

public class Anonymous_Local_Inner_Class_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�߻�Ŭ������ ����� ���ؼ� �ڽ�Ÿ�Կ� ���� ����
		
		Book_Anonymous_Local_Inner_Class book = new Book_Anonymous_Local_Inner_Class() { 
			//Book_Anonymous_Local_Inner_Class�� ����ϴ� �̸� ���� class�� ����
			//Ŭ���� ���Ǻ�
			
			public String author = "fofofof";
			
//			public String getTitle() {//�������̵� �� ���̶�� ���� ��.
//				return title;
//			}
			
//			public void serTitle(String title) {
//				this.little=title;
//			}
			@Override
			public void showBook() {
				System.out.println(super.little);
				System.out.println(price);
				System.out.println(author);//�������̵� �� �޼ҵ忡���� ����� �����ϴ�.
			}
		};
		book.setLittle("aloha");
		book.setPrice(100000);
//		book.author="dpeldj";//���Ұ�
		book.showBook();
	}

}
