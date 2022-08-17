package service;

public class Printer {
    public static void printTable() {
        for (int i = 0; i < Menu.menu1.length; i++) {
            System.out.print(Menu.menu1[i]);
            System.out.println();
        }
    }
}
