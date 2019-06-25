import java.util.*;

public class Main {

    public static void main(String[] args) {
        int r = 0;
        Scanner sc = new Scanner(System.in);

        // Указываем размер массива, для этого просим ввести целое число, преобразуем в в int, присваеваем массиву.
        System.out.print("Enter number of digits in the array: ");
        int a = Integer.parseInt(sc.next());
        int [] arr = new int[a];

        // Вводим цифры в массив, пока незакончится размер.
        for (int ch = 0; ch != a; ch++) {
            System.out.print("Enter your number: ");
            int i = Integer.parseInt(sc.next());
            arr[ch] = i;
        }

        // Выводим результат с числами и ячейков в массиве.
        for (int chR = 0; chR != a; chR++){
            System.out.println("Number from array [" + chR + "]: " + arr[r]);
            r++;
        }
    }
}
