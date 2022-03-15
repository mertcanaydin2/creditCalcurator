import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Credit> credits=new ArrayList();
        credits.add(new NeedCredit());
        credits.add(new CarCredit());
        credits.add(new OfficerCredit());

        CreditManager creditManager=new CreditManager(credits);
        creditManager.hesaplama(50000,2);





    }



}
