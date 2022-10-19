public class Developer extends Workers {

    private String skills;

    public Developer(String name, String surname, int id, String skills) {
        super(name, surname, id);
        this.skills = skills;
    }

    public void formatIt(String os) {
        System.out.println(getName() + " " + os + "ni yüklüyor...");
    }

    @Override
    public void informationShow() {
        super.informationShow();
        System.out.println("Yazılımcının bildiği diller: " + skills);
    }
}
