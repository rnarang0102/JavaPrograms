public class Swap {
    public static void main(String[] args)
    {
        Swap swap = new Swap();
        swap.swapMethod();
    }
    void swapMethod()
    {
        int a =10;
        int b = 20;
        a = a+ b; //30
       b  = a-b;// 30-20 = 10
        a = a -b; // 30-10 = 20
        System.out.println("Swapped Values are : " + a + " " + b);

    }
}
