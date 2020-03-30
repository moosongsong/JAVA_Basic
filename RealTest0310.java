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
		System.out.println(pro11(5)+"��");
		System.out.println(pro12(5)+"��");
		System.out.println("========13�� ����========");
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
		�� ���޾� N �� �־����� ������ ������ �׸鰡 M �� �־��� �� �� �����Ͽ��� �ϴ� ������ ��
		�� ����� �� ���α׷��� �ۼ��ϼ���
		�� ) �� ���޾� N �� 1700 �̰� ���� ������ �׸鰡 M �� 500 �϶� �� ���޵Ǿ�� �ϴ� ������
		���� 4 �̴�*/
		System.out.println("========1�� ����========");
		int count =0;
		int temp = totalN;
		int [] coinM= {500,100};
		for (int i = 0; i < coinM.length; i++) {
			while(temp>coinM[i]) {
				count++;
				temp=temp-coinM[i];
			}
		}
		
		System.out.println("�� ���޾� : "+totalN);
		System.out.println("������ �׸鰡 : "+coinM[0]+ " "+coinM[1]);
		System.out.println("���� �� ���� : "+count);
		
	}
	static void pro2(int n) {
		/*2. 1���� N ������ Ȧ���� ���� for ���� �̿��Ͽ� ����� �� ���α׷��� �ۼ��ϼ���*/
		System.out.println("========2�� ����========");
		int sum=0;
		for (int i = 1; i <= n; i=i+2) {
			sum+=i;
		}
		System.out.println(n+"������ ���� : "+sum);
	}
	static void pro3(int n) {
		/*3. 1���� N ������ ¦���� ���� while ���� �̿��Ͽ� ����� �� ���α׷��� �ۼ��ϼ���*/
		System.out.println("========3�� ����========");
		int i=0;
		int sum=0;
		while(i<=n) {
			sum=sum+i;
			i=i+2;
		}
		System.out.println(n+"������ ���� : "+sum);
	}
	static void pro4(int start, int end) {
		/*4. 2020����� 3020 �� ������ ������ �Ǵ� �⵵�� ����ϼ��� . ���� �� ��Ģ�� �Ʒ��� ����
		�� �⵵�� 4 �� ������ �������� 0 �̸� ����
		�� �⵵�� 100 ���� ������ �������� 0 �̸� ���
		�� �⵵�� 400 ���� ������ �������� 0 �̸� ����*/
		System.out.println("========4�� ����========");
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
		System.out.println(start +"~" +end+" ������ �� "+count+"�� �Դϴ�.");
	}
	static int pro5(int num) {
		/*5. N�� ���� �Ҽ��̸� 1, �Ҽ��� �ƴϸ� 1 �� ����ϴ� ���α׷��� �ۼ��ϼ���*/
		System.out.println("========5�� ����========");
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
		/*6. N������ �� �� �Ҽ��� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		�� ) N �� �� 10 �� �־��� �� ��µǴ� ���� 2 3 5 7*/
		System.out.println("========6�� ����========");
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
		/*7. �л��� ���� N �� �־����� N �� ���� �������� ��ȯ�ϴ� ���α׷��� �ۼ��ϼ��� . 
		 * ������ ����	������ �Ʒ��� �����ϴ�
		60 �� �̸� : F
		60 ~ 69 : D
		70 ~ 79 : C
		80 ~ 89 : B
		90 ~ 100 : A*/
		System.out.println("========7�� ����========");
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
		/*8. 2�� 1 �º��� N �±��� ����ϴ� ���α׷��� �ۼ��ϼ���
		�� ) N �� 3 �϶� ��°���� 8*/
		System.out.println("========8�� ����========");
		int temp=1;
		for (int i = 1; i <= num; i++) {
			temp=temp*2;
		}
		System.out.println("2 �� "+num+" ������ "+temp) ;
	}
	static void pro9(int down, int up) {
		System.out.println("========9�� ����========");
		int temp=1;
		for (int i = 1; i <= up; i++) {
			temp=temp*down;
		}
		System.out.println(down+" �� "+up+" ������ "+temp) ;
	}
	static void pro10(int totalN) {
		System.out.println("========10�� ����========");
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
		
		System.out.println("�� ���޾� : "+totalN);
		for (int i = 0; i < coinM.length; i++) {
			System.out.println(coinM[i]+ "�� "+countCoin[i]+"��");
		}
		System.out.println("���� �� ���� : "+count);
	}
	static int pro11(int num) {
		System.out.println("========11�� ����========");
		int result=num/3;
		int temp=(num%3);
		System.out.print("�л����� "+num +"�϶� �ʿ��� ��ǳ��� ");
		if(temp==0) {
			return result;
		}
		else {
			return result+1;
		}
	}
	static int pro12(int num) {
		System.out.println("========12�� ����========");
		System.out.print("�л����� "+num +"�϶� �߰������� �ʿ��� ��ǳ��� ");
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
		System.out.println("========14�� ����========");
		System.out.print(num+"->");
		int temp=pro13(num);
		int total10=1;
		for (int i = 0; i < (temp/2); i++) {
			total10=total10*10;
		}
		int up = num/total10;
		int down = num%total10;
		System.out.println("���� : "+up+"   ���� : "+down );
	}
	static void pro15(int num, int temp) {
		System.out.println("========15�� ����========");
		System.out.println(num+"-> "+(num/temp)*temp);
	}
	static void pro16(int num) {
		System.out.println("========16�� ����========");
		System.out.print(num+" ������ 2���� ���� ");
		int total=2;
		for (int i = 1; total <= num; i++) {
			total=total*2;
			System.out.print(i+" ");
		}
	}
	static void pro17() {
		System.out.println("========17�� ����========");
		String rspA[]= {"����", "����", "��"};
		String rspB[]= {"����", "����", "��"};
		for (int i = 0; i < rspA.length; i++) {
			for (int j = 0; j < rspB.length; j++) {
				System.out.print("A:"+rspA[i]+"B:"+rspB[j]+"�� �� ����");
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
					System.out.println("����");
				}
			}
		}
	}
	static void pro18(int num) {
		System.out.println("========18�� ����========");
		int temp = 1;
		if(num>18&&num<1) {
			System.out.println("���� ��");
		}
		else {
			for (int i = 1; i < num; i++) {
				temp=temp*10;
			}
			System.out.println(num+"�� ���:"+temp);
		}
	}
	static void pro19(int num) {
		System.out.println("========19�� ����========");
		System.out.println(num+"�� ����� ���");
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
		System.out.println("========21�� ����========");
		int [] grade = {0, 25, 20, 15, 10};
		double result=0.0;
		if(mum>=1 && mum<=4) {
			result = (100-grade[mum])/100.0;
		}
		else {
			result = 1.0;
		}
		System.out.println("��ǰ ������ "+num+"�̸� ȸ������� "+mum+"�� ��� ���� �ǸŰ��� "+(num*result));
	}
	static void pro22(int num) {
		System.out.println("========22�� ����========");
		for (int i = 0; i < num/2; i++) {
			System.out.print(i+1+" ");
			System.out.print(num-i+" ");
		}
		System.out.println("");
	}
	static void pro23(int num) {
		System.out.println("========23�� ����========");
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
		System.out.println(num+"�� ��� : "+ count);
	}
	static void pro24(int num, int mum) {
		System.out.println("========24�� ����========");
		System.out.println(num+"��"+mum+"������ ¦��");
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
			System.out.println(i+"�� ����"+p);
		}
		System.out.println("¦�� ������ ���� "+sum);
	}
	static void pro25(int anum, int bmum) {
		System.out.println("========25�� ����========");
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






