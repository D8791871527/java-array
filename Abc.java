import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no:");
        int a = sc.nextInt();
        System.out.println("enter the second no:");
        int b = sc.nextInt();
        System.out.println("the operation in");
        char o = sc.next().charAt(0);

        switch (o) {
            case '+': {
                System.out.println("sum is:" + (a + b));
                break;
            }

            case '-': {
                System.out.println("subtract is:" + (a - b));
                break;
            }

            case '*': {
                System.out.println("mul is:" + (a * b));
                break;
            }

            case '%': {
                System.out.println("div is:" + (a % b));
                break;
            }
            case '/': {
                System.out.println("sum is:" + (a / b));
                break;
            }
            default: {
                System.out.println("choice wrong:");
            }
        }

    }
}
