/* Сумма покупки составляет а рублей. Если а больше 1000 рублей, то предоставляется скидка 15%. Вывести на экран сумму
покупки с учетом скидки либо сообщение о том, что скидка не предоставляется. */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Просим ввести стоимость покупки.
        Scanner amountEnter = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = amountEnter.nextInt();

        // Считаем скидку в 15%
        double discount = amount * 0.15;
        int conToInt = (int) discount;
        int resultDiscount;

        if (amount >= 1000) {
            resultDiscount = amount - conToInt;
            System.out.println("Purchase amount with discount: " + resultDiscount + "rub.");
        } else {
            System.out.println("Discount not available.");
        }
  }
}
