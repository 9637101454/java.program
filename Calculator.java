import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a= sc.nextDouble();

        System.out.println("Enter second number:");
        double b= sc.nextDouble();
    
        System.out.println("Choose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4.Division");
    
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Sum:" +(a+b));
                break;

            case 2:
                System.out.println("Subtract:" +(a-b));
                break;

            case 3:
                System.out.println("Multi:" +(a*b));
                break;

            case 4:
                if(b !=0) {
                    System.out.println("Div:" +(a/b));
                }else {
                    System.out.println("Error: Div by zero!");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();

    }
}


    
