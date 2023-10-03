public class Ravenclaw extends Hogwarts {
    private int cleverness, wittness, wisdom, creativity;

    public Ravenclaw(String name, int wizardry, int teleportation, int cleverness, int wittness, int wisdom, int creativity) {
        super(name, wizardry, teleportation);
        this.cleverness = cleverness;
        this.wittness = wittness;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWittness() {
        return wittness;
    }

    public void setWittness(int wittness) {
        this.wittness = wittness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", ум " + cleverness
                + ", мудрость " + wisdom
                + ", остроумие " + wittness
                + ", креативность " + creativity
                + ", факультет - Когтевран";
    }

    public static void compare(Ravenclaw student1, Ravenclaw student2) {
        int summ1 = student1.cleverness + student1.wisdom + student1.wittness + student1.creativity;
        int summ2 = student2.cleverness + student2.wisdom + student2.wittness + student2.creativity;
        if (summ1 > summ2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (summ1 < summ2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else
            System.out.println(student1.getName() + " и " + student2.getName() + " набрали одинаковое количество баллов");
    }
}
