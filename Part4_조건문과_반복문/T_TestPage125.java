package Part4Main;
import java.util.*;
public class T_TestPage125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menuNum=0;
		boolean flag =true;
		
		Scanner sc = new Scanner(System.in);
		
	
		while(flag) {
			showMenu();
			System.out.print("작업번호 입력 : ");
			menuNum = sc.nextInt();
			if(menuNum>0 && menuNum<5) {
				switch (menuNum) {
				case 1:
					System.out.println("work 1 running");
					break;
				case 2:
					System.out.println("work 2 running");
					break;
				case 3:
					System.out.println("work 3 running");
					break;
				case 4:
					System.out.println("work 4 running");
					System.out.println("system out");
					flag = false;
				default:
					break;
				}
			}
			else {
				System.out.println("잘못된 입력 다시 입력!");
			}
		}
	}
	static void showMenu() {
		System.out.println("==============");
		System.out.println("1. 입력하기");
		System.out.println("2. 검색하기");
		System.out.println("3. 출력하기");
		System.out.println("4. 종료하기");
		System.out.println("==============");
	}

}

class Menu{
	private String list[]= {"intput", "search", "output", "exit"};
	
	public Menu() {
		
	}
	
	void showList() {
		for(String str : list) {
			int i=1;
			System.out.println(i+"."+str);
			i++;
		}
	}
}
