package util;

import java.util.Scanner;

public class Input {
    /*
    * Classe Centraliza o Scanner e melhora seu uso nas outras classes.
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
    public static void fechar() {
        SC.close();
    }

}
