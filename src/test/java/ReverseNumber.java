public class ReverseNumber {

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        reverseNumber.reverseMethod();
    }

    void reverseMethod() {
        int number = 56789;
        int revnumber = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            revnumber = revnumber * 10 + digit;
            number = number / 10;
        }
        System.out.println(revnumber);
    }
}
