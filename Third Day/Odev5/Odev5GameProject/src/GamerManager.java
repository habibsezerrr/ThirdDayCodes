public class GamerManager implements IGamerService{

    IUserValidationService iUserValidationService;

    public GamerManager(IUserValidationService iUserValidationService) {
        this.iUserValidationService = iUserValidationService;
    }

    @Override
    public void add(Gamer gamer) {
        if (iUserValidationService.validate(gamer)) {
            System.out.println("Kayıt Oluştu...");
        }
        else {
            System.out.println("Doğrulama Başarısız. Kayıt başarısız...");
        }
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Kayıt Silindi...");
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Kayıt Güncellendi...");
    }
}
