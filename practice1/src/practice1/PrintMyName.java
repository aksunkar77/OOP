package practice1;

public class PrintMyName {

    public static void main(String[] args) {

        String name = "Aksu";

        int innerWidth = name.length() + 2;

        String line = "";

        for (int i = 0; i < innerWidth; i++) {
            line += "-";
        }

        String topBottom = "+" + line + "+";
        String middle = "| " + name + " |";

        System.out.println(topBottom);
        System.out.println(middle);
        System.out.println(topBottom);
    }
}

