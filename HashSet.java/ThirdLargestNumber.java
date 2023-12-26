import java.util.HashSet;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] array = {1, 9, 3, 5, 3, 2, 8, 8, 8};
        int thirdLargest = findThirdLargest(array);
        System.out.println("The 3rd largest number is: " + thirdLargest);
    }

    public static int findThirdLargest(int[] array) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        
        // Add unique elements to the HashSet
        for (int num : array) {
            uniqueNumbers.add(num);
        }

        if (uniqueNumbers.size() < 3) {
            System.out.println("Array doesn't have a 3rd largest element.");
            return -1; // Some placeholder value to indicate failure
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        // Find the three largest unique numbers
        for (int num : uniqueNumbers) {
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest) {
                thirdLargest = num;
            }
        }

        return thirdLargest;
    }
}
