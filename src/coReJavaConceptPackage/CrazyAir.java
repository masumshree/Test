package coReJavaConceptPackage;

public class CrazyAir {
int price;

public CrazyAir(int price) {
	
	this.price = price;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
public String toString(){

    return "CrazyAir: "+this.price;

}
}
