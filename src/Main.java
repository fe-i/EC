import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");
        System.out.print("Enter an expression with +, - , * , /, %, or ^\nwith appropriate spacing. (ex: 6 / 9 ): ");
        String userInput = scanner.nextLine();
        int num1 = Integer.parseInt(userInput.substring(0, userInput.indexOf(" ")));
        String operation = userInput.substring(userInput.indexOf(" ") + 1, userInput.indexOf(" ") + 2);
        int num2 = Integer.parseInt(userInput.substring(userInput.indexOf(operation) + 2));

        Calculator calc = new Calculator(num1, num2);

        System.out.print("The result of " + userInput + " is: ");
        if (operation.equals("+")) {
            System.out.println(calc.add());
        }
        else if (operation.equals("-")) {
            System.out.println(calc.subtract());
        }
        else if (operation.equals("*")) {
            System.out.println(calc.multiply());
        }
        else if (operation.equals("/")) {
            System.out.println(calc.divide());
        }
        else if (operation.equals("%")) {
            System.out.println(calc.mod());
        }
        else if (operation.equals("^")) {
            System.out.println(calc.exponent());
        }
    }
}
