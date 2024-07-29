import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two value : ");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Denominator should not be 0, try again");
        }
        System.out.println("Bye");

    }
}
