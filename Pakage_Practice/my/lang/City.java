package my.lang;

public enum City {
	SEOUL(0),
	DAEJEON(205), 
	KWANGJU(200),
	BUSAN(450),
	JEJU(600);
	private int km;
	
	private City (int km) {
		this.km = km;
	}
	
	public int getDistance() {
		return km;
	}
}
