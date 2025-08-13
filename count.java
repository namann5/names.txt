import java.util.Scanner;

public class count {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int a = sc.nextInt();

        int temp = a;

        while (a > 10) {

            a = a / 10;

        }

        System.out.println("First digit is: " + a);

        System.out.println("Last digit is: " + temp % 10);

    }

}