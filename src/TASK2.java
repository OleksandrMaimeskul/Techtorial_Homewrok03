import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers(Push enter after each number): ");
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int squareOfFirstValue = firstValue * firstValue;
        int secondValue = scanner.nextInt();
        int squareOfSecondValue = secondValue*secondValue;
        int thirdValue = scanner.nextInt();
        int squareOfThirdValue = thirdValue*thirdValue;
        int summaryOfValues = squareOfFirstValue + squareOfSecondValue + squareOfThirdValue;
        System.out.println("Square of Numbers: ");
        System.out.println(squareOfFirstValue);
        System.out.println(squareOfSecondValue);
        System.out.println(squareOfThirdValue);
        System.out.println("Sum of numbers: ");
        System.out.println(summaryOfValues);

    }
}
