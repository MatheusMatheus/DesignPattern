package strategy;

import java.math.BigDecimal;

public class Item {
	private String upcCode;
	private BigDecimal price;

	public Item(String upcCode, BigDecimal price) {
		super();
		this.upcCode = upcCode;
		this.price = price;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	
}
