public class NeedCredit implements Credit{


    @Override
    public void calculate(int amount, int year) {
        System.out.println("ihtiyaç Kredisi Hesaplamanız : "+ (amount+(amount*0.21)*year));

    }
}
