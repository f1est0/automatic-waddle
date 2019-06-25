/* Из двух случайных чисел, одно из которых четное, а другое нечетное, определить и вывести на экран нечетное число. */

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        int oneArg, twoArg;
	
	// Вводим два числа для сравнения.
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter one number: ");
        oneArg = enter.nextInt();
        System.out.print("Enter two number: ");
        twoArg = enter.nextInt();
	    
	// Определяем четное и нечетное.
        int oneNumber = oneArg % 2;
        int twoNumber = twoArg % 2;

        if (oneNumber == 0) {
            if (twoNumber == 0) {
                System.out.println("Both even.");
            } else {
                System.out.println("Odd number: " + twoArg);
            }
        } else if((oneNumber != 0)&&(twoNumber != 0)){
            System.out.println("Both odd.");
        } else {
            System.out.println("Odd number: " + oneArg);
        }
    }
}
