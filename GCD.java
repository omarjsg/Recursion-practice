import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
    	findGCD();
    }
     private static void findGCD()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thefirst integer number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second integer number: ");
        int num2 = scanner.nextInt();
        int gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }
        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
        scanner.close();
    }
  }