package Part5Main;

public class T_TestPage142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("홍길동");
		String name2 = new String("홍길동");
		//선언과 초기화 동시에!!!!!!!
		
		System.out.println(name==name2);
		System.out.println(name.equals(name2));
		
		Object o1 =new Object();
		Object o2 =new Object();
		
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));
		
		String str = null;
		//null에 대해서 접근을 하면 안된다....nullpointerexception
		//System.out.println(str.length());
		
		int a[]=null;
		//System.out.println(a.length);//배열 객체 접근하려는 시도 널 프인터 익셉션 발생.
		 
		int a1[][];
		int[][] b;
		int []c[];
		
		int[] a2= {1,5,2,3,7,4,6}; // member initialize list 멤버 초기화 목록
		int[] ar=new int [10];
		
		System.out.println(a2.length);
		
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
		
		
	}

}
