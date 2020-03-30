package Part9Main;

public abstract class Book_Anonymous_Local_Inner_Class {
	protected String little;
	protected int price;
	
	public Book_Anonymous_Local_Inner_Class() {
		// TODO Auto-generated constructor stub
	}
	
	public Book_Anonymous_Local_Inner_Class(String little, int price) {
		this.little=little;
		this.price = price;
	}

	public String getLittle() {
		return little;
	}

	public int getPrice() {
		return price;
	}

	public void setLittle(String little) {
		this.little = little;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void showBook();
}
