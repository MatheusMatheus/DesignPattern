package strategy.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class StrategyPattern {
	public static int totalValues(List<Integer> values, Predicate<Integer> selector) {
		int result = 0;
		for(int e : values) {
			if(selector.test(e))
				result += e;
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(totalValues(numbers, e -> e % 2 == 0));
	}
}
