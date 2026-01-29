package controller;

import java.util.Scanner;

public class InputHandler {
    /*
    Provides centralized access to Scanner for the entire project
    */
    public static final Scanner SC = new Scanner(System.in);

    public static int nextInt(String msg) {
        return SC.nextInt();
    }
    public static String next(String msg) {
        return SC.next();
    }
    public static double nextDouble(String msg) {
        return SC.nextDouble();
    }
    public static void closeScanner() {
        SC.close();
    }

}
