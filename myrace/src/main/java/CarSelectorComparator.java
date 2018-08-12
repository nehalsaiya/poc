import java.util.Comparator;

public class CarSelectorComparator implements Comparator<Car> {

	public int compare(Car o1, Car o2) {
		
		if(o1.calculateSpeed() == o2.calculateSpeed()) {
			return 0;
		}
		
		if(o1.calculateSpeed() > o2.calculateSpeed()) {
			return 1;
		} 
		
		return  -1  ;
	}

}
