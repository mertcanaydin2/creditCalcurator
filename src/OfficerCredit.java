public class OfficerCredit implements Credit{
    @Override
    public void calculate(int amount, int year) {
        System.out.println("Ofis Kredisi Hesaplamanız : "+ (amount+(amount*0.20)*year));

    }
}
