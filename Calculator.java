import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter the operator (+, -, *, /, %, x to exit): ");
            char op = input.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter number 1: ");
                int num1 = input.nextInt();
                System.out.print("Enter number 2: ");
                int num2 = input.nextInt();

                switch (op) {
                    case '+':
                        ans = num1 + num2;
                        break;
                    case '-':
                        ans = num1 - num2;
                        break;
                    case '*':
                        ans = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            ans = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero");
                            continue; // skip the rest of the loop and prompt for operator again
                        }
                        break;
                    case '%':
                        if (num2 != 0) {
                            ans = num1 % num2;
                        } else {
                            System.out.println("Error: Division by zero");
                            continue; // skip the rest of the loop and prompt for operator again
                        }
                        break;
                }

                System.out.println("The result of the operation is: " + ans);
            } else {
                System.out.println("Invalid operation");
            }
        }

        input.close();
    }
}
