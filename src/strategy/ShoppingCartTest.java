package strategy;

import java.math.BigDecimal;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("1234", new BigDecimal(50));
		Item item2 = new Item("111", new BigDecimal("100"));
		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.pay(new PaypalStrategy("matheus@gmail.com", "123456"));
		cart.pay(new CreditCardStrategy("Matheus", "123456", "123", "2050"));
	}
}
