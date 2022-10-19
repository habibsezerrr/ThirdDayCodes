public class Manager extends Workers{

    private int numberofPeopleResponsible;

    public Manager(String name, String surname, int id, int numberofPeopleResponsible) {
        super(name, surname, id);
        this.numberofPeopleResponsible = numberofPeopleResponsible;
    }

    @Override
    public void informationShow() {
        super.informationShow();
        System.out.println("Yöneticinin sorumluluğu altındaki kişi: " + numberofPeopleResponsible);
    }

    public void wageIncrease(int amount) {
        System.out.println(getName() + " çalışanlara " + amount + "$ zam yaptı...");
    }
}
