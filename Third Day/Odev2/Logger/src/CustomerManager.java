public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;

    }

    public void add() {

        System.out.println("Müşteri eklendi...");
        this.baseLogger = baseLogger;

        /* Yapılmaması gereken kod dizimi
        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.Log("Log mesajı");
         */
    }
}
