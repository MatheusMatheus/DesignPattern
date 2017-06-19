package strategy;

import java.math.BigDecimal;

public class CreditCardStrategy implements PaymentStrategy {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dayOfExpiry;

	public CreditCardStrategy(String name, String cardNumber, String cvv, String dayOfExpiry) {
		setCardNumber(cardNumber);
		setCvv(cvv);
		setDayOfExpiry(dayOfExpiry);
		setName(name);	
	}

	@Override
	public void pay(BigDecimal amount) {
		 System.out.println(amount +" paid with credit/debit card");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getDayOfExpiry() {
		return dayOfExpiry;
	}

	public void setDayOfExpiry(String dayOfExpiry) {
		this.dayOfExpiry = dayOfExpiry;
	}

}
