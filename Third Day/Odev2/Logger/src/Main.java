public class Main {

    public static void main(String[] args) {

        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("Log mesajı...");
        //çıktı --> Default logger: Log mesajı...

        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};

        for (BaseLogger logger : loggers) {
            logger.Log("Log mesajı");
        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
        /*
        burada file'ye loglamak yerine başka birşeye loglamak istersek
        kod silmek ve uğraşmak yerine direkt parantez içiyle uğraşacağız
         */

    }
}
