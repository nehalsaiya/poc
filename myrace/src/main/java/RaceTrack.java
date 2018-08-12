
public class RaceTrack {


	@Override
	public String toString() {
		return "RaceTrack [lap_distance=" + lap_distance + ", no_of_lap=" + no_of_lap + "]";
	}

	//  Lap distance
	private double lap_distance;
	
	//  Number of laps to complete
	private int no_of_lap;
	
	//Time it takes to make a pitstop
	private static long  pitstop;

	public double getLap_distance() {
		return lap_distance;
	}

	public void setLap_distance(double lap_distance) {
		this.lap_distance = lap_distance;
	}

	public int getNo_of_lap() {
		return no_of_lap;
	}

	public void setNo_of_lap(int no_of_lap) {
		this.no_of_lap = no_of_lap;
	}

	public static long getPitstop() {
		return pitstop;
	}

	public static void setPitstop(long pitstop) {
		RaceTrack.pitstop = pitstop;
	}

	public RaceTrack(double lap_distance, int no_of_lap,long pitstop) {
		this.lap_distance = lap_distance;
		this.no_of_lap = no_of_lap;
		RaceTrack.pitstop = pitstop;
	}
	
	

}
