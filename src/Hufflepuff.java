public class Hufflepuff extends Hogwarts {
    private int diligence, loyalty, honesty;

    public Hufflepuff(String name, int wizardry, int teleportation, int diligence, int loyalty, int honesty) {
        super(name, wizardry, teleportation);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", трудолюбие " + diligence
                + ", верность " + loyalty
                + ", честность " + honesty
                + ", факультет - Пуффендуй";
    }

    public static void compare(Hufflepuff student1, Hufflepuff student2) {
        int summ1 = student1.diligence + student1.loyalty + student1.honesty;
        int summ2 = student2.diligence + student2.loyalty + student2.honesty;
        if (summ1 > summ2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (summ1 < summ2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else
            System.out.println(student1.getName() + " и " + student2.getName() + " набрали одинаковое количество баллов");
    }
}
