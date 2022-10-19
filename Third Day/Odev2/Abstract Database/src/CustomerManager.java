public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers() {

        /*
        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        oracleDatabaseManager.getData();
        tavsiye edilmeyen bir yazımdır. Artık OracleDatabaseManager'a bağımlıyız
        Onun yerine yukarıda BaseDatabaseManager databaseManager; yazıp
        onun aracılığıyla diğer database'lere erişeceğiz
         */

        databaseManager.getData();
    }
}
