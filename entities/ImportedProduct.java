package entities;

public class ImportedProduct extends Product1 {

private Double customFee;

public ImportedProduct() {
	super();
}

public ImportedProduct(String name, Double price, Double customFee) {
	super(name, price);
	this.customFee = customFee;
}

public Double getCustomFee() {
	return customFee;
}

public void setCustomFee(Double customFee) {
	this.customFee = customFee;
}

public double totalPrice(double customFee) {
	
	return this.customFee = customFee / 100;
}


@Override
public String priceTag() {
	
	
	return super.priceTag() ;
	
	
}





}
