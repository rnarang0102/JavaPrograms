public class NumberOfDigits {

    public static void main(String[] args)
    {
       NumberOfDigits numberOfDigits = new NumberOfDigits();
       numberOfDigits.numberOfDigits();
    }
    void numberOfDigits() {
        int number = 690;
        int count = 0;
        if(number<0) {
            number = number*-1;
        }
        if(number==0)
        {
            count =1;
        }
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);

    }

}
