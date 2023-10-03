public class Gryffindor extends Hogwarts {
    private int nobility, honor, bravery;

    public Gryffindor(String name, int wizardry, int teleportation, int nobility, int honor, int bravery) {
        super(name, wizardry, teleportation);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", благородство " + nobility
                + ", честь " + honor
                + ", храбрость " + bravery
                + ", факультет - Гриффиндор";
    }

    public static void compare(Gryffindor student1, Gryffindor student2) {
        int summ1 = student1.nobility + student1.honor + student1.bravery;
        int summ2 = student2.nobility + student2.honor + student2.bravery;
        if (summ1 > summ2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (summ1 < summ2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else
            System.out.println(student1.getName() + " и " + student2.getName() + " набрали одинаковое количество баллов");
    }
}
