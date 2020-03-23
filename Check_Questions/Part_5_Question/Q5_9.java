package Part_5_Question;
import java.util.*;

public class Q5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum=0;
		int[] scores =null;
		int total=0;
		int max=0;
		Scanner sc =new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 >");
			
			int selectNo = sc.nextInt();
			
			if (selectNo == 1) {
				System.out.print("학생수 >");
				studentNum = sc.nextInt();
				scores=new int [studentNum];
			}
			else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores["+i+"]>");
					scores[i]=sc.nextInt();
				}
			}
			else if(selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]:"+scores[i]);
				}
			}
			else if(selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					total=total+scores[i];
					if(max<scores[i]) {
						max=scores[i];
					}
				}
				System.out.println("최고점수:"+max);
				System.out.println("평균점수:"+((double)total/(double)scores.length));
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
