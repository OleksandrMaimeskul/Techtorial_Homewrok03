import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the Rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Please enter the width of the Rectangle: ");
        double length = scanner.nextDouble();
        int areaTypeCast = (int) (width * length);
        System.out.println("Area type cast: " + areaTypeCast);

    }
}
