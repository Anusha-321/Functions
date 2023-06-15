package Functions;

import java.util.Scanner;

public class FunctionWithReturnTypeWithoutArgument {
    public static void main(String[] args) {
        // functions with return type without arguments
        int sum;
        sum = FindSum();
        System.out.println(sum);

    }

    private static int FindSum() {
        int a, b ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of A::");
        a = scanner.nextInt();

        System.out.println("Enter value of B::");
        b = scanner.nextInt();


        return a+b;

    }

}
