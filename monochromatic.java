import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isMonochromatic = true;
        int digit = number % 10;
        number /= 10;

        while (number != 0) {
            if (digit != number % 10) {
                isMonochromatic = false;
                break;
            }
            digit = number % 10;
            number /= 10;
        }

        if (isMonochromatic) {
            System.out.println("The number is monochromatic.");
        } else {
            System.out.println("The number is not monochromatic.");
        }
    }
}
