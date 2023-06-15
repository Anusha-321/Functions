package Functions;

import java.util.Scanner;

public class FunctionClass {
    public static void main(String[] args) {
        //function with return type with arguments
        int a, b, sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of A::");
        a = scanner.nextInt();

        System.out.println("Enter value of B::");
        b = scanner.nextInt();

        sum = calculateSum(a , b);
        System.out.println("Method with return type with arguments");
        System.out.println("Sum::"+sum);

    }

    private static int calculateSum(int a, int b) {
        return a + b;
    }
}
