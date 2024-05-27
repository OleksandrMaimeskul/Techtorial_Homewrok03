import java.util.Scanner;

public class TASk5 {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers(Push enter after each number): ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        boolean twoInLineEqualOrNot = (firstNumber == secondNumber) || (secondNumber == thirdNumber);
        System.out.println(twoInLineEqualOrNot);

    }
}
