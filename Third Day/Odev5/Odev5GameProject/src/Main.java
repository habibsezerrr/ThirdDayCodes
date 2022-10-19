public class Main {

    public static void main(String[] args) {

        GamerManager gamerManager = new GamerManager(new UserValidationManager());

        gamerManager.add(new Gamer(1,"Habib","Sezer",1997,258025580));

    }
}
