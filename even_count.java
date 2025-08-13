import java.util.Scanner;

public class even_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER SIZE");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("ENTER " + n + " ELEMENTS");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("YOUR OUTPUT IS " + count);
    }
}
