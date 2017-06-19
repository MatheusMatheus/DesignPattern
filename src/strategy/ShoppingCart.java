package strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> itens;
	
	public void addItem(Item item) {
		getItens().add(item);
	}
	
	public void removeItem(Item item) {
		getItens().remove(item);
	}
	
	public BigDecimal calculateTotal() {
		BigDecimal sum = new BigDecimal(0);
		for(Item item : getItens()) {
			sum = sum.add(item.getPrice());
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod) {
		BigDecimal amount = calculateTotal();
		paymentMethod.pay(amount);
	}
	
	public ShoppingCart() {
		setItens(new ArrayList<>());
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	
}
