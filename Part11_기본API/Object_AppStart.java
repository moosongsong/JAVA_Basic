package Part11Main;

public class Object_AppStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
//		Object o2 = new Object();
		Object o2 = o1;
		
		System.out.println(o1==o2);//false
		
		System.out.println(o1.equals(o2));
		//false
		//모든 객체들은 내용이 다 달라여
		//오버라이딩을 하지 않는 이상 쓸수 없게금 하기 위해 이렇당
	}

}
