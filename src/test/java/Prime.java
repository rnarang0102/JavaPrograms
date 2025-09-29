import java.util.Scanner;

public class Prime {

    public static void main(String[] args)
    {
        Prime prime = new Prime();
        prime.primeMethod();

    }
    void primeMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which you want to check for Prime:");
        int number = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
            if (flag == true) System.out.println("NOT Prime");
            else System.out.println("Prime");

    }
}
