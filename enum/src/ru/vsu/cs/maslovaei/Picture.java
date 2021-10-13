package ru.vsu.cs.maslovaei;

public class Picture {

    public static final Line L1 = new Line(0, -15.5, 2.5);
    public static final Parabola P1 = new Parabola(-5, -5, 0.5);
    public static final HorizontalParabola P2 = new HorizontalParabola(-2, 4, -1);


    public static SimpleColor getColor(double x, double y) {

        if (P1.isPointAboveParabola(x, y)) {
            return SimpleColor.GRAY;
        }
        if (!P2.isPointLeftOfParabola(x, y) && !P1.isPointAboveParabola(x, y) && x < 5 && y > 3) {
            return SimpleColor.WHITE;
        }
        if (P2.isPointLeftOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.BLUE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, getColor(x, y));
    }
}