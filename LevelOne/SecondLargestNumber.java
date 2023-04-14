package ClassWork.Assessment.LevelOne;
import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] intArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intArray[i] = Integer.parseInt(numbers[i]);
        }

        int highestNumber = 0;
        int secondHighest = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == highestNumber) {

            }
            else if (intArray[i] > highestNumber) {
                secondHighest = highestNumber;
                highestNumber = intArray[i];
            }
            else if (intArray[i] > secondHighest) {
                secondHighest = intArray[i];
            }
        }
        if (secondHighest == 0) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondHighest);
        }
    }
}

