public class Fibnocci {
    public static void main(String[] args)
    {
        Fibnocci fibnocci = new Fibnocci();
        fibnocci.fibnocciMethod();

    }
    void fibnocciMethod() {
        int num1 = 0;
        int num2 = 1;
        int num3 ;
        int number = 10;

        for( int i =0 ; i<= number; i++)
        {   System.out.print(num1 + " ");
            num3 = num2 +num1;
            num1 = num2;
            num2=num3;


        }

    }
}
