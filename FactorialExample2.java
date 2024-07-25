public class FactorialExample2 {
    static int factorialrec(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorialrec(n - 1));
    }

    public static void main(String args[]) {
        int i, fact = 1;
        int number = 4;// It is the number to calculate factorial
        fact = factorialrec(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
