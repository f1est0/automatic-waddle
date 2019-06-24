import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits in the array: ");
        int a = Integer.parseInt(sc.next());

        /*if (a == o) {
            System.out.print("Aloxa");
        }*/

        int [] arr = new int[a];
        int ch = 0;

        while (ch != a) {
            System.out.print("Enter your number: ");
            int i = Integer.parseInt(sc.next());
            arr[ch] = i;
            ch++;
        }

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

    }
}
