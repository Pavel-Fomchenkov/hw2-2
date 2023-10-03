public class Main {
    public static void main(String[] args) {

        Gryffindor garryPotter = new Gryffindor("Гарри Поттер", 50, 10, 60, 45, 70);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 80, 75, 35, 80, 25);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 25, 30, 35, 70, 40);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 35, 70, 80, 50, 90, 35, 90);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 25, 35, 50, 40, 75, 45, 80);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 10, 68, 70, 48, 60, 47, 75);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 47, 80, 46, 54, 51);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 35, 73, 66, 60, 53);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 41, 66, 59, 61, 61);
        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 77, 68, 42, 25, 33, 55);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 69, 63, 35, 31, 45, 69);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 71, 57, 41, 27, 42, 77);

        System.out.println("");

        garryPotter.print();
        cedricDiggory.print();
        choChang.print();
        grahamMontague.print();

        System.out.println("");

        Gryffindor.compare(hermioneGranger, ronWeasley);
        Slytherin.compare(dracoMalfoy, gregoryGoyle);
        Hufflepuff.compare(justinFinchFletchley, cedricDiggory);
        Ravenclaw.compare(padmaPatil, marcusBelby);

        System.out.println("");

        Hogwarts.compare(dracoMalfoy, zachariasSmith);
    }
}