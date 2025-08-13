import java.util.Scanner;
public class divi_by_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR SIZE OF ARRAYS");
        int a = sc.nextInt();
        int [] arr = new int[a];

        System.out.println("ENTER"+  a + "ELEMENTS");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("NUM DIVI BY BOTH 3 AND 5:");
        boolean found = false;
        for (int i = 0; i < a; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.println(arr[i]);
                found = true;
            }
        }
    }


























}














//import java.util.Scanner;
//
//public class DivisibleBy3And5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input array size
//        System.out.println("ENTER SIZE");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        // Input array elements
//        System.out.println("ENTER " + n + " ELEMENTS");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // Check divisibility by both 3 and 5
//        System.out.println("NUMBERS DIVISIBLE BY BOTH 3 AND 5:");
//        boolean found = false;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
//                System.out.println(arr[i]);
//                found = true;
//            }
//        }
//
//        // If no numbers found
//        if (!found) {
//            System.out.println("No numbers divisible by both 3 and 5 found.");
//        }
//    }
//}