import java.util.ArrayList;
import java.util.Collections;

public class RaceCarSelector {
	
	public static void main(String[] args) {
		
		RaceTrack r = new RaceTrack(6, 3, 2);
		Car car1 = new Car(2, 4, 2, r);
		Car car2 = new Car(2, 4, 2, r);
		Car car3 = new Car(2, 4, 2, r);
		Car car4 = new Car(80, 4, 2, r);
		
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		
		CarSelectorComparator c = new CarSelectorComparator();
		Collections.sort(carList, c);
		
		carList.get(0);
		System.out.println(carList.get(0));
	}
	

}
