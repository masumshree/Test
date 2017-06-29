package coReJavaConceptPackage;

import java.util.Comparator;

public class FligtComprator implements Comparator<Object>{

	int price;
	int tax;
	int discount;
	public FligtComprator(int price, int tax, int discount) {
		this.price = price;
		this.tax = tax;
		this.discount = discount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
