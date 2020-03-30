package Part10Main.사용자정의예외;

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
			System.out.println(dist+"km을 주행하였다.");
			fuel-=(dist/10);
			System.out.println("남은 연료 : "+fuel);
			
		} catch (CarException ce) {
			System.out.println(ce.getMessage());
			ce.doException(this);
			run(dist);
		}
		finally {
			System.out.println("주행종료");
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
