import java.util.Scanner;

public class Delete_Array_Elm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the index of the element to delete: ");
        int dltIndex = scanner.nextInt();

        if (dltIndex < 0 || dltIndex >= n) {
            System.out.println("Invalid index, deletion failed.");
        } else {
            // Shift elements to the left to overwrite the element to be deleted
            for (int i = dltIndex; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // Reduce the size of the array

            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
