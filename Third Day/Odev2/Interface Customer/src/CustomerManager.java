public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {

        /*
        OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
        Üst satırda bağımlı bir durum oluşturduk. Sistem sadece oracle
        için çalışıyor. ICustomerDal customerDal; Yazmak daha iyi
         */
        customerDal.add();
    }
}
