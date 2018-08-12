
public class Car {
	//Fuel capacity
	
	private int fuel_cpty;

	///o   Time to complete a lap
	
	private long lap_time;

	//o   Average fuel consumption per lap
	private int avg_fuel_per_lap;

	
	private RaceTrack raceTrack;
	
	public int getFuel_cpty() {
		return fuel_cpty;
	}

	public void setFuel_cpty(int fuel_cpty) {
		this.fuel_cpty = fuel_cpty;
	}

	public long getLap_time() {
		return lap_time;
	}

	public void setLap_time(long lap_time) {
		this.lap_time = lap_time;
	}

	public int getAvg_fuel_per_lap() {
		return avg_fuel_per_lap;
	}

	public void setAvg_fuel_per_lap(int avg_fuel_per_lap) {
		this.avg_fuel_per_lap = avg_fuel_per_lap;
	}

	public RaceTrack getRaceTrack() {
		return raceTrack;
	}

	public void setRaceTrack(RaceTrack raceTrack) {
		this.raceTrack = raceTrack;
	}
	
	public Car(int fuel_cpty, long lap_time, int avg_fuel_per_lap, RaceTrack raceTrack) {
		this.fuel_cpty = fuel_cpty;
		this.lap_time = lap_time;
		this.avg_fuel_per_lap = avg_fuel_per_lap;
		this.raceTrack = raceTrack;
	}
	
	public double calculateSpeed() {
		
		double i = 0;
		double noOfPitStops=0;
		if((this.getAvg_fuel_per_lap()*raceTrack.getNo_of_lap()/this.fuel_cpty)>=1){
			noOfPitStops=this.getAvg_fuel_per_lap()*raceTrack.getNo_of_lap()/this.fuel_cpty;
		}
		
	 i=raceTrack.getLap_distance()*raceTrack.getNo_of_lap()/((this.getLap_time()*raceTrack.getNo_of_lap())-(noOfPitStops*raceTrack.getPitstop()));
		return i;
	}

	@Override
	public String toString() {
		return "Car [fuel_cpty=" + fuel_cpty + ", lap_time=" + lap_time + ", avg_fuel_per_lap=" + avg_fuel_per_lap
				+ ", raceTrack=" + raceTrack + "]";
	}
}
