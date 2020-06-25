import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Figures {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            Integer[] figures = new Integer[2];
            List<Figure> list = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                figures[0] = sc.nextInt();
                figures[1] = sc.nextInt();
                list.add(new Figure(figures));
            }
            System.out.println(list);
        }
    }
}

class Figure {
    private Integer[] figures = new Integer[2];

    public Figure(Integer[] figures) {
        this.figures = figures;
    }

    public Integer[] getFigures() {
        return figures;
    }

    public void setFigures(Integer[] figures) {
        this.figures = figures;
    }
}