import java.util.Random;
import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public int quantityOfArray() {
        System.out.println("Enter the quantity of elements for calculation.");
        return scanner.nextInt();
    }

    public int maxValue() {
        System.out.println("Enter the maximum possible value of elements for calculation.");
        return scanner.nextInt();
    }

    public int minValue() {
        System.out.println("Enter the minimum possible value of elements for calculation.");
        return scanner.nextInt();
    }

    public void workOfArray() {
        int[] array = new int[quantityOfArray()];
        int max = maxValue();
        int min = minValue();
        int sum = 0;
        int maxOfArray = 0;
        int minOfArray = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
            if (i > 4 && i % 5 == 0) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
            sum += array[i];
            if (i == 2) {
                maxOfArray = Math.max(array[i], array[i - 1]);
                minOfArray = Math.min(array[i], array[i - 1]);
            } else if (i > 2) {
                maxOfArray = Math.max(array[i], maxOfArray);
                minOfArray = Math.min(array[i], minOfArray);
            }
        }
        System.out.println();
        System.out.println("Sum of all elements of array: " + sum);
        System.out.println("Maximum value of elements of array: " + maxOfArray);
        System.out.println("Minimum value of elements of array: " + minOfArray);
    }
}
