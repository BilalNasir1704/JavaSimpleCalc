import java.util.Scanner;

public class CalcSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getting numbers form the user
        System.out.println("Enter the 1st number");
        double x1 = scanner.nextDouble();

        System.out.println("Enter the 2nd number");
        double y1 = scanner.nextDouble();

        //getting the operation from user
        System.out.println("Choose the operation you want to do (+, - , * , / ):");
        char operator = scanner.next().charAt(0);

        //compute and produce the answer
        double result=0;
        switch (operator) {
            case '+':
                result = x1 + y1;
                break;
            case '-':
                result = x1 - y1;
                break;
            case '*':
                result = x1 * y1;
                break;
            case '/':
                result = x1 /y1;
                break;
            default:
               System.out.println("Invalid operator");
        }
        //this presents the answer form the computation done;
        System.out.println("The result is " + result);
    }
}
