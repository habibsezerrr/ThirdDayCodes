public class StudentCreditManager extends BaseCreditManager{

    public double calculate (double amount) { //calculate metodu student class'ı için  ezildi (override)

        return amount * 1.10;
    }
}
