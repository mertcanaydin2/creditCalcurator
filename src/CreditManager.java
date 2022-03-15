import java.util.List;

public class CreditManager {
    private List<Credit> credit;

    public CreditManager(List<Credit> credit) {
        this.credit = credit;
    }

    public void hesaplama(int amount, int year) {
        for (Credit credits : credit) {
            credits.calculate(amount, year);
        }
        if(credit.isEmpty()){
            System.out.println("En az bir tane kredi hesaplama türü seçin.");
        }

    }
}
