package coReJavaConceptPackage;

import java.util.Comparator;

public class FligSearch implements Comparator<CrazyAir>{

	public FligSearch() {
		
	}

	@Override
	public int compare(CrazyAir ca, CrazyAir ca1) {
		
		return (int)ca.getPrice()-ca1.getPrice();
	}
	

}
