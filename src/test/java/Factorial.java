public class Factorial {
    public static void main(String[] args)
    {
        Factorial factorial = new Factorial();
        factorial.factorialMethod();

    }
    void factorialMethod() {
        int number =6;
        int multiply = 1;
        for(int i =1; i<=number; i++)
        {
            multiply=multiply*i;
        }
        System.out.println(multiply);
    }
}
