package company;
import employees.Employee;
import employees.Regular;
import employees.PartTime;

public class Company {
	private Employee[] employees;
	private int count;
	private int capital;
	
	public Company(int employeeCount, int caputal) {
		employees = new Employee[employeeCount];
		this.capital=caputal;
		this.count=0;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public int getCount() {
		return count;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}
	public void showInfo() {
		System.out.println("�ں��� : "+capital);
		System.out.println("����� : "+count);
	}
	
	public void showInfo(boolean listFlag) {
		showInfo();
		if(listFlag) {
			showList();
		}
	}
	public void showList() {
		for (Employee emp : employees) {
			if (emp instanceof Regular) {
				System.out.println("����� : "+emp.getName()+"[������]");
			}
			else {
				System.out.println("����� : "+emp.getName()+"[��ƮŸ������]");
			}
		}
	}
	public boolean hire(Employee employee) {
		if(count<employees.length) {
			employees[count]=employee;
			count++;
			System.out.println(employee.getName()+"���� ����Ͽ����ϴ�.");
			return true;
		}
		System.err.println("���̻� ����� �� �����ϴ�.");//������ ��Ʈ���̾ �׷� �ƹ����� ������
		return false;
	}
	public Employee find(String name) {
		for (Employee emp : employees) {
			if(emp.getName().equals(name)) {
				return emp;
			}
		}
		return null;
	}
	public void pay() {
		for (int i = 0; i < count; i++) {
			if(employees[i] instanceof Regular) {
				int tmp = ((Regular)employees[i]).pay();
				System.out.println(employees[i].getName()+"���� "+tmp+"���� ������.");
				capital-=tmp;
			}
			else {
				PartTime pt = (PartTime)employees[i];
				System.out.println(pt.getName()+"���� "+pt.pay()+"���� ������.");
				capital-=pt.pay();
			}
		}
	}
	public Employee[] findAll(String name) {
		//name ����� ���� ī��Ʈ
		int cnt=0;
		for (Employee emp : employees) {
			if(emp.getName().equals(name)) {
				cnt++;
			}
		}
		//�˻��� ����� ���� �Ѵٸ�
		if(cnt>0) {
			Employee[]retemp=new Employee[cnt];
			int idx=0;
			for (Employee employee : employees) {
				if(employee.getName().equals(name)) {
					retemp[idx]=employee;
					idx++;
				}			
			}
			return retemp;
		}
		
		return null;
		//ī��Ʈ ����ŭ �迭 ����
		
		//����� ã�Ƽ� ������ �迭�� ���������� ����
	
	}
	
}
