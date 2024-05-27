import java.util.Scanner;

public class TASK4 {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers(Push enter after each number): ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        boolean allEqualOrNot = (firstNumber  == secondNumber) && (secondNumber == thirdNumber)
                && (firstNumber  == thirdNumber);
        System.out.println(allEqualOrNot);

    }
}
