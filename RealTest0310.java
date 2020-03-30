package HappyNewYear;

public class RealTest0310 {

	public static void main(String[] args) {
		pro1(1700);
		pro2(10);
		pro3(10);
		pro4(2020, 3020);
		System.out.println(pro5(2));
		pro6(10);
		pro7(70);
		pro8(3);
		pro9(2,3);
		pro10(1752);
		System.out.println(pro11(5)+"대");
		System.out.println(pro12(5)+"대");
		System.out.println("========13번 문제========");
		int num=1234;
		System.out.println(num+"-> "+pro13(num));
		//System.out.print(num+"-> ");
		pro14(1234);
		pro15(1234,100);
		pro16(10);
		pro17();
		pro18(5);
		pro19(512);
		pro21(10000, 4);
		pro22(10);
		pro23(40);
		pro24(4, 7);
		pro25(3000, 900);
		pro25(3000, 1100);
	}
	static void pro1(int totalN) {
		/*1.
		총 지급액 N 이 주어지고 지급할 동전의 액면가 M 이 주어질 때 총 지급하여야 하는 동전의 수
		를 출력하 는 프로그램을 작성하세요
		예 ) 총 지급액 N 이 1700 이고 지급 동전의 액면가 M 이 500 일때 총 지급되어야 하는 동전의
		수는 4 이다*/
		System.out.println("========1번 문제========");
		int count =0;
		int temp = totalN;
		int [] coinM= {500,100};
		for (int i = 0; i < coinM.length; i++) {
			while(temp>coinM[i]) {
				count++;
				temp=temp-coinM[i];
			}
		}
		
		System.out.println("총 지급액 : "+totalN);
		System.out.println("동전의 액면가 : "+coinM[0]+ " "+coinM[1]);
		System.out.println("지급 총 개수 : "+count);
		
	}
	static void pro2(int n) {
		/*2. 1부터 N 까지의 홀수의 합을 for 문을 이용하여 출력하 는 프로그램을 작성하세요*/
		System.out.println("========2번 문제========");
		int sum=0;
		for (int i = 1; i <= n; i=i+2) {
			sum+=i;
		}
		System.out.println(n+"까지의 총합 : "+sum);
	}
	static void pro3(int n) {
		/*3. 1부터 N 까지의 짝수의 합을 while 문을 이용하여 출력하 는 프로그램을 작성하세요*/
		System.out.println("========3번 문제========");
		int i=0;
		int sum=0;
		while(i<=n) {
			sum=sum+i;
			i=i+2;
		}
		System.out.println(n+"까지의 총합 : "+sum);
	}
	static void pro4(int start, int end) {
		/*4. 2020년부터 3020 년 사이의 윤년이 되는 년도를 출력하세요 . 윤년 의 규칙은 아래와 같다
		ㅇ 년도를 4 로 나누어 나머지가 0 이면 윤년
		ㅇ 년도를 100 으로 나누어 나머지가 0 이면 평년
		ㅇ 년도를 400 으로 나누어 나머지가 0 이면 윤년*/
		System.out.println("========4번 문제========");
		int count=0;
		int temp = start;
		while(temp<=end) {
			if((temp % 4)==0) {
				count++;
			}
			else {
				if((temp%100)==0) {
					if((temp%400)==0) {
						count++;
					}
					else {
						;
					}
				}else {
					count++;
				}
			}
			temp++;
		}
		System.out.println(start +"~" +end+" 윤년은 총 "+count+"번 입니다.");
	}
	static int pro5(int num) {
		/*5. N의 값이 소수이면 1, 소수가 아니면 1 을 출력하는 프로그램을 작성하세요*/
		System.out.println("========5번 문제========");
		int result=1;
		int temp=2;
		while(temp<num) {
			if((num%temp)==0) {
				result=-1;
				break;
			}
			temp++;
		}
		return result;
	}
	static void pro6(int num) {
		/*6. N이하의 값 중 소수인 값을 출력하는 프로그램을 작성하세요
		예 ) N 의 값 10 이 주어질 때 출력되는 값은 2 3 5 7*/
		System.out.println("========6번 문제========");
		int ar[]=new int[num+1];
		for (int i = 2; i <= ar.length; i++) {
			for (int j = i+i; j <= ar.length; j=j+i) {
				ar[j]=i;
			}
		}
		
		for (int i = 2; i < ar.length; i++) {
			if(ar[i]==0) {
				System.out.println(i);
			}
		}
	}
	static void pro7(int num) {
		/*7. 학생의 점수 N 이 주어질때 N 의 값을 학점으로 변환하는 프로그램을 작성하세요 . 
		 * 점수에 따른	학점은 아래와 같습니다
		60 점 미만 : F
		60 ~ 69 : D
		70 ~ 79 : C
		80 ~ 89 : B
		90 ~ 100 : A*/
		System.out.println("========7번 문제========");
		if(num>=90) {
			System.out.println("A");
			return;
		}
		else if(num>=80) {
			System.out.println("B");
			return;
		}
		else if(num>=70) {
			System.out.println("C");
			return;
		}
		else if(num>=60) {
			System.out.println("D");
			return;
		}
		else {
			System.out.println("F");
		}
		return;
	}
	static void pro8(int num) {
		/*8. 2의 1 승부터 N 승까지 출력하는 프로그램을 작성하세요
		예 ) N 이 3 일때 출력결과는 8*/
		System.out.println("========8번 문제========");
		int temp=1;
		for (int i = 1; i <= num; i++) {
			temp=temp*2;
		}
		System.out.println("2 의 "+num+" 제곱은 "+temp) ;
	}
	static void pro9(int down, int up) {
		System.out.println("========9번 문제========");
		int temp=1;
		for (int i = 1; i <= up; i++) {
			temp=temp*down;
		}
		System.out.println(down+" 의 "+up+" 제곱은 "+temp) ;
	}
	static void pro10(int totalN) {
		System.out.println("========10번 문제========");
		int count =0;
		int temp = totalN;
		int [] coinM= {500,100,50,10,5,1};
		int [] countCoin= new int[coinM.length];
		
		for (int i = 0; i < coinM.length; i++) {
			while(temp>=coinM[i]) {
				countCoin[i]++;
				count++;
				temp=temp-coinM[i];
			}
		}
		
		System.out.println("총 지급액 : "+totalN);
		for (int i = 0; i < coinM.length; i++) {
			System.out.println(coinM[i]+ "원 "+countCoin[i]+"개");
		}
		System.out.println("지급 총 개수 : "+count);
	}
	static int pro11(int num) {
		System.out.println("========11번 문제========");
		int result=num/3;
		int temp=(num%3);
		System.out.print("학생수가 "+num +"일때 필요한 선풍기는 ");
		if(temp==0) {
			return result;
		}
		else {
			return result+1;
		}
	}
	static int pro12(int num) {
		System.out.println("========12번 문제========");
		System.out.print("학생수가 "+num +"일때 추가적으로 필요한 선풍기는 ");
		if(num<=12) {
			return 0;
		}
		int result=num/3-4;
		int temp=(num%3);
		
		if(temp==0) {
			return result;
		}
		else {
			return result+1;
		}
	}
	static int pro13(int num) {
		int result=1;
		while(true) {
			if((num/10)==0) {
				break;
			}
			result++;
			num=num/10;
		}
		return result;
	}
	static void pro14(int num) {
		System.out.println("========14번 문제========");
		System.out.print(num+"->");
		int temp=pro13(num);
		int total10=1;
		for (int i = 0; i < (temp/2); i++) {
			total10=total10*10;
		}
		int up = num/total10;
		int down = num%total10;
		System.out.println("선두 : "+up+"   하위 : "+down );
	}
	static void pro15(int num, int temp) {
		System.out.println("========15번 문제========");
		System.out.println(num+"-> "+(num/temp)*temp);
	}
	static void pro16(int num) {
		System.out.println("========16번 문제========");
		System.out.print(num+" 이하인 2승의 값은 ");
		int total=2;
		for (int i = 1; total <= num; i++) {
			total=total*2;
			System.out.print(i+" ");
		}
	}
	static void pro17() {
		System.out.println("========17번 문제========");
		String rspA[]= {"가위", "바위", "보"};
		String rspB[]= {"가위", "바위", "보"};
		for (int i = 0; i < rspA.length; i++) {
			for (int j = 0; j < rspB.length; j++) {
				System.out.print("A:"+rspA[i]+"B:"+rspB[j]+"일 때 승자");
				if(i==2&&j==0) {
					System.out.println("B");
				}
				else if(i==0&&j==2) {
					System.out.println("A");
				}
				else if(i<j) {
					System.out.println("B");
				}
				else if(j<i) {
					System.out.println("A");
				}
				else {
					System.out.println("없음");
				}
			}
		}
	}
	static void pro18(int num) {
		System.out.println("========18번 문제========");
		int temp = 1;
		if(num>18&&num<1) {
			System.out.println("범위 밖");
		}
		else {
			for (int i = 1; i < num; i++) {
				temp=temp*10;
			}
			System.out.println(num+"인 경우:"+temp);
		}
	}
	static void pro19(int num) {
		System.out.println("========19번 문제========");
		System.out.println(num+"일 경우의 출력");
		int temp=pro13(num);
		int count=1;
		for (int i = 1; i < temp; i++) {
			count=count*10;
			//System.out.println(i);
		}
		for (int i = 0; i < temp; i++) {
			System.out.println(num/count);
			num=num%count;
			count=count/10;
		}
	}
	static void pro21(int num, int mum) {
		System.out.println("========21번 문제========");
		int [] grade = {0, 25, 20, 15, 10};
		double result=0.0;
		if(mum>=1 && mum<=4) {
			result = (100-grade[mum])/100.0;
		}
		else {
			result = 1.0;
		}
		System.out.println("제품 가격이 "+num+"이며 회원등급이 "+mum+"인 경우 실제 판매가는 "+(num*result));
	}
	static void pro22(int num) {
		System.out.println("========22번 문제========");
		for (int i = 0; i < num/2; i++) {
			System.out.print(i+1+" ");
			System.out.print(num-i+" ");
		}
		System.out.println("");
	}
	static void pro23(int num) {
		System.out.println("========23번 문제========");
		int jari;
		int up=10;
		int count=0;
		int temp=0;
		for (int i = 1; i <= num; i++) {
			jari=pro13(i);
			temp=i;
			for (int j = 1; j <= jari; j++) {
				if((temp%up)==3 || (temp%up)==6 ||(temp%up)==9) {
					count++;
					//System.out.println(i);
				}
				temp=temp/10;
			}
		}
		System.out.println(num+"인 경우 : "+ count);
	}
	static void pro24(int num, int mum) {
		System.out.println("========24번 문제========");
		System.out.println(num+"과"+mum+"사이의 짝수");
		int p=0;
		int temp;
		int sum=0;
		if((num%2)==0) {
			temp=num;
		}else {
			temp=num+1;
		}
		for (int i = temp; i <= mum; i=i+2) {
			p=i*i;
			sum=sum+p;
			System.out.println(i+"의 제곱"+p);
		}
		System.out.println("짝수 제곱의 값은 "+sum);
	}
	static void pro25(int anum, int bmum) {
		System.out.println("========25번 문제========");
		int temp;
		System.out.println("n : "+anum+" m : "+bmum);
		
		if(anum<bmum*3) {
			temp=3*anum;
			temp=temp+bmum;
			System.out.println("n - 3, m - 1");
		}
		else {
			temp=10*bmum;
			System.out.println("m - 10");
		}
		System.out.println("total - "+temp);
	}
}






