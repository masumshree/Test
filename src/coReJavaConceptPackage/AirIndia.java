package coReJavaConceptPackage;

public class AirIndia {
int price;

public AirIndia(int price) {
	
	this.price = price;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "AirIndia [price=" + price + "]";
}

}
