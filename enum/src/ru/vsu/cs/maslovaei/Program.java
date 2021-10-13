package ru.vsu.cs.maslovaei;

import java.util.Locale;
import java.util.Scanner;

import static ru.vsu.cs.maslovaei.Picture.printColorForPoint;
import static ru.vsu.cs.maslovaei.Test.doTest;

public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        doTest();

        double x = readNum("Input x: ");
        double y = readNum("Input y: ");

        printColorForPoint(x, y);
    }

    private static double readNum(String text) {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
