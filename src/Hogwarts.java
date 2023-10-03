public abstract class Hogwarts {

    private String name;
    private int wizardry, teleportation;

    public Hogwarts(String name, int wizardry, int teleportation) {
        this.name = name;
        this.wizardry = wizardry;
        this.teleportation = teleportation;
    }

    public String getName() {
        return name;
    }

    public int getWizardry() {
        return wizardry;
    }

    public void setWizardry(int wizardry) {
        this.wizardry = wizardry;
    }

    public int getTeleportation() {
        return teleportation;
    }

    public void setTeleportation(int teleportation) {
        this.teleportation = teleportation;
    }

    @Override
    public String toString() {
        return name + " - колдовство " + wizardry + ", трангрессирование " + teleportation;
    }

    public void print() {
        System.out.println(this);
    }

    public static void compare(Hogwarts student1, Hogwarts student2) {
        int summ1 = student1.wizardry + student1.teleportation;
        int summ2 = student2.wizardry + student2.teleportation;
        if (summ1 > summ2) {
            System.out.println(student1.getName() + " обладает большей силой магии, чем " + student2.getName());
        } else if (summ1 < summ2) {
            System.out.println(student2.getName() + " обладает большей силой магии, чем " + student1.getName());
        } else System.out.println(student1.getName() + " и " + student2.getName() + " равны по силе магии");
    }
}
