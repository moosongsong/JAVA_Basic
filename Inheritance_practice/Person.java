
public class Person extends Object{
	protected String name;
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		System.out.println("Person class constructer");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	public void show() {
		System.out.println("tt");
	}
	
}
