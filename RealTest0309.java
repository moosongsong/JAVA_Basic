package HappyNewYear;
public class RealTest0309 {
	public static void main(String[] args) {
		/*
		//�迭���� ���� ���� ���� ���ڿ� Ƚ��
		//���� �� �ڵ�
		int ar[]= {1,2,3,4,5,6,1,9,9,7,7,7};
		int result[]= {0,0,0,0,0,0,0,0,0};
		int temp=0;
		for(int i =0 ; i<ar.length ; i++) {
			temp = ar[i];
			result[temp-1]+=1;
		}
		temp=result[0];
		int ss=0;
		for(int i=1;i<result.length;i++) {
			if(temp<result[i]) {
				temp=result[i];
				ss=i;
			}
		}
		System.out.println("���� �迭���� ���� ���� ��Ÿ���� ���� " +(ss+1)+ "�̸� "+result[ss]+"ȸ ��Ÿ���ϴ�.");
		*/
		
		//������� ���� ��
		int ar[]= {1,2,3,4,5,6,1,9,9,7,7,7};
		int result[]= {0,0,0,0,0,0,0,0,0,0};
		for(int i =0 ; i<ar.length ; i++) {
			result[ar[i]]+=1;
		}
		int max=result[0];//or 0
		int idx=0;
		for(int i=0;i<result.length;i++) {
			if(max<result[i]) {
				max=result[i];
				idx=i;
			}
		}
		System.out.println("���� �迭���� ���� ���� ��Ÿ���� ���� " +idx+ "�̸� "+result[idx]+"ȸ ��Ÿ���ϴ�.");
		
		/*
		//������ ���ϱ� for i<-1 to 10�� step 2
		//���� ���� ��
		double result = 0;
		double temp = 1;
		for(int i = 1 ; i<=100000000 ; i=i+2){
			result += (1.0/(double)i)*temp;
			temp = temp *(-1);
		}
		result=result*4;
		System.out.println(result);
		*/
		
		//������� ���� ��
		double tot =0 ;
		for(int i =1;i<1000000000;i+=2) {
			if(((i/2)%2)==0) {
				tot+=1.0/i;
			}
			else {
				tot-=1.0/i;
			}
		}
		tot*=4;
		System.out.println(tot);
		//
	}
}
