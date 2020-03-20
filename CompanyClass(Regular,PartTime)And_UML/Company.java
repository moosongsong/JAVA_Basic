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
		System.out.println("자본금 : "+capital);
		System.out.println("사원수 : "+count);
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
				System.out.println("사원명 : "+emp.getName()+"[정직원]");
			}
			else {
				System.out.println("사원명 : "+emp.getName()+"[파트타임지원]");
			}
		}
	}
	public boolean hire(Employee employee) {
		if(count<employees.length) {
			employees[count]=employee;
			count++;
			System.out.println(employee.getName()+"님을 고용하였습니다.");
			return true;
		}
		System.err.println("더이상 고용할 수 없습니다.");//별도의 스트림이어서 그래 아무때나 막나옴
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
				System.out.println(employees[i].getName()+"에게 "+tmp+"원을 지급함.");
				capital-=tmp;
			}
			else {
				PartTime pt = (PartTime)employees[i];
				System.out.println(pt.getName()+"에게 "+pt.pay()+"원을 지급함.");
				capital-=pt.pay();
			}
		}
	}
	public Employee[] findAll(String name) {
		//name 사원을 수를 카운트
		int cnt=0;
		for (Employee emp : employees) {
			if(emp.getName().equals(name)) {
				cnt++;
			}
		}
		//검색된 사원이 존재 한다면
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
		//카운트 수만큼 배열 생성
		
		//사원을 찾아서 생성된 배열에 순차적으로 저장
	
	}
	
}
