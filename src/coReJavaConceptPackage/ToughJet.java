package coReJavaConceptPackage;

public class ToughJet {
int discount;
int tax;
int basePrice;
public int getDiscount() {
	return discount;
}

public ToughJet(int discount, int tax, int basePrice) {

	this.discount = discount;
	this.tax = tax;
	this.basePrice = basePrice;
}

public void setDiscount(int discount) {
	this.discount = discount;
}
public int getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}
public int getBasePrice() {
	return basePrice;
}
public void setBasePrice(int basePrice) {
	this.basePrice = basePrice;
}

@Override
public String toString() {
	int val=basePrice+(basePrice*tax/100)-(basePrice*discount/100);
	return "ToughJet ::"+val;
}


}
