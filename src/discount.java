/* Сумма покупки составляет а рублей. Если а больше 1000 рублей, то предоставляется скидка 15%. Вывести на экран сумму
покупки с учетом скидки либо сообщение о том, что скидка не предоставляется.
*/

import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		
		Scanner amountEnter = new Scanner(System.in);
		int amount = amountEnter.nextInt();
		double discount = amount * 0.15;
		int conToInt = (int)discount; // converting to integer
		int resultDiscount;
		
		if (amount >= 1000) {
			resultDiscount = amount - conToInt;
			System.out.println("Purchase amount with discount: " + resultDiscount + "rub.");
		} else {
			System.out.println("Discount not available.");
		}
		
	}
}
