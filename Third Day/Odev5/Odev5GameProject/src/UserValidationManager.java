public class UserValidationManager implements IUserValidationService{

    @Override
    public boolean validate(Gamer gamer) {

        return gamer.BirthYear == 1997 && gamer.FirstName.equals("Habib") && gamer.LastName.equals("Sezer");
    }
}
