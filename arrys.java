import java.util.Scanner;

public class arrys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-ENTER THE SIZE OF ARRAY");
        int a = sc.nextInt();
        int[] arr = new int[a];

        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("REVERSED ARRAY IS: ");
        for (int i = a - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
