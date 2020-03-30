package Part9Main;

interface Readable{
	void read();
}

public class Local_Class_Student {
	public static final String TYPE="lolo";
	public String major;
	
	public  Local_Class_Student (String name) {
		this.major = name;
		
		
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void study(int page) {//여기서의 page는 final이 된다.
		final int i=0;
//		i=80;
		class Book implements Readable{
			String bookName;
			int price;
			
			public Book(String bookNname, int price) {
				// TODO Auto-generated constructor stub
				this.bookName=bookNname;
				this.price=price;
			}

			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println(i);//final 만 참조 가능하다...
				System.out.println(TYPE);
				System.out.println(Local_Class_Student.this.major);
			}
			
			
			
		}
		
		Book book = new Book("fnffnf", 25000);
		System.out.println(book.bookName+","+book.price);
		System.out.println(TYPE);
	}
}
