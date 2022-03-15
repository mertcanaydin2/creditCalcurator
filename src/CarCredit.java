public class CarCredit implements Credit{
    @Override
    public void calculate(int amount, int year) {
        System.out.println("Araba Kredisi Hesaplamanız : "+ (amount+(amount*0.18)*year));

    }
}
