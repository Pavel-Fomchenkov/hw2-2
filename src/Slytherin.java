public class Slytherin extends Hogwarts {
    private int cunning, determination, ambitiousness, resourcefulness, desireForPower;

    public Slytherin(String name, int wizardry, int teleportation, int cunning, int determination, int ambitiousness, int resourcefulness, int desireForPower) {
        super(name, wizardry, teleportation);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getDesireForPower() {
        return desireForPower;
    }

    public void setDesireForPower(int desireForPower) {
        this.desireForPower = desireForPower;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", хитрость " + cunning
                + ", решительность " + determination
                + ", амбициозность " + ambitiousness
                + ", находчивость " + resourcefulness
                + ", жажда власти " + desireForPower
                + ", факультет - Слизерин";
    }

    public static void compare(Slytherin student1, Slytherin student2) {
        int summ1 = student1.cunning + student1.determination + student1.ambitiousness + student1.resourcefulness + student1.desireForPower;
        int summ2 = student2.cunning + student2.determination + student2.ambitiousness + student2.resourcefulness + student2.desireForPower;
        if (summ1 > summ2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (summ1 < summ2) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else
            System.out.println(student1.getName() + " и " + student2.getName() + " набрали одинаковое количество баллов");
    }
}
