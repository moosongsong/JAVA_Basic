package Part10Main.��������ǿ���;

public class Car {
	private int fuel;
	private boolean engineOn;
	private EngineStopException enginestopex;
	private NotEnoughFuelException notexcep;
	
	public Car(int fuel, boolean engineOn) {
		this.fuel=fuel;
		this.engineOn=engineOn;
	}
		
	public EngineStopException getEnginestopex() {
		return enginestopex;
	}

	public NotEnoughFuelException getNotexcep() {
		return notexcep;
	}

	public void setEnginestopex(EngineStopException enginestopex) {
		this.enginestopex = enginestopex;
	}

	public void setNotexcep(NotEnoughFuelException notexcep) {
		this.notexcep = notexcep;
	}

	public void run(int dist){
		try {
			if(isEngineOn()!=true) {
				throw enginestopex;
			}
			if(fuel < (dist/10)) {
				throw notexcep;
			}
			System.out.println(dist+"km�� �����Ͽ���.");
			fuel-=(dist/10);
			System.out.println("���� ���� : "+fuel);
			
		} catch (CarException ce) {
			System.out.println(ce.getMessage());
			ce.doException(this);
			run(dist);
		}
		finally {
			System.out.println("��������");
		}
	}
	
	public void setFuel(int fuel) {
		this.fuel +=fuel;
	}

	public int getFuel() {
		return fuel;
	}

	public boolean isEngineOn() {
		return engineOn;
	}

	public void setEngineOn() {
		if(engineOn==false) {
			engineOn=true;
		}
		else {
			this.engineOn = false;
		}
	}
}
