public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        // customerManager.add(); hata verir, aşağıdaki gibi yapmalıyız
        customerManager.add();
    }
}
