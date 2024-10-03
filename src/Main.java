public class Main {
    public static void main(String[] args)
    {
       int credCardBal = 5000;
       double interestRate = .17;
       double oneMonth = 0;
       double twoMonth = 0;

       oneMonth = credCardBal * interestRate;
       twoMonth = oneMonth * interestRate;

        System.out.println(" Your total Balance after one month is $" + oneMonth + " Your total Balance after two months " + twoMonth);

    }
}