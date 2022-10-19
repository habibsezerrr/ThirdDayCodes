import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Çalışanlara hoşgeldiniz");
        String islemler = "işlemler\n" +
                "1. yazılımcı işlemleri\n" +
                "2. yönetici işlemleri\n" +
                "çıkış için q a basın";
        System.out.println("**********");
        System.out.println(islemler);
        System.out.println("**********");

        while (true) {
            System.out.println("İşlemi seç: ");
            String islem = s.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else if (islem.equals("1")) {
                Developer developer = new Developer("habib", "sezer", 555, "python, java");
                String yazilimciislem = "1. format at\n" +
                        "2. bilgileri göster\n" +
                        "çıkış için q ";
                System.out.println(yazilimciislem);
                while (true) {
                    System.out.println("İşlemi seçiniz: ");
                    String y_islem = s.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.println("İşletim sistemi: ");
                        String isletimsistemi = s.nextLine();
                        developer.formatIt(isletimsistemi);
                    }
                    else if (y_islem.equals("2")) {
                        developer.informationShow();
                    }
                    else {
                        System.out.println("Geçersiz yazılımcı işlemi");
                    }

                }
            }
            else if (islem.equals("2")) {
                Manager manager = new Manager("habib", "sezer", 123, 10);
                String yoneticiislem = "Yönetici işlemleri\n" +
                        "1. zam yap\n" +
                        "2. bilgileri göster\n" +
                        "çıkış için q a basın";
                System.out.println(yoneticiislem);

                while (true) {
                    System.out.println("İşlem seç: ");
                    String y_islem = s.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden çıkılıyor");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.println("Ne kadar zam?: ");
                        int amount = s.nextInt();
                        s.nextLine();
                        manager.wageIncrease(amount);
                    }
                    else if (y_islem.equals("2")) {
                        manager.informationShow();
                    }
                    else {
                        System.out.println("Geçersiz işlem");
                    }
                }
            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
    }


}
