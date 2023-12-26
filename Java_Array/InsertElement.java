import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        int[] a2 = new int[n + 1];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int insert = scanner.nextInt();

        System.out.print("Enter the position to insert the element: ");
        int pos = scanner.nextInt();

        for (int i = 0; i < pos - 1; i++) {
            a2[i] = a[i];
        }
        a2[pos - 1] = insert;
        for (int i = pos - 1; i < n; i++) {
            a2[i + 1] = a[i];
        }

        System.out.println("Resulting array after insertion:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(a2[i] + " ");
        }

       
    }
}
