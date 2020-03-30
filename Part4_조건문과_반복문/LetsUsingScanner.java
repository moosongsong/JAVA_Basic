package Part4Main;
import java.util.*;
import java.io.*;
public class LetsUsingScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in); //System.in은 class이다. 대문자 이니까 클래스.
//		
//		System.out.println("정상 메시지 출력");
//		System.err.println("에러메시지 출력"); //out 과 err 의 라인이 달라서 순서가 바뀔 수 있음.
//		//커널은 프로세스를 감시하는 기능이 있다.  log 메시지 처리에 편의를 위해 스트림을 두개로 나옴.
//		
//		System.out.println("문자를 입력하세요.");
//		int i= System.in.read();//
//		System.out.println("입력된값 "+ i);
//		
//		i= System.in.read();//
//		System.out.println("입력된값 "+ i);
//		i= System.in.read();//
//		System.out.println("입력된값 "+ i);
////		
//		System.out.print("이름 :");
//		String str = sc.nextLine();//공백포함
//		System.out.print("나이 :");
//		String str2 = sc.nextLine();
//		System.out.println(str);
//		System.out.println(str2);
		
		//Scanner col = new Scanner("ghd 10 10.1");
		Scanner col = new Scanner(new File("C:\\Users\\송무송\\eclipse-workspace\\Practice_JAVA\\dfg.txt"));
		//C:\Users\송무송\eclipse-workspace\Practice_JAVA
		String u1 = col.next();
		int u2 = col.nextInt();
		double u3 = col.nextDouble();
		
		System.out.println(u1+u2+u3);
		//sc.close();//닫지마!!system.in도 같이 닫혀 버림.
		//err는 stack trace 여서 순서대로 밑에 것이 호출한다.
	}

}
