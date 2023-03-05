package homework_1;

public class Main {
    public static void main(String[] args) {
        // 1.
        System.out.println(zadanie1_1.calc_netto(1020.0,0.17));

        // 2.
        zadanie1_2.fifoExample();

        // 3.
        zadanie1_3.appendText("some text");

        // 4.
        Zajecia zajecia = new Zajecia();
        zajecia.enrollStudent("Szymon 1");
        zajecia.enrollStudent("Szymon 2");
        zajecia.enrollStudent("Szymon 3");
        zajecia.enrollStudent("Szymon 4");
        zajecia.enrollStudent("Szymon 5");
        zajecia.enrollStudent("Szymon 6");
        zajecia.enrollStudent("Szymon 7");
        zajecia.enrollStudent("Szymon 8");
        zajecia.enrollStudent("Szymon 9");
        zajecia.enrollStudent("Szymon 10");
        zajecia.enrollStudent("Szymon 11");
        System.out.println(zajecia);


        System.out.println(zajecia);

    }
}