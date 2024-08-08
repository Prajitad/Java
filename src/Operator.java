import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner operate = new Scanner(System.in);

        System.out.println("Enter value of a:");
        int a = operate.nextInt();

        System.out.println("Enter value of b:");
        int b = operate.nextInt();

        System.out.println("Enter operation'+,- ,* ,/,%':");
        char operator = operate.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Sum:" + (a + b));
                break;

            case '-':
                System.out.println("Difference:" + (a - b));
                break;

            case '*':
                System.out.println("Multiply:" + (a * b));
                break;

            case '/':
                System.out.println("Division:" + (a / b));
                break;
            case '%':
                System.out.println("Modulus:" + (a % b));
                break;
            default:
                System.out.println("Invalid");


        }
    }
}



//Another technique
//
//import java.util.Scanner;
//public class operator
//{
//    public static void main(String[] args) {
//        Scanner operate = new Scanner(System.in);
//
//        System.out.println("Enter value of a:");
//        int a = operate.nextInt();
//
//        System.out.println("Enter value of b:");
//        int b = operate.nextInt();
//
//        System.out.println("sum:" + (a + b));
//        System.out.println("sub: " + (a - b));
//        System.out.println("mul:"  + ( a*b ));
//        System.out.println("div:" + ( a/b ));
//
//    }
//}
//


